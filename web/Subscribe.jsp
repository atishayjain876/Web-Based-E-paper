<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String mobileno=request.getParameter("mobileno");
        String address=request.getParameter("address");
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root" ); 
PreparedStatement st=
            con.prepareStatement("insert into  subscribetable values(?,?,?,?)");
            st.setString(1,name);
            st.setString(2,email);
            st.setString(3,mobileno);
            st.setString(4,address);
            st.executeUpdate();
            response.sendRedirect("dvp.html");                   
   %>