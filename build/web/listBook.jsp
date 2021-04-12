<%-- 
    Document   : listBook
    Created on : Apr 12, 2021, 10:36:51 AM
    Author     : Admin
--%>

<%@page import="Model.bookModel"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <%
            Vector<bookModel> ds = new Vector<bookModel>();
            int kq = conTrol.controlBook.listBook(ds);
            if (kq == -1) {
                out.print("<script>alert('ko the ket noi den databse')</script>");
            } else if (kq == -2) {
                out.print("<script>alert('loi cau lenh sql')</script>");
            } else {
        %>
        <table border="1">
            <tr background-color="aqua">
                <td>Ma Sach</td>
                <td>Ten Sach</td>
                <td>Mo ta ngan</td>
                <td>Mo ta chi tiet</td>
                <td>MaLoaiS</td>
            </tr>
            <%
                for (bookModel bk : ds) {
            %>
            <tr>
                <td><%=bk.getMaS()%></td>
                <td><%=bk.getTenSach()%></td>
                <td><%=bk.getMoTaNgan()%></td>
                <td><%=bk.getMoTaChiTiet()%></td>
                <td><%=bk.getMaLoaiS()%></td>
            </tr>
            <%}%>
        </table>
        <%}%>
    </body>
</html>
