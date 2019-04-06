
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>教学管理系统</title>
        <link rel="stylesheet" type="text/css" href="css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="css/default.css">
        <link rel="stylesheet" type="text/css" href="css/styles.css">
        <!--[if IE]>
                <script src="http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js"></script>
        <![endif]-->
    </head>
    <body>        
        <%
            String utype = request.getParameter("utype");
        %>
        <div class="htmleaf-container">
            <header class="htmleaf-header">
                <h1>教学管理系统</h1>
              
            </header>
            <div class="wrapper">
                <div class="container">
                    <h1>Welcome</h1>
                    <form method="post" action="LoginServlet" class="form-auto" align="center">
                        <div class="form-group">
                            <div class="field ">
                                <input type="text" class="input" id="userid" name="userid"  value="${userd.userid}" size="30" placeholder="用户账号" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="field ">
                                <input type="password" class="input" id="passwordr" name="passwordr" value="${userd.passwordr}" size="30" placeholder="密码" />
                            </div>
                        </div>
                        <select name="utype">
                            <option value="1" <%= "1".equals(utype) ? "selected='selected'" : ""%>>教师</option>
                            <option value="2" <%= "2".equals(utype) ? "selected='selected'" : ""%>>学生</option>
                        </select>
                        <div class="form-button">
                            <button class="button" type="submit">
                                Login</button>
                        </div>
                    </form>
                </div>
                <ul class="bg-bubbles">
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                </ul>
            </div>
        </div>
        <script src="http://libs.useso.com/js/jquery/2.1.1/jquery.min.js" type="text/javascript"></script>
        <script>window.jQuery || document.write('<script src="js/jquery-2.1.1.min.js"><\/script>')</script>
        <script>
            $('#login-button').click(function (event) {
                event.preventDefault();
                $('form').fadeOut(500);
                $('.wrapper').addClass('form-success');
            });
        </script>
    </body>
</html>
