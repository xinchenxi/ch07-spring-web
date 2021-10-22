<%--
  Created by IntelliJ IDEA.
  User: 99244
  Date: 2021/10/21
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>注册学生</p>
    <form action="reg" method="post">
        <table>
            <tr>
                <td>id</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>name:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>email</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>age</td>
                <td><input type="text" name="age"></td>
            </tr>
            <tr>
                <td><input type="submit" value="注册"></td>
            </tr>
        </table>
    </form>
</body>
</html>
