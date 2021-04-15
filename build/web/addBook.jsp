<%-- 
    Document   : addBook
    Created on : Apr 13, 2021, 7:59:25 PM
    Author     : DELL
--%>

<%@page import="conTrol.controlTypeBook"%>
<%@page import="Model.typeModel"%>
<%@page import="java.util.Vector"%>
<%@page import="Model.bookModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Vector<typeModel> ds = new Vector<typeModel>();
            int kq = controlTypeBook.listTypeBook(ds);

        %>
        <form name="f1" id="f1" method="post" action="addBook">
            <p>Ma sach</p><input name="MaS" id="MaS" type="text">
            <p>Ten sach</p><input name="TenSach" id="TenSach" type="text" >
            <p>Mo ta Ngan</p><textarea name="MoTaNgan" id="MoTaNgan"></textarea>
            <p>Mo ta Chi tiet</p><input name="MoTaChiTiet" id="MoTaChiTiet" type="textrea">
            <p>Ma loai sach</p><select id="MaLoaiS" name="MaLoaiS"><%for (typeModel tp : ds) {%><option ><%=tp.getMaLoaiS()%></option><%}%></select>
            <input type="submit" name="b1" id="b1" value="them">
        </form>

    </body>
</html>
