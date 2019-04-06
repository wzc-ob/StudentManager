/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.servlet;

import com.mis.model.Teacher;
import com.mis.util.DaoFactory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 陈浩
 */
@WebServlet(name = "TeaUpdateServletDo", urlPatterns = {"/TeaUpdateServletDo"})
@MultipartConfig
public class TeaUpdateServletDo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tno = request.getParameter("tno").trim();
        String tname = request.getParameter("tname").trim();
        String tsex = request.getParameter("tsex").trim();
        String tpost = request.getParameter("tpost").trim();
        String tdept = request.getParameter("tdept").trim();
        Teacher teacher = new Teacher();
        try {
            teacher.setTno(tno);
            teacher.setTname(tname);
            teacher.setTsex(tsex);
            teacher.setTpost(tpost);
            teacher.setTdept(tdept);

            //存入新添加的学生记录
            boolean flag = DaoFactory.getTeacherDao().updateTeacher(teacher);
            if (flag) {
                response.sendRedirect(request.getContextPath() + "/TeaDisplayServlet");
            } else {
                //对发生的异常进行捕获，然后转发到输入页面，显示错误信息提示
                String errValue = "学生记录修改失败，请检查输入信息是否有误或与系统管理员联系！";
                request.setAttribute("message", errValue);
                request.setAttribute("teacher", teacher);
                request.getRequestDispatcher("teaupdate.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            //对发生的异常进行捕获，然后转发到输入页面，显示错误信息提示
            String errValue = "学生记录修改失败，请检查输入信息是否有误或与系统管理员联系！";
            request.setAttribute("message", errValue);
            request.setAttribute("teacher", teacher);
            request.getRequestDispatcher("teaupdate.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
