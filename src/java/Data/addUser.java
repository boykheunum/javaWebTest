/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.userModel;
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
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Nguyen Tien Dat
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
            request.setCharacterEncoding("UTF-8");
            int sizeFileMax = 1024 * 5000;
            int sizeMemMax = 1024 * 5000;
            ServletContext context = request.getServletContext();
            String curPath = context.getRealPath("/");
            String filePath = curPath + "Uploads\\";
            boolean isMultiFile = ServletFileUpload.isMultipartContent(request);
            if (isMultiFile) {
                DiskFileItemFactory factory = new DiskFileItemFactory();
                factory.setSizeThreshold(sizeMemMax);
                factory.setRepository(new File(curPath));
                ServletFileUpload upload = new ServletFileUpload(factory);
                upload.setSizeMax(sizeFileMax);
                try {
                    List Item = upload.parseRequest(request);
                    String TaiKhoan = conTrol.uploadFile.uploadFile(Item, "TaiKhoan", "");
                    String MatKhau = conTrol.uploadFile.uploadFile(Item, "MatKhau", "");
                    String Image = conTrol.uploadFile.uploadFile(Item, "image", "");
                    userModel us = new userModel(TaiKhoan, MatKhau, Image);
                    int kq = new conTrol.controlUser().addUser(us);
                    if(kq > 0){
                        response.sendRedirect("User.jsp");
                    }
                } catch (FileUploadException ex) {
                    Logger.getLogger(addUser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
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
