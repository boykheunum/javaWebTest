<%-- 
    Document   : User
    Created on : Apr 5, 2021, 10:52:42 AM
    Author     : Admin
--%>

<%@page import="Model.userModel"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ThemUser</title>
    </head>
    <body>
        <%
            Vector<userModel> ds = new Vector<userModel>();
            int kq = conTrol.controlUser.listUser(ds);
            if (kq == -1) {
                out.print("<script>alert('loi ket noi database')</script>");
            } else if (kq == -2) {
                out.print("<script>alert('hien thi that bai')</script>");
            } else {
        %>
        <table border="1">
            <tr>
                <td>id</td>
                <td>Tai khoan</td>
                <td>Mat khau</td>
            </tr>
            <%for (userModel u : ds) {%>
            <tr>
                <td><%=u.getId()%></td>
                <td><%=u.getTaiKhoan()%></td>
                <td><%=u.getMatKhau()%></td>
                <td><a href=""></a></td>
            </tr>
            <%}%>
        </table>
        <%}%>
    </body>
</html>
