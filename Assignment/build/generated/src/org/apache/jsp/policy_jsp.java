package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class policy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Comment Policy</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Comment Policy</h1>\n");
      out.write("    <p>We value respectful and constructive dialogue on our website. In order to maintain a positive and welcoming environment for all users, we have established the following guidelines:</p>\n");
      out.write("    \n");
      out.write("    <ul>\n");
      out.write("        <li><strong>No Negative Comments:</strong> Comments should be constructive and avoid negativity.</li>\n");
      out.write("        <li><strong>No Regional Discrimination:</strong> Please refrain from making discriminatory remarks based on geographical regions.</li>\n");
      out.write("        <li><strong>No Personal Attacks:</strong> Do not engage in personal attacks or insults against others.</li>\n");
      out.write("        <li><strong>No Defamation:</strong> Comments should not defame or damage the reputation of individuals or organizations.</li>\n");
      out.write("        <li><strong>No Disrespect towards Vietnam:</strong> It is prohibited to make derogatory remarks or defame the Socialist Republic of Vietnam.</li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <p>We reserve the right to remove any comments that violate these guidelines, and repeated violations may result in the suspension or banning of commenting privileges.</p>\n");
      out.write("\n");
      out.write("    <p>Thank you for your cooperation in maintaining a respectful and inclusive community.</p>\n");
      out.write("</body>\n");
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
