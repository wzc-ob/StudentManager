package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>教学管理系统</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/default.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\n");
      out.write("        <!--[if IE]>\n");
      out.write("                <script src=\"http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("        ");

            String utype = request.getParameter("utype");
        
      out.write("\n");
      out.write("        <div class=\"htmleaf-container\">\n");
      out.write("            <header class=\"htmleaf-header\">\n");
      out.write("                <h1>教学管理系统</h1>\n");
      out.write("              \n");
      out.write("            </header>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h1>Welcome</h1>\n");
      out.write("                    <form method=\"post\" action=\"LoginServlet\" class=\"form-auto\" align=\"center\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"field \">\n");
      out.write("                                <input type=\"text\" class=\"input\" id=\"userid\" name=\"userid\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userd.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" size=\"30\" placeholder=\"用户账号\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"field \">\n");
      out.write("                                <input type=\"password\" class=\"input\" id=\"passwordr\" name=\"passwordr\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userd.passwordr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" size=\"30\" placeholder=\"密码\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <select name=\"utype\">\n");
      out.write("                            <option value=\"1\" ");
      out.print( "1".equals(utype) ? "selected='selected'" : "");
      out.write(">教师</option>\n");
      out.write("                            <option value=\"2\" ");
      out.print( "2".equals(utype) ? "selected='selected'" : "");
      out.write(">学生</option>\n");
      out.write("                        </select>\n");
      out.write("                        <div class=\"form-button\">\n");
      out.write("                            <button class=\"button\" type=\"submit\">\n");
      out.write("                                Login</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"bg-bubbles\">\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"http://libs.useso.com/js/jquery/2.1.1/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/jquery-2.1.1.min.js\"><\\/script>')</script>\n");
      out.write("        <script>\n");
      out.write("            $('#login-button').click(function (event) {\n");
      out.write("                event.preventDefault();\n");
      out.write("                $('form').fadeOut(500);\n");
      out.write("                $('.wrapper').addClass('form-success');\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
