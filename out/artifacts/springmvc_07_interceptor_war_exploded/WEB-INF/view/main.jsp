<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2021/03/10
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>假装首页</h1>
    <h4>${username}</h4>

    <a href="${pageContext.request.contextPath}/user/loginOut">注销</a>
</body>
</html>
