/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.servlet;

import com.mis.model.Student;
import com.mis.util.DaoFactory;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 陈浩
 */
@WebServlet(name = "StuDisplayServlet", urlPatterns = {"/StuDisplayServlet"})
public class StuDisplayServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String sno = (String) request.getSession().getAttribute("userid");
        System.out.print(sno);
        Student stu = DaoFactory.getStudentDao().findStudente(sno);
        request.setAttribute("stu", stu);
        request.getRequestDispatcher("studentes.jsp").forward(request, response);
         //PrintWriter out = response.getWriter();
        //String pageNo = request.getParameter("pageNo");
        //int page = 1;
        //if (pageNo != null) {
        //    page = Integer.parseInt(pageNo);
        //}
        //Pagination pagination = new Pagination();
        //pagination.setPageNo(page);   
        //获取用户填写的登录用户名
        // session.setAttribute("userid", userid);	
        //DaoFactory.getUserdDao().getUserd(userid);
        //String sno = DaoFactory.getUserdDao().getUserd(userid);
        
        //List<Student> students = DaoFactory.getStudentDao().getAllStudent(pagination);
        //request.setAttribute("students", students);
        //request.setAttribute("pagination", pagination);
        //request.getRequestDispatcher("studentes.jsp").forward(request, response);
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
