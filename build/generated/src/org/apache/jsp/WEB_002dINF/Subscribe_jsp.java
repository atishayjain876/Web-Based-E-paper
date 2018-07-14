package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class Subscribe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String button1=request.getParameter("btn1");
    System.out.println("button1");
    if(button1.equals("Subscribed"))
    {
        String name=request.getParameter("Name");
        String email=request.getParameter("E-Mail");
        String number=request.getParameter("Mobile No.");
        String address=request.getParameter("Address");
        
         Class.forName("com.mysql.jdbc.Driver");//used to load driver
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root" ); 
            PreparedStatement st=
con.prepareStatement("select *  from subscribetable where mobileno=?");
            st.setString(1,name);
            st.setString(1,email);
            st.setString(1,number);
            st.setString(1,address);
            st.executeQuery();
            ResultSet rs=st.executeQuery();
            if(rs.next())
            { 
                session.setAttribute("ACCESS",name);
                response.sendRedirect("Menupage.jsp");         
            }
            else
            {
            out.println("Not Subscribed");
            }
            
    }
    
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
