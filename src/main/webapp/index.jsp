<%--
  Created by IntelliJ IDEA.
  User: lichu
  Date: 2020/3/17
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h2>欢迎来到首页！</h2>

<form action="/user/usersByName" method="post">

    姓名：<input type="text" name="username"/><br/>

    <input type="submit" value="提交"/>

</form>

<br>
<form action="/user/addUser" method="post">

    姓名：<input type="text" name="name"/><br/>
    年龄：<input type="text" name="age"/><br/>
    性别：<input type="text" name="gender"/><br/>
    邮件：<input type="text" name="email"/>

    <input type="submit" value="提交"/>

</form>

</body>
</html>
