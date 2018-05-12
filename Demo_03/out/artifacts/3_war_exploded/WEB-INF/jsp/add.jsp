<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/12
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<form action="/add" method="post">
    <table border="2">
        <tr>
            <td>学号</td>
            <td><input type="text" name="num"></td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>学校</td>
            <td><input type="text" name="school"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交">|<a href="/list">返回</a> </td>
        </tr>
    </table>
</form>
</body>
</html>
