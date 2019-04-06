

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
                    <form method="post" action="TeaUpdateServletDo" enctype="multipart/form-data">
                        <!--表单开始-->

                        <div class="form-group">
                            <div class="label">
                                <label for="tno">编号</label>
                            </div>
                            <div class="field">
                                <input type="text" class="input" id="tno" name="tno" value="${tea.tno}" readonly="readonly" size="50" placeholder="请输入教师编号" data-validate="required:必填,number:必须是数字,compare#=7:数值bix"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label for="tname">姓名</label>
                            </div>
                            <div class="field">                        
                                <input type="text" class="input" id="tname" name="tname" value="${tea.tname}" size="50" placeholder="请输入教师姓名" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label for="tsex">性别</label>
                            </div>
                            <div class="field">
                                <div class="button-group radio">   
                                    <c:if test = "${tea.tsex=='男'}">
                                        <label class="button active">
                                            <input name="tsex" value="男" checked="checked" type="radio" ><span class="icon icon-male"></span> 男
                                        </label>
                                        <label class="button">
                                            <input name="tsex" value="女" type="radio"><span class="icon icon-female"></span> 女
                                        </label>    
                                    </c:if>
                                    <c:if test = "${tea.tsex=='女'}">
                                        <label class="button">
                                            <input name="tsex" value="男" type="radio" ><span class="icon icon-male"></span> 男
                                        </label>
                                        <label class="button ">
                                            <input name="tsex" value="女" checked="checked" type="radio"><span class="icon icon-female"></span> 女
                                        </label>    
                                    </c:if>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label for="tpost">职称</label>
                            </div>
                            <div class="field">                                                  
                                <input type="text" class="input" id="tpost" name="tpost" value="${tea.tpost}" size="50" placeholder="请输入教师职称" />                       
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label for="tdept">系部</label>
                            </div>      
                              <div class="field">   
                            <mytag:teadepartlisttag tdept="${tea.tdept}"/>   
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

