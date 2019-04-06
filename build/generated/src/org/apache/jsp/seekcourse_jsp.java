package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class seekcourse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/stu_header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/tea_lefter.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/stu_footer.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh-cn\">\n");
      out.write("    <head>\n");
      out.write("        <title>课程界面</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/pintuer.css\">\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/pintuer.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function delConf() {\n");
      out.write("                var tip = \"你是否要不选择该课程？\";\n");
      out.write("                if (confirm(tip))\n");
      out.write("                    return true;\n");
      out.write("                else\n");
      out.write("                    return false;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--首部开始-->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"layout bg-black bg-inverse hidden-l\">\n");
      out.write("    <div class=\"container-layout height-big\">\n");
      out.write("        <span class=\"float-right\"> \n");
      out.write("            <a href=\"LogoutServlet\">退出登录</a> <span class=\"text-little text-gray\">|</span> \n");
      out.write("            <a href=\"#\">联系</a>\n");
      out.write("        </span>\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container-layout padding-big-top padding-big-bottom bg-green bg-inverse\">\n");
      out.write("    <div class=\"line\">\n");
      out.write("        <div class=\"xl12 xs2 xm2 xb1\">\n");
      out.write("            <button class=\"button icon-navicon float-right bg-white\" data-target=\"#header-demo4\">\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\" xl12 xs10 xm10 xb11 padding-top nav-navicon\" id=\"header-demo4\">\n");
      out.write("            <div class=\"xs8 xm8 xb6\">\n");
      out.write("                <ul class=\"nav nav-menu nav-inline nav-pills\">\n");
      out.write("\n");
      out.write("                    <li class=\"active\"><a href=\"StuDisplayServlet\">学生信息管理<span class=\"arrow\"></span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"active\" ><a href=\"CouDisplayServlet\">课程信息管理<span class=\"arrow\"></span></a> \n");
      out.write("                        <ul class=\"drop-menu\">\n");
      out.write("                            <li><a href=\"seekcourse.jsp\">查询个人课程信息</a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"active\" ><a href=\"ChooseDisplayServlet\">选课信息管理<span class=\"arrow\"></span></a> \n");
      out.write("                        <ul class=\"drop-menu\">\n");
      out.write("                            <li><a href=\"choosecourse.jsp\">选课</a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <!--首部结束-->\n");
      out.write("\n");
      out.write("        <!--内容开始-->\n");
      out.write("        <div class=\"container-layout padding-big-top padding-big-bottom\">\n");
      out.write("            <div class=\"line\">\n");
      out.write("                <div class=\"xl12 xs3 xm3 xb3\">\n");
      out.write("                    <!--左边部分-->\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"collapse-toggle\">\n");
      out.write("    <div class=\"panel\">\n");
      out.write("        <div class=\"panel-head\">\n");
      out.write("            <h4>\n");
      out.write("                汽院介绍</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            湖北汽车工业学院是一所具有深厚工程背景、全国唯一以汽车命名的省属普通本科高校，也是湖北省“园林式校园”、湖北省“最佳文明单位”。坐落于世界著名道教文化圣地武当山北麓、汉江秀水之滨、南水北调源头、中国商用车之都的湖北省十堰市。</div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel\">\n");
      out.write("        <div class=\"panel-head\">\n");
      out.write("            <h4>\n");
      out.write("                电气与信息工程学院</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            电气与信息工程学院成立于2009年1月，是由原电气工程系、电子信息科学系和计算中心三个单位进行学科整合，实现优势互补、资源共享的结晶，是我校工科电类重点建设的学科之一。学院坚持“以人为本、和谐发展、务实创新、学术至上”的工作方针，以教学、科研为中心，以特色学科建设为重点，为社会、行业和区域经济的建设与发展培养更多合格的高级应用型人才而努力。 \n");
      out.write("\n");
      out.write("            学院设有三个系：电气工程系、电子信息工程系、计算机工程系，两个研究所：汽车信息控制与网络技术研究所、汽车智能制造研究所。下设自动化、电气工程及其自动化、电子信息科学与技术、电子信息工程、计算机科学与技术、软件工程6个本科专业，其中，自动化专业为省级品牌专业。2个湖北省战略性新兴产业计划：自动化、电子信息工程。 </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel\">\n");
      out.write("        <div class=\"panel-head\">\n");
      out.write("            <h4>\n");
      out.write("                人才培养</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            学校开办全日制本科教育始于1978年，起初设置机械制造专业、工业电气自动化专业、汽车设计与制造等专业，截至目前已开办全日制本科专业34个，在校全日制本科生约9200人，形成了以工为主，工、管、经、文、理、法、艺多学科协调发展的良好局面。  \n");
      out.write("            依据办学定位，学校以国家倡导创新创业教育提出的明确要求为指导，以汽车行业转型升级发展及湖北经济社会发展对人才的需求为导向，以学生发展为出发点与落脚点，遵循学生成长成才规律，紧密结合自身办学传统、办学优势和办学特色，确定了人才培养总目标：培养专业基础知识扎实，工程实践能力强，具有创新精神和创业意识，面向生产、经营、管理一线的高级专门应用型人才。</div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel\">\n");
      out.write("        <div class=\"panel-head\">\n");
      out.write("            <h4>\n");
      out.write("                关于作者</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            姓名：陈浩\n");
      out.write("            班级：软件151\n");
      out.write("            学号：201500754\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--左边部分结束-->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"xl12 xs8 xs1-move xm8 xm1-move xb8 xb1-move\">\n");
      out.write("                    <!--右边部分-->\n");
      out.write("\n");
      out.write("                    <div class=\"banner\">\n");
      out.write("                        <div class=\"carousel\">\n");
      out.write("                            <div class=\"item\"><img src=\"images/1.jpg\" alt=\"图片1\" title=\"校园风光1\" width=\"100%\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\"><img src=\"images/2.jpg\" alt=\"图片2\" title=\"校园风光2\"  width=\"100%\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\"><img src=\"images/3.jpg\" alt=\"图片3\" title=\"校园风光3\"  width=\"100%\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--表格开始-->\n");
      out.write("                    <table class =\"table table-bordered margin-big-top table table-hover table table-striped\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>课程编号</th>\n");
      out.write("                            <th>课程名称</th>\n");
      out.write("                            <th>学分</th>\n");
      out.write("                            <th>成绩</th>\n");
      out.write("                            <th>上课教室</th>\n");
      out.write("                            <th>任课老师</th>\n");
      out.write("                            <th>功能</th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pagination.pageBar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pagination.numPageBar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!--表格结束-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--内容结束-->\n");
      out.write("        <!--尾部开始-->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"navbar  bg-green bg-inverse radius clearfix\">\n");
      out.write("        <div class=\"navbar-head\">\n");
      out.write("            <button class=\"button bg-white icon-navicon\" data-target=\"#navbar-foot1\">\n");
      out.write("            </button>\n");
      out.write("            <a href=\"#\">         \n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar-body nav-navicon\" id=\"navbar-foot1\">\n");
      out.write("            <ul class=\"nav nav-inline nav-split\">\n");
      out.write("                <li><a href=\"#\">新闻资讯</a> </li>\n");
      out.write("                <li><a href=\"#\">产品中心</a> </li>\n");
      out.write("                <li><a href=\"#\">技术反馈</a> </li>\n");
      out.write("                <li><a href=\"#\">留言反馈</a> </li>\n");
      out.write("                <li><a href=\"#\">联系方式</a> </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <button class=\"button win-back icon-arrow-left\">\n");
      out.write("                    后退</button>\n");
      out.write("                <button class=\"button win-forward\">\n");
      out.write("                    前进 <span class=\"icon-arrow-right\"></span>\n");
      out.write("                </button>\n");
      out.write("                <button class=\"button win-backtop\">\n");
      out.write("                    返回顶部 <span class=\"icon-arrow-up\"></span>\n");
      out.write("                </button>\n");
      out.write("            </ul>\n");
      out.write("            <p class=\"navbar-right navbar-text hidden-s\">\n");
      out.write("                热线：187-7280-7550</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <br />\n");
      out.write("    <div class=\"text-center\">\n");
      out.write("        版权所有 © Pintuer.com All Rights Reserved，图ICP备：380959609</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <!--尾部结束-->\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userd!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            欢迎您：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userd.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" 登录\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coursetable}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("ct");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.cno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.ccredit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.grade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.classroom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.tname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>                                  \n");
          out.write("                                    <a href=\"ChooseDeleteServlet?cno=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.cno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" onclick=\"return delConf();\" class=\"button button-small border-red\"> <span class=\"icon-trash-o\"></span>取消</a>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
