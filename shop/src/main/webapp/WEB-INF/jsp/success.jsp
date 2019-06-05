<%--
  Created by IntelliJ IDEA.
  User: 26434
  Date: 2019/6/4
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="shop">
    商品编号： ${shop.id}  <br>
    商品名称： ${shop.name} <br>
    商品价格： ${shop.price} <br>
    商品信息： ${shop.information} <br>
    上架时间： ${shop.time} <br>
</form:form>

</body>
</html>
