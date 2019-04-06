
<%@page import="java.util.List"%>
<%@page import="com.mis.util.DaoFactory"%>
<%@page import="com.mis.model.Student"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-cn">
    <head>
        <title>学生界面</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/pintuer.css">
        <script src="js/jquery.js"></script>
        <script src="js/pintuer.js"></script>

        <script type="text/javascript">
            function doLogout() {
                //访问LogoutServlet注销当前登录的用户
                window.location.href = "${pageContext.request.contextPath}/LogoutServlet";
            }
        </script>
    </head>
    <body>
        <!--首部开始-->
        <%@include file="WEB-INF/jspf/stu_header.jspf" %>
        <!--首部结束-->

        <!--内容开始-->
        <div class="container-layout padding-big-top padding-big-bottom table table-hover table table-striped">
            <div class="line">
                <div class="xl12 xs3 xm3 xb3">
                    <!--左边部分-->
                    <%@include file="WEB-INF/jspf/tea_lefter.jspf" %>
                  
                        <!--左边部分结束-->
                    </div>
                    <div class="xl12 xs8 xs1-move xm8 xm1-move xb8 xb1-move">
                        <!--右边部分-->

                        <div class="banner">
                            <div class="carousel">
                                <div class="item"><img src="images/1.jpg" alt="图片1" title="校园风光1" width="100%"/>
                                </div>
                                <div class="item"><img src="images/2.jpg" alt="图片2" title="校园风光2"  width="100%"/>
                                </div>
                                <div class="item"><img src="images/3.jpg" alt="图片3" title="校园风光3"  width="100%"/>
                                </div>
                            </div>
                        </div>
                        <!--表格开始-->
                        <table class ="table table-bordered margin-big-top">
                            <tr>
                                <th>照片</th>
                                <th>学号</th>
                                <th>姓名</th>
                                <th>性别</th>
                                <th>年龄</th>
                                <th>系部</th>
                                <th>功能</th>
                            </tr>
                            <tbody>
                            <%
                                String sno = request.getParameter("userid");
                                Student stu = DaoFactory.getStudentDao().findStudente(sno);                            
                            %>                         
                            <tr>
                                <td><img width ="50px " height ="50px"  src="photo/${stu.photo_url}" alt="nopic.png"/></td>
                                <td>${stu.sno}</td>
                                <td>${stu.sname}</td>
                                <td>${stu.ssex}</td>
                                <td>${stu.sage}</td>
                                <td>${stu.sdept}</td>
                                <td>
                                    <a href="StuUpdateServlet?sno=${stu.sno}" class="button button-small border-blue"><span class="icon-edit"></span>修改</a></td>
                            </tr>                      
                            <%                             
                            %>
                        </tbody>
                    </table>
                    <div class="text-center">
                        ${pagination.pageBar} ${pagination.numPageBar}
                    </div>
                    <!--表格结束-->
                </div>
            </div>
        </div>

        <!--内容结束-->


        <!--尾部开始-->
        <%@include file="WEB-INF/jspf/stu_footer.jspf" %>
        <!--尾部结束-->
    </body>
</html>

