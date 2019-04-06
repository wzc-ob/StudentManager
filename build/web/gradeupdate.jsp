

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mytag" uri="WEB-INF/tlds/Mytag.tld"%>
<!DOCTYPE html>
<html lang="zh-cn">
    <head>
        <title>教师信息修改</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/pintuer.css">
        <script src="js/jquery.js"></script>
        <script src="js/pintuer.js"></script>
    </head>
    <body>
        <!--首部开始  加注释ctrl+/-->
        <%@include file="WEB-INF/jspf/tea_header.jspf" %>
        <!--首部结束-->

        <!--内部开始-->
        <div class="container padding-big-top padding-big-bottom">
            <div class="line">
                <div class="xl12 xs3  xm3  xb3 ">
                    <!--左边部分-->
                    <%@include file="WEB-INF/jspf/tea_lefter.jspf" %>
                    <!--左边部分结束-->
                </div>
                <div class="xl12 xs8 xs1-move xm8 xm1-move xb8 xb1-move">
                    <!--右边部分-->
                    <form method="post" action="GradeInsertServletDo" enctype="multipart/form-data">
                        <!--表单开始-->
                        <div class="form-group">
                            <div class="label">
                                <label for="sno">学号</label>
                            </div>
                            <div class="field">
                                <input type="text" class="input" id="sno" name="sno" value="${sc.sno}" readonly="readonly" size="50" placeholder="请输入学生学号" data-validate="required:必填,number:必须是数字,compare#=7:数值bix"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label for="cno">课程编号</label>
                            </div>
                            <div class="field">
                                <input type="text" class="input" id="cno" name="cno" value="${sc.cno}" readonly="readonly" size="50" placeholder="请输入课程编号" data-validate="required:必填,number:必须是数字,compare#=7:数值bix"/>
                            </div>
                        </div>
                         <div class="form-group">
                            <div class="label">
                                <label for="grade">
                                    成绩</label>
                            </div>
                            <div class="field">                                                  
                                <input type="text" class="input" id="grade" name="grade" value="${sc.grade}" size="50" placeholder="请输入学生成绩" />                       
                            </div>
                        </div>
                        <div class="form-button">
                            <button class="button" type="submit">
                                提交</button>
                        </div>
                    </form>
                    <!--表单结束-->
                </div>
            </div>
        </div>
        <!--内容结束-->
        <!--尾部开始-->
        <%@include file="WEB-INF/jspf/tea_footer.jspf" %>
        <!--尾部结束-->
    </body>
</html>

