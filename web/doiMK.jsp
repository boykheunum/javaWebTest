<%-- 
    Document   : doiMK
    Created on : Apr 6, 2021, 2:49:35 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            HttpSession sesstion = request.getSession();
            String TK = session.getAttribute("tk").toString();
//            String MatKhau = session.getAttribute("mk").toString();
            int kq = conTrol.controlUser.searchTK(TK);
            if(kq != 0){
        %>
        <form action="MK" method="post" name="f2" id="f2">
            <input type="text" name="TaiKhoan" id="TaiKhoan" value="<%=TK%>">
            <p>Mat Khau Moi</p><input type="password" name="MatKhau" id="MatKhau">
            <p>Xac Nhan lai Mat Khau</p><input type="password" name="MatKhau1" id="MatKhau1">
            <button id="b1" name="b1" type="submit">Doi MK</button>
        </form>
        <%}%>
    </body>
</html>
