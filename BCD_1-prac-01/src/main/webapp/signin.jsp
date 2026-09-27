<%--
  Created by IntelliJ IDEA.
  User: K.A.Chanuka Rukshan
  Date: 6/3/2026
  Time: 12:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign In</title>
</head>
<body>

<form action="signin" method="post">
    <table>
        <tr>
            <th>Email</th>
            <td><input name="email"/></td>
        </tr>
        <tr>
            <th>Password</th>
            <td><input name="password" type="password"/></td>
        </tr>
        <tr>
            <td>
                <button type="submit">Sign IN</button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
