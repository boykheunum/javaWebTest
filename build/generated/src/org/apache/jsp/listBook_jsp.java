package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.bookModel;
import java.util.Vector;

public final class listBook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            Vector<bookModel> ds = new Vector<bookModel>();
            int kq = conTrol.controlBook.listBook(ds);
            if (kq == -1) {
                out.print("<script>alert('ko the ket noi den databse')</script>");
            } else if (kq == -2) {
                out.print("<script>alert('loi cau lenh sql')</script>");
            } else {
        
      out.write("\r\n");
      out.write("        <table border=\"1\">\r\n");
      out.write("            <tr background-color=\"aqua\">\r\n");
      out.write("                <td>Ma Sach</td>\r\n");
      out.write("                <td>Ten Sach</td>\r\n");
      out.write("                <td>Mo ta ngan</td>\r\n");
      out.write("                <td>Mo ta chi tiet</td>\r\n");
      out.write("                <td>MaLoaiS</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                for (bookModel bk : ds) {
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(bk.getMaS());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(bk.getTenSach());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(bk.getMoTaNgan());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(bk.getMoTaChiTiet());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(bk.getMaLoaiS());
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        ");
}
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
