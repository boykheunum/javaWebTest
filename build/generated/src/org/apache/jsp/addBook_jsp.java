package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import conTrol.controlTypeBook;
import Model.typeModel;
import java.util.Vector;
import Model.bookModel;

public final class addBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            Vector<typeModel> ds = new Vector<typeModel>();
            int kq = controlTypeBook.listTypeBook(ds);

        
<<<<<<< HEAD
      out.write("\n");
      out.write("        <form name=\"f1\" id=\"f1\" method=\"post\" action=\"addBook\">\n");
      out.write("            <p>Ma sach</p><input name=\"MaS\" id=\"MaS\" type=\"text\">\n");
      out.write("            <p>Ten sach</p><input name=\"TenSach\" id=\"TenSach\" type=\"text\" >\n");
      out.write("            <p>Mo ta Ngan</p><textarea name=\"MoTaNgan\" id=\"MoTaNgan\"></textarea>\n");
      out.write("            <p>Mo ta Chi tiet</p><input name=\"MoTaChiTiet\" id=\"MoTaChiTiet\" type=\"textrea\">\n");
      out.write("\n");
      out.write("            <p>Ma loai sach</p><select id=\"MaLoaiS\" name=\"MaLoaiS\">");
for (typeModel tp : ds) {
=======
      out.write("\r\n");
      out.write("        <form name=\"f1\" id=\"f1\" method=\"post\" action=\"addBook\">\r\n");
      out.write("            <p>Ma sach</p><input name=\"MaS\" id=\"MaS\" type=\"text\">\r\n");
      out.write("            <p>Ten sach</p><input name=\"TenSach\" id=\"TenSach\" type=\"text\" >\r\n");
      out.write("            <p>Mo ta Ngan</p><textarea name=\"MoTaNgan\" id=\"MoTaNgan\"></textarea>\r\n");
      out.write("            <p>Mo ta Chi tiet</p><input name=\"MoTaChiTiet\" id=\"MoTaChiTiet\" type=\"textrea\">\r\n");
      out.write("            <p>Ma loai sach</p><select name=\"MaLoaiS\" id=\"MaLoaiS\">");
for(typeModel tp : ds) {
>>>>>>> 5a4773193481c4fa615e5fd93d75433581148d73
      out.write("<option >");
      out.print(tp.getMaLoaiS());
      out.write("</option>");
}
      out.write("</select>\r\n");
      out.write("\r\n");
      out.write("            <input type=\"submit\" name=\"b1\" id=\"b1\" value=\"them\">\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
