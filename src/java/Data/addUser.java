/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.userModel;
import conTrol.controlUser;
import conTrol.uploadFile;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.coyote.ajp.Constants;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.eclipse.jdt.internal.compiler.apt.model.Factory;

/**
 *
 * @author DELL
 */
@WebServlet(name = "addUser", urlPatterns = {"/addUser"})
public class addUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int maxSizeFile = 5000 * 1024;
            int maxSizeMem = 5000 * 1024;
            ServletContext sc = request.getServletContext();
            String curPath = sc.getRealPath("/");
            String filePath = curPath + "Uploads\\";
            boolean mutilPath = ServletFileUpload.isMultipartContent(request);
            if(mutilPath == false){
                DiskFileItemFactory factory = new DiskFileItemFactory();
                factory.setSizeThreshold(maxSizeMem);
                factory.setRepository(new File(curPath));
                ServletFileUpload sfu = new ServletFileUpload(factory);
                sfu.setSizeMax(maxSizeMem);
                try {
                    List FileItem = sfu.parseRequest((RequestContext) request);
                    String Taikhoan = conTrol.uploadFile.uploadFile(FileItem, "TaiKhoan", "");
                    String MatKhau = conTrol.uploadFile.uploadFile(FileItem, "MatKhau", "");
                    String image = conTrol.uploadFile.uploadFile(FileItem, "image", filePath);
                    userModel us = new userModel(Taikhoan, MatKhau, image);
                    int kq = new controlUser().addUser(us);
                    if(kq == -1){
                        out.print("<script>alert('ket noi database that bai')</script>");
                    }else if(kq == 0){
                        out.print("<script>alert('ko co ban ghi')</script>");
                    }else{
                        out.print("<script>alert('them thanh cong')</script>");
                        response.sendRedirect("User.jsp");
                    }
                } catch (FileUploadException ex) {
                    Logger.getLogger(addUser.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
