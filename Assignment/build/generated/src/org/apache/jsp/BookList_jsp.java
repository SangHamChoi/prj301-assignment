package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Books.BookDTO;

public final class BookList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Books List</title>\n");
      out.write("        <style>\n");
      out.write("        table {\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            border: 1px solid black;\n");
      out.write("            padding: 8px;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("        img {\n");
      out.write("            max-width: 100px;\n");
      out.write("            max-height: 100px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<a href='AdminController?action=list'>Books List</a> | <a href='login.jsp'>Login</a>  | <a href='login?action=logout'>Logout</a>\n");
      out.write("\n");
      out.write("        <form action='' method=\"GET\"> \n");
      out.write("            <input name=\"keyword\" type=\"text\" value=\"");
      out.print(request.getParameter("keyword") != null ? request.getParameter("keyword") : "");
      out.write("\">\n");
      out.write("            <input type=\"submit\" value=\"Search\">    \n");
      out.write("        </form><br>\n");
      out.write("        <form action=\"AdminController\" method=\"POST\">\n");
      out.write("                        <input name=\"action\" value=\"add\" type=\"hidden\">\n");
      out.write("                        <input type=\"submit\" value=\"Add Book\">\n");
      out.write("        </form><br>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>Book ID</td>\n");
      out.write("                <td>Title</td>\n");
      out.write("                <td>Author</td>\n");
      out.write("                <td>Cover Image</td>\n");
      out.write("                <td>Genre</td>\n");
      out.write("                <td>Descriptions</td>\n");
      out.write("                <td>Chapter</td>\n");
      out.write("                <td>Status</td>\n");
      out.write("                <td>Liked</td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");

                List<BookDTO> list = (List<BookDTO>) request.getAttribute("BooksList");
                if (list != null) {
                    for (BookDTO book : list) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><a href=\"AdminController?action=details&id=");
      out.print( book.getBookID());
      out.write('"');
      out.write('>');
      out.print( book.getBookID());
      out.write("</a></td>\n");
      out.write("                <td>");
      out.print( book.getTitle());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( book.getAuthor());
      out.write("</td>\n");
      out.write("                <td><img src=\"");
      out.print( book.getCoverImage());
      out.write("\" width=\"100\" height=\"150\"></td>\n");
      out.write("                <td>");
      out.print( book.getGenre());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( book.getDescriptions());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( book.getChapter());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( book.getStatus());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( book.getLiked());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 
                    }
                } else {
                    // Handle case when BooksList is null
                    out.println("<tr><td colspan='9'>No books found</td></tr>");
                }
            
      out.write("\n");
      out.write("              \n");
      out.write("        </table>\n");
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
