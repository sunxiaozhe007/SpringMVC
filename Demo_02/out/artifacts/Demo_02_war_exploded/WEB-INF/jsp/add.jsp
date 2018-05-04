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
<form action="${pageContext.request.contextPath}/user/recieveUser.do" method="post">
    姓名：<input type="text" name="username" id="username">
    年龄：<input type="text" name="age" id="age">
    生日：<input type="text" name="birthday" id="birthday">
    地址：<input type="text" name="address" id="address">
    <input type="submit" value="提交">
</form>

<hr color="blue" size="12">

<form action="${pageContext.request.contextPath}/user/recieveInt.do" method="post">
    ID：<input type="text" name="id" id="id">
    <input type="submit" value="提交">
</form>

<hr color="blue" size="12">
<form action="${pageContext.request.contextPath}/user/recieveStr.do" method="post">
    ID：<input type="text" name="username" id="username">
    <input type="submit" value="提交">
</form>


<hr color="blue" size="12">
<form action="${pageContext.request.contextPath}/user/recieveUserCustom.do" method="post">
    姓名：<input type="text" name="user.username" id="username">
    年龄：<input type="text" name="user.age" id="age">
    生日：<input type="text" name="user.birthday" id="birthday">
    地址：<input type="text" name="user.address" id="address">
    <input type="submit" value="提交">
</form>





<hr color="blue" size="12">
<form action="${pageContext.request.contextPath}/user/recieveStr.do" method="post">
    ID：<input type="checkbox" name="ids" id="ids" value="1">
    ID：<input type="checkbox" name="ids" id="ids" value="2">
    ID：<input type="checkbox" name="ids" id="ids" value="3">

    <input type="submit" value="提交">
</form>


<hr color="blue" size="12">
<form action="${pageContext.request.contextPath}/user/recieveUserCustomList.do" method="post">
    姓名：<input type="text" name="userList[0].username" id="username">
    年龄：<input type="text" name="userList[0].age" id="age">
    姓名：<input type="text" name="userList[1].username" id="username">
    年龄：<input type="text" name="userList[1].age" id="age">

    <input type="submit" value="提交">
</form>



<hr color="blue" size="12">
<form action="${pageContext.request.contextPath}/user/recieveUserCustomMaps.do" method="post">
    姓名：<input type="text" name="maps{'username'}" id="username">
    年龄：<input type="text" name="maps{'age'}" id="age">


    <input type="submit" value="提交">
</form>


</body>
</html>
