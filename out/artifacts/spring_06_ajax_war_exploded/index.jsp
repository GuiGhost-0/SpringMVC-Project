<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2021/03/06
  Time: 01:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>
    <script>
      function a(){
        $.post({
          url:"${pageContext.request.contextPath}/a1",
          data:{"name":$("#username").val()},
          success:function (data,status) {
              console.log("数据：" + data);
              console.log("请求状态：" + status);
          }
        })

      }
    </script>
  </head>
  <body>
  <%--失去焦点的时候，发送一个请求到后端--%>
  用户名：<input type="text" id="username" onblur="a()">

  </body>
</html>
