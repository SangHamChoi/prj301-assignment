package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>23H59P Comic website</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/home.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- content header-->\n");
      out.write("        <div id=\"flex-sa\" class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- content logo -->\n");
      out.write("            <div id=\"logo\" class=\"col-md-3\">\n");
      out.write("                <a href=\"home.jsp\"><img class=\"img-full-width\" src=\"img/logo.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Kết thúc content logo -->\n");
      out.write("\n");
      out.write("            <!-- content search -->\n");
      out.write("            <div id=\"search\" class=\"col-md-6\">\n");
      out.write("                \n");
      out.write("                <form>\n");
      out.write("                    \n");
      out.write("                    <input type=\"text\" placeholder=\"Search in website\">\n");
      out.write("                    <button type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <!-- content login/signup -->\n");
      out.write("            <div id=\"login\" class=\"col-md-3\">\n");
      out.write("                <form>\n");
      out.write("                    ");
 if (session.getAttribute("loggedIn") != null && (boolean) session.getAttribute("loggedIn")) { 
      out.write("\n");
      out.write("                    <a href=\"LogoutServlet\">Logout</a>\n");
      out.write("                    ");
 } else { 
      out.write("\n");
      out.write("                    <a href=\"login.jsp\">Login</a> \n");
      out.write("                    <a href=\"signup.jsp\">Signup</a>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <a href=\"home.jsp\">Home</a>\n");
      out.write("            <a href=\"#about\">Hot</a>\n");
      out.write("            <a href=\"#services\">Filter</a>\n");
      out.write("            <a href=\"#like\">Liked</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\" id=\"new1\">\n");
      out.write("                <div>\n");
      out.write("                    <h1> NEW COMICS</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <img src=\"img/1.jpg\"  alt=\"Truyen 1\">\n");
      out.write("                    <a href=\"BookController?action=details&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><h3>Tên truyện 1</h3></a>\n");
      out.write("                    <p>Liked: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.like}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <img src=\"img/1.jpg\"  alt=\"Truyen 1\">\n");
      out.write("                    <a href=\"BookController?action=details&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><h3>Tên truyện 2</h3></a>\n");
      out.write("                    <p>Liked: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.like}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <img src=\"img/1.jpg\"  alt=\"Truyen 1\">\n");
      out.write("                    <a href=\"BookController?action=details&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><h3>Tên truyện 3</h3></a>\n");
      out.write("                    <p>Liked: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.like}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <img src=\"img/1.jpg\"  alt=\"Truyen 1\">\n");
      out.write("                    <a href=\"BookController?action=details&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><h3>Tên truyện 4</h3></a>\n");
      out.write("                    <p>Liked: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.like}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" id=\"new2\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <img src=\"img/1.jpg\"  alt=\"Truyen 1\">\n");
      out.write("                    <a href=\"BookController?action=details&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><h3>Tên truyện 5</h3></a>\n");
      out.write("                    <p>Liked: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.like}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <img src=\"img/1.jpg\"  alt=\"Truyen 1\">\n");
      out.write("                    <a href=\"BookController?action=details&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><h3>Tên truyện 6</h3></a>\n");
      out.write("                    <p>Liked: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.like}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <img src=\"img/1.jpg\"  alt=\"Truyen 1\">\n");
      out.write("                    <a href=\"BookController?action=details&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><h3>Tên truyện 7</h3></a>\n");
      out.write("                    <p>Liked: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.like}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <img src=\"img/1.jpg\"  alt=\"Truyen 1\">\n");
      out.write("                    <a href=\"BookController?action=details&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><h3>Tên truyện 8</h3></a>\n");
      out.write("                    <p>Liked: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.like}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row lefooter\"> <!--content footer-->\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <h3>Contact us</h3>\n");
      out.write("                <p>Email : duy...@gmail.com</p>\n");
      out.write("                <p>Phone Number: 0938888888</p>\n");
      out.write("                <h5>District 5</h5>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
