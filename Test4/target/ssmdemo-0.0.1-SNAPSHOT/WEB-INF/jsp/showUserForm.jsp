<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%-- <form:form modelAttribute="userList" action="url">



</form:form> --%>

<table>
    <tr>
        <td>id</td>
        <td>用户名</td>
        <td>密码</td>
        <td>性别</td>
        <td>年龄</td>
    </tr>
    <c:forEach items="${userList}" var="user1">
        <tr>
            <td>${user1.userId}</td>
            <td>${user1.userName}</td>
            <td>${user1.userPass}</td>
            <td>${user1.userSex}</td>
            <td>${user1.userAge}</td>
        </tr>

    </c:forEach>
</table>
</body>
</html>