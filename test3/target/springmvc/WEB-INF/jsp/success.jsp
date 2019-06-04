<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>商品展示</title>
</head>
<body>
     <form:form modelAttribute="goods">
         商品编号： <form:input path="id"></form:input><br>
         商品名称： <form:input path="name"></form:input><br>
         商品价格： <form:input path="price"></form:input><br>
         商品描述： <form:input path="describe"></form:input><br>
         上架日期： <form:input path="data"></form:input><br>
     </form:form>
</body>
</html>
