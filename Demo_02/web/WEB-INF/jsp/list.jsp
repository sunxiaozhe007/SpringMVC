<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/5
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>数据回显</title>
</head>
<body>
<table border="2">
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>生日</td>
        <td>地址</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${userList}" var="l">
        <tr>
            <td>${l.username}</td>
            <td>${l.age}</td>
            <td>${l.birthday}</td>
            <td>${l.address}</td>
            <td>
                <a href="${pageContext.request.contextPath}/rest/user/update/${l.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
