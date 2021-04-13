<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2021/03/09
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>
    <script>
        function a1() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"username":$("#username").val()},
                success:function (data) {
                    if (data.toString()==="ok"){
                        $("#userInfo").css("color","green");
                    }else {
                        $("#userInfo").css("color","red");
                    }
                    $("#userInfo").html(data);
                }
            })
        }
        function a2() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"pwd":$("#password").val()},
                success:function (data) {
                    if (data.toString()==="ok"){
                        $("#pwdInfo").css("color","green");
                    }else {
                        $("#pwdInfo").css("color","red");
                    }
                    $("#pwdInfo").html(data);
                }
            })
        }
    </script>
</head>
<body>
    <p>
        用户名：<input type="text" name="username" onblur="a1()" id="username">
        <span id="userInfo"></span>
    </p>
    <p>
         密码：<input type="password" name="password" onblur="a2()" id="password">
        <span id="pwdInfo"></span>
    </p>

</body>
</html>
