package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css2/stylo.css\"rel=\"stylesheet\"> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <h1 text-align=\"center\"><b> Arc Online Booking System</b></h1>\n");
      out.write("        <h2>WELCOME CUSTOMER.</h2>\n");
      out.write("        <h2>PLEASE ENTER YOUR REGISTRATION DETAILS BELOW: </h2>\n");
      out.write("        <form action=\"verify.jsp\" method=\"get\" >\n");
      out.write("            <tr>\n");
      out.write("           <td><br>Your full name : <input type=\"text\" name=\"name\"/></br><td>\n");
      out.write("            <td>Enter Phone. No. : <input type=\"char\" name=\"phoneNo\"/><td>\n");
      out.write("                <td> <br>Your email: <input type=\"email\" name=\"email\"/></br><td>\n");
      out.write("           \n");
      out.write("                <td>MaritalStatus: <input type=\"name\" name=\"status\"/><td>\n");
      out.write("               <tr>\n");
      out.write("            <br/><input type=\"submit\"/>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            \n");
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
