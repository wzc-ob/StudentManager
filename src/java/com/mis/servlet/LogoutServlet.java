/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mis.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 陈浩
 */
@WebServlet(name = "LogoutServlet", urlPatterns = {"/LogoutServlet"})
public class LogoutServlet extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
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
        request.getSession().removeAttribute("userd");
         //移除存储在session中的user对象，实现注销功能
         request.getSession().invalidate();
         //由于字符串中包含有单引号，在这种情况下使用MessageFormat.format方法拼接字符串时就会有问题
        //MessageFormat.format方法只是把字符串中的单引号去掉，不会将内容填充到指定的占位符中
       /*  String tempStr1 = MessageFormat.format(
                 "注销成功！！3秒后为您自动跳到登录页面！！<meta http-equiv='refresh' content='3;url={0}'/>", 
                 request.getContextPath()+"/servlet/LoginUIServlet");
         System.out.println(tempStr1);//输出结果：注销成功！！3秒后为您自动跳到登录页面！！<meta http-equiv=refresh content=3;url={0}/>
         System.out.println("---------------------------------------------------------"); */
         /**
          * 要想解决"如果要拼接的字符串包含有单引号，那么MessageFormat.format方法就只是把字符串中的单引号去掉，不会将内容填充到指定的占位符中"这个问题，
          * 那么可以需要使用单引号引起来的字符串中使用2个单引号引起来，例如："<meta http-equiv=''refresh'' content=''3;url={0}''/>"
          * 这样MessageFormat.format("<meta http-equiv=''refresh'' content=''3;url={0}''/>","index.jsp")就可以正常返回
          * <meta http-equiv=''refresh'' content=''3;url=index.jsp'/>
          */
         String tempStr2 = MessageFormat.format(
                 "注销成功！！1秒后为您自动跳到登录页面！！<meta http-equiv=''refresh'' content=''1;url={0}''/>", 
                 request.getContextPath()+"/LoginUIServlet");
         /**
          * 输出结果：
          * 注销成功！！3秒后为您自动跳到登录页面！！
          */
         System.out.println(tempStr2);
         
        String message = String.format(
                 "注销成功！！1秒后为您自动跳到登录页面！！<meta http-equiv='refresh' content='1;url=%s'/>", 
                 request.getContextPath()+"/LoginUIServlet");
         request.setAttribute("message",message);
        request.getRequestDispatcher("/message.jsp").forward(request, response);
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
        doGet(request, response);
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
