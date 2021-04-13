<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2021/03/06
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                /**
                 * $.post(url,data[可省略],success)
                 * */

                $.post("${pageContext.request.contextPath}/a2",function (data) {
                    var html = "";
                    for (let i = 0; i < data.length; i++) {
                        html += "<tr>" +
                                "<td>" + data[i].name + "</td>" +
                                "<td>" + data[i].age + "</td>" +
                                "<td>" + data[i].sex + "</td>" +
                            "</tr> ";
                    }
                    $("#content").html(html);
                })
            })
        });

    </script>
    <style type="text/css">
        table{
            border: gray 1px solid;
        }
        td{
            border: gray 1px solid;
        }
    </style>
</head>
<body>
    <input type="button" value="加载数据" id="btn">
    <table>
        <tr>
            <td>姓名</td>
            <td>年龄</td>
            <td>性别</td>
        </tr>
        <tbody id="content">

        </tbody>
    </table>
</body>
</html>
