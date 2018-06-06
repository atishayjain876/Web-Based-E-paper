<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%
        String email=request.getParameter("email");
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root"); 
            PreparedStatement st=
            con.prepareStatement("insert into  emailtable values(?)");
            st.setString(1,email);
            st.executeUpdate();
            response.sendRedirect("dvp.html");
                   
   %>