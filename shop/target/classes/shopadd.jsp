<%--
  Created by IntelliJ IDEA.
  User: 26434
  Date: 2019/6/4
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加商品</title>
</head>
<body>
<form:form modelAttribute="shop" action="shopadd" method="post">
    <table>
        <tr>
            <td>商品编号：<form:input path="id"/></td>
            <td><form:errors path="id" cssStyle="color:red"/></td>
        </tr>
        <tr>
            <td>商品名称：<form:input path="name"/></td>
            <td><form:errors path="name" cssStyle="color:red"/></td>
        </tr>
        <tr>
            <td>商品价格：<form:input path="price"/></td>
            <td><form:errors path="price" cssStyle="color:red"/></td>
        </tr>
        <tr>
            <td>上架时间：<form:input path="time" type="date"/></td>
            <td><form:errors path="time" cssStyle="color:red"/></td>
        </tr>
        <tr>
            <td>商品信息：<form:input path="information"/></td>
            <td><form:errors path="information" cssStyle="color:red"/></td>
        </tr>

            <tr>
            <td colspan="2"><input type="submit" value="提交" /></td>
            </tr>
    </table>
</form:form>
</body>
</html>
