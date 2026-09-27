<%--
  Created by IntelliJ IDEA.
  User: K.A.Chanuka Rukshan
  Date: 6/3/2026
  Time: 11:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
</head>
<body>

<form action="signup" method="post">
    <table>
        <tr>
            <th>Name</th>
            <td><input name="name"/></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><input name="email"/></td>
        </tr>
        <tr>
            <th>Mobile Number</th>
            <td><input name="mobile"/></td>
        </tr>
        <tr>
            <th>Password</th>
            <td><input name="password" type="password"/></td>
        </tr>
        <tr>
            <td>
                <button type="submit">Sign UP</button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
