<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/12
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示</title>
</head>
<body>
<table border="2">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>学校</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="s">
        <tr>
            <td>${s.num}</td>
            <td>${s.name}</td>
            <td>${s.school}</td>
            <td><a href="/delete?num=${s.num}">删除</a>|<a href="/update?id=${s.id}">修改</a> </td>
        </tr>
    </c:forEach>
    <tr>
        <td><a href="/toAdd">添加</a>|<a href="/toFind">查询</a> </td>
    </tr>
</table>
</body>
</html>
