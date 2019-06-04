<%--
  Created by IntelliJ IDEA.
  User: zhangouba
  Date: 2019/6/4
  Time: 10:26
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
<form:form modelAttribute="commodity"  method="post">
    <table>
        <tr>
            <td>商品编号：<form:input path="id"/></td>
            <td><form:errors path="id" cssStyle="color:#ff090f"/></td>
        </tr>
        <tr>
            <td>商品名字：<form:input path="name"/></td>
            <td><form:errors path="name" cssStyle="color:#ff1627"/></td>
        </tr>
        <tr>
            <td>商品价格：<form:input path="price"/></td>
            <td><form:errors path="price" cssStyle="color:#ff090f"/></td>
        </tr>
        <tr>
            <td>商品描述：<form:input path="describe"/></td>
            <td><form:errors path="describe" cssStyle="color:#ff090f"/></td>
        </tr>
        <tr>
            <td>上架时间：<form:input  type="Data" path="data" />(形式xxxx-xx-xx)</td>
            <td><form:errors path="data" cssStyle="color:#ff1627"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="确定" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>
