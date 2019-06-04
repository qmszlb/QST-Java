<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <%
       pageContext.setAttribute("path",request.getContextPath());
    %>

    <script type="text/javascript" src="${path}/js/jquery-3.2.1.js"></script>
    <script type="text/javascript">
        function doLogin() {

            var username1=document.getElementById("username").value;
            var pwd=document.getElementById("password").value;
            alert(username1);

            /* var pwd = document.getElementById("password"); */



            $.ajax({
                url:"${path}/user/login",
                type:"post",
                data:JSON.stringify({"username":username1,"password":pwd}),
                contentType:"application/json;charset=UTF-8",
                success:function(data){
                    alert(data.username);
                },
                error:function(){
                    alert("错误！");
                }


            });
        }

    </script>
</head>
<body>
<!-- <form action="user/login" method="post">
	用户名：<input name="username" type="text">
	密码：<input name="password" type="password">
	<input type="submit" value="登录">
</form> -->

<form>
    用户名：<input name="username" id="username" type="text">
    密码：<input name="password" id="password" type="password">
    <input type="button" value="登录" onclick="doLogin()">
</form>
</body>
</html>