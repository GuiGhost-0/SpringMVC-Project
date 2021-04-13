<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2021/03/10
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--在WEB-INF下的所有页面或者资源，只能通过controller或者servlet进行访问--%>
<h1>登录</h1>

<form action="${pageContext.request.contextPath}/user/login" method="post">
    username:<input type="text" name="username"/>
    password:<input type="password" name="password"/>
    <input type="submit" value="登录" />
</form>

</body>
</html>
