<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2021/02/26
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/hello" method="post">
        调用方法：<input type="text" name="method">
        <input type="submit" value="提交">
    </form>
</body>
</html>
