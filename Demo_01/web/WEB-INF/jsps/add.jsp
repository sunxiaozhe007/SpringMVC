<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/3
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/command.do" method="post">
    姓名：<input type="text" name="username" id="username">
    年龄：<input type="text" name="age" id="age">
    生日：<input type="text" name="birthday" id="birthday">
    地址：<input type="text" name="address" id="address">
    <input type="submit" value="提交">
</form>
</body>
</html>
