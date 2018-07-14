package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menupage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>\n");
      out.write("\t\t\tCONTACT US\n");
      out.write("\t\t</title>\n");
      out.write("\t</head>\n");
      out.write("\t<style>\n");
      out.write("\ta\n");
      out.write("\t{\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.mytheme:hover\n");
      out.write("\t{\n");
      out.write("\tbackground:white;\n");
      out.write("\tfont-family:arial;\n");
      out.write("\tcolor:white;\n");
      out.write("\tfont-size:30px;\n");
      out.write("\tborder:dotted;\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("<table width=25% >\n");
      out.write("\n");
      out.write("  <td class=\"mytheme\"><font size=\"4px\"><a href=\"Contact Us.html\">Contact Us</a></font></td>\n");
      out.write("  <td class=\"mytheme\"><font size=\"4px\"><a href=\"About Us.html\">About Us</a></font></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<hr>\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td width=30%>\n");
      out.write("<marquee scrollamount=10 direction=right>\n");
      out.write("<img src=\"images/1.jpg\" width=100 height=100>\n");
      out.write("<img src=\"images/2.jpg\" width=100 height=100>\n");
      out.write("<img src=\"images/3.jpg\" width=100 height=100>\n");
      out.write("<img src=\"images/4.jpg\" width=100 height=100>\n");
      out.write("</td>\n");
      out.write("<td width=40%>\n");
      out.write("\n");
      out.write("\t<img src=\"images/logo.png\" width=500x height=100x>\n");
      out.write("</td>\t\n");
      out.write("<td width=30%>\n");
      out.write("<marquee scrollamount=10 >\n");
      out.write("<img src=\"images/5.jpg\" width=100 height=100>\n");
      out.write("<img src=\"images/6.jpg\" width=100 height=100>\n");
      out.write("<img src=\"images/7.jpg\" width=100 height=100>\n");
      out.write("<img src=\"images/8.jpg\" width=100 height=100>\n");
      out.write("</marquee>\t\n");
      out.write("</table>\t\n");
      out.write("\t\n");
      out.write("<table width=100%>\n");
      out.write("  <tr align=center bgcolor=\"orange\">\n");
      out.write("  <td class=\"mytheme\"><font size=\"6px\"><a href=\"Mail.html\">Mail E-Paper</a></font></td>\n");
      out.write("  <td class=\"mytheme\"><font size=\"6px\"><a href=\"Share.html\">Share your news</a></font></td>\n");
      out.write("  <td class=\"mytheme\"><font size=\"6px\"><a href=\"Advertisement.html\">Advertisement</a></font></td>\n");
      out.write("  <td class=\"mytheme\"><font size=\"6px\"><a href=\"Website advertisement.html\">Website advertisement</a></font></td>\n");
      out.write("  <td class=\"mytheme\"><font size=\"6px\"><a href=\"mailto:www.vishwapariwar@rediffmail.com\">Feedback</a></font></td>\n");
      out.write("  <td class=\"mytheme\"><font size=\"6px\"><a href=\"mailto:www.vishwapariwar@rediffmail.com\">Backup</a></font></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<h1 style=\"background:green\">Contact Us</h1>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td width=40%>\n");
      out.write("<h2>Office Address</h2\n");
      out.write("</td>\n");
      out.write("<br>\n");
      out.write(" 34,Chandra Shekhar Azad, Near Kotwali Jhansi(U.P.)-284002\n");
      out.write(" <td width=30%>\n");
      out.write(" <br>\n");
      out.write("<h3>Contact and E-Mail</h3>\n");
      out.write("<br>\n");
      out.write(" vishwapariwar@rediffmail.com\n");
      out.write("<br>\n");
      out.write("Advertisement:-  +91-8004327378\n");
      out.write("</td>\t\n");
      out.write("\t</html>\n");
      out.write("\t");
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
