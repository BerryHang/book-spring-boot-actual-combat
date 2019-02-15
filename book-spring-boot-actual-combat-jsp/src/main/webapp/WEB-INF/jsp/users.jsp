<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP test</title>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <th>用户ID</th><th>用户名</th><th>密码</th><th>E-mail</th><th>地址</th><th>QQ</th><th>性别</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" step="1" var="user" >
                <tr>
                    <td>${user.userId}</td><td>${user.userName}</td><td>${user.password}</td><td>${user.email}</td>
                    <td>${user.address}</td><td>${user.qq}</td><td>${user.sex}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>