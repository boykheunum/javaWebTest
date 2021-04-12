<%-- 
    Document   : login
    Created on : Apr 6, 2021, 9:34:36 AM
    Author     : Admin
--%>

<%@page import="Model.userModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <%
            userModel u = new userModel();
        %>
        <form id="f1" name="f1" method="post" action="login">
            <p>Tai Khoan:</p><input type="text" name="TaiKhoan" id="TaiKhoan">
            <p>Mat Khau:</p><input type="password" name="MatKhau" id="MatKhau">
            <button id="b1" name="b1" type="submit">Dang nhap</button>
        </form>
    </body>
</html>
