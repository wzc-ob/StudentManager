
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-cn">
    <head>
        <title>课程界面</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/pintuer.css">
        <script src="js/jquery.js"></script>
        <script src="js/pintuer.js"></script>
    </head>
    <body>
        <!--首部开始-->
        <%@include file="WEB-INF/jspf/tea_header.jspf" %>
        <!--首部结束-->

        <!--内容开始-->
        <div class="container-layout padding-big-top padding-big-bottom">
            <div class="line">
                <div class="xl12 xs3 xm3 xb3">
                    <!--左边部分-->
                    <%@include file="WEB-INF/jspf/tea_lefter.jspf" %>       
                    <!--左边部分结束-->
                </div>
                <div class="xl12 xs8 xs1-move xm8 xm1-move xb8 xb1-move ">
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
                    <table class ="table table-bordered margin-big-top table table-hover table table-striped">
                        <tr>
                            <th>学生编号</th>
                            <th>学生姓名</th>
                            <th>课程编号</th>
                            <th>课程名称</th>
                            <th>学分</th>
                            <th>成绩</th>                 
                            <th>功能</th>
                        </tr>
                        <c:forEach  items="${gradetable}" var="gtt">
                            <tr>
                                <td>${gtt.sno}</td>
                                <td>${gtt.sname}</td>
                                <td>${gtt.cno}</td>
                                <td>${gtt.cname}</td>
                                <td>${gtt.ccredit}</td>
                                <td>${gtt.grade}</td>    
                                <td>                                  
                                    <a href="GradeInsertServlet?sno=${gtt.sno}&cno=${gtt.cno}&grade=${gtt.grade}"  class="button button-small border-red"> <span class="icon-trash-o"></span>成绩录入</a>
                                </td>
                            </tr>
                        </c:forEach>
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
        <%@include file="WEB-INF/jspf/tea_footer.jspf" %>
        <!--尾部结束-->
    </body>
</html>