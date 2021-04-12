<%-- 
    Document   : listTypeBook
    Created on : Apr 8, 2021, 10:59:06 AM
    Author     : Admin
--%>

<%@page import="conTrol.controlTypeBook"%>
<%@page import="Model.typeModel"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Vector<typeModel>ds = new Vector<typeModel>();
            int kq = controlTypeBook.listTypeBook(ds);
            if (kq == -1) {
                out.print("<script>alert('ko the ket noi den databse')</script>");
            } else if (kq == -2) {
                out.print("<script>alert('loi cau lenh sql')</script>");
            } else {
        %>
        <table border="1">
            <tr background-color="aqua">
                <td>Ma Loai Sach</td>
                <td>Ten Loai Sach</td>
            </tr>
            <%
                for(typeModel tb : ds){
            %>
            <tr>
                <td><%=tb.getMaLoaiS()%></td>
                <td><%=tb.getTenLoaiS()%></td>
            </tr>
            <%}%>
        </table>
        <%}%>
    </body>
</html>
