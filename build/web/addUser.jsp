<%-- 
    Document   : addUser
    Created on : Apr 15, 2021, 8:14:03 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="addUser" method="post">
            <p>Tai khoan</p><input name="TaiKhoan" id="TaiKhoan" type="text">
            <p>Mat khau</p><input name="MatKhau" id="Matkhau" type="text">
            <p>avatar</p><input name="image" id="image" type="file">
            <input type="submit" id="b1" name="b1">
        </form>
    </body>
</html>
