package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import service.EmployeeBean;
import model.Employee;
import java.util.List;
import java.util.Date;

public final class empView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div id=\"mystyle\" style=\"border: none;\">\n");
      out.write("            <h1>JDBC, JSP, Servlet Tutorial</h1>\n");
      out.write("            <p><a href=\"http://www.developer.com\">http://www.developer.com</a><br/>\n");
      out.write("                <b>Creating Data centric Application with JSP Servlet</b><br/>\n");
      out.write("                ");
      out.print(new Date());
      out.write("</br>  </br>\n");
      out.write("                <a href=\"empAddNew.jsp\">Add New Employee</a> &NegativeThickSpace; |\n");
      out.write("                <a href=\"empView.jsp\">View Employee</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Emp ID</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Phone</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Salary</th>\n");
      out.write("                        <th>Designation</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        EmployeeBean eb = new EmployeeBean();
                        List<Employee> list = eb.getEmployees();
                        for (Employee e : list) {
                    
      out.write("\n");
      out.write(" \n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(String.valueOf(e.getEmpId()));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(e.getName());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(e.getPhone());
      out.write("</td>\n");
      out.write("                        <td><a href=\"mailto:");
      out.print(e.getEmail());
      out.write('"');
      out.write('>');
      out.print(e.getEmail());
      out.write("</a></td>\n");
      out.write("                        <td>");
      out.print(String.valueOf(e.getSalary()));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(e.getDesignation());
      out.write("</td>\n");
      out.write("                        <td style=\"border: none;\">\n");
      out.write("                            <div>\n");
      out.write("                                <form method=\"post\" action=\"empUpdate.jsp\">\n");
      out.write("                                    <input type=\"hidden\" id=\"updateId\" name=\"updateId\" value=\"");
      out.print(String.valueOf(e.getEmpId()));
      out.write("\"/> \n");
      out.write("                                    <input type=\"submit\" value=\"Modify...\"/> \n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"border: none;\">\n");
      out.write("                            <div>\n");
      out.write("                                <form method=\"post\" action=\"DeleteServlet\">\n");
      out.write("                                    <input type=\"hidden\" id=\"delId\" name=\"delId\" value=\"");
      out.print(String.valueOf(e.getEmpId()));
      out.write("\"/> \n");
      out.write("                                    <input type=\"submit\" value=\"Delete\"/> \n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
