
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mytag" uri="WEB-INF/tlds/Mytag.tld"%>
<!DOCTYPE html>
<html lang="zh-cn">
    <head>
        <title>拼图前端框架HTML模版</title>
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
                    <form method="post" action="StuInsertServlet" enctype="multipart/form-data">
                    <!--表单开始-->
                    
                        <div class="form-group">
                            <div class="label">
                                <label for="sno">学号</label>
                            </div>
                            <div class="field">
                                <input type="text" class="input" id="sno" name="sno" size="50" placeholder="请输入学生学号" data-validate="required:必填,number:必须是数字,length#==7:数值必须是7位，ajax#验证地址(demo/getdata.html?sno={value}):错误提示(用户已注册)"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                               <label for="sname">姓名</label>
                            </div>
                            <div class="field">                        
                                <input type="text" class="input" id="sname" name="sname" size="50" placeholder="请输入学生姓名" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label for="ssex">
                                    性别</label>
                            </div>
                            <div class="field">
                            <div class="button-group checkbox">                           
                                    <label class="button">
                                        <input name="ssex" value="男" type="checkbox"><span class="icon-plane"></span> 男
                                    </label>
                                    <label class="button">
                                        <input name="ssex" value="女" type="checkbox"><span class="icon-glass"></span> 女
                                    </label>                          
                            </div>
                          </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label for="sage">
                                    年龄</label>
                            </div>
                            <div class="field">                                                  
                                <input type="text" class="input" id="sage" name="sage" size="50" placeholder="请输入学生年龄" />                       
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label for="sdept">
                                    系部</label>
                            </div>
                            <div class="field">                                                  
                                <mytag:departlisttag />                       
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label for="photo">
                                    头像</label>
                            </div>
                            <div class="field">
                                <a class="button input-file" href="javascript:void(0);">+ 浏览文件<input size="100" data-validate="required:请选择文件,regexp#.+.(jpg|jpeg|png|gif)$:只能上传jpg|gif|png格式文件" type="file" id="photo" name="photo"/></a>
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

