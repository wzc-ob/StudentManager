/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.servlet;

import com.mis.model.Userd;
import com.mis.service.IUserdService;
import com.mis.service.impl.UserdServiceImpl;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //获取用户填写的登录用户名
        String userid = request.getParameter("userid");
        //获取用户填写的登录密码
        String passwordr = request.getParameter("passwordr");
        //获取用户选择的种类
        String utype = request.getParameter("utype");
        IUserdService service = new UserdServiceImpl();
        //用户登录
        Userd userd = service.loginUserd(userid, passwordr, utype);

        if (userd == null) {
            String message = String.format(
                    "对不起，用户名或密码有误！！请重新登录！1秒后为您自动跳到登录页面！！<meta http-equiv='refresh' content='1;url=%s'",
                    request.getContextPath() + "/LoginUIServlet");
            request.setAttribute("message", message);
            request.getRequestDispatcher("/message.jsp").forward(request, response);
            return;
        }
        //登录成功后，就将用户存储到session中
        request.getSession().setAttribute("userd", userd);
        if ("1".equals(utype)) {
            /*String message = String.format(
				"恭喜：%s,登陆成功！本页将在1秒后跳到首页！！<meta http-equiv='refresh' content='1;url=%s'", 
				userd.getUserid(),
				request.getContextPath()+"/teachers.jsp");
		request.setAttribute("message",message);
		request.getRequestDispatcher("/message.jsp").forward(request, response);*/
            request.getRequestDispatcher("/teachers.jsp").forward(request, response);
            request.getSession().setAttribute("userid", userid);
            response.sendRedirect("/teainfo.jsp");
            response.sendRedirect("/teaseekcourse.jsp");
        } else if ("2".equals(utype)) {
            /* String message = String.format(
				"恭喜：%s,登陆成功！本页将在1秒后跳到首页！！<meta http-equiv='refresh' content='0;url=%s'", 
				userd.getUserid(),
				request.getContextPath()+"/studentes.jsp");
		request.setAttribute("message",message);
		request.getRequestDispatcher("/message.jsp").forward(request, response);*/
            request.getRequestDispatcher("/studentes.jsp").forward(request, response);
            request.getSession().setAttribute("userid", userid);
            response.sendRedirect("/studentes.jsp");
            response.sendRedirect("/seekcourse.jsp");
            response.sendRedirect("/choosecourse.jsp");
        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
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
    /* @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }*/

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }*/
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
