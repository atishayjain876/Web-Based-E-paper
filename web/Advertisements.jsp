<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%
    
        String pagename=request.getParameter("pagename");
        String bannerposition=request.getParameter("bannerposition");
        String bannersize=request.getParameter("bannersize");
        String uploadbanner=request.getParameter("uploadbanner");
        String name=request.getParameter("name");
       
        String email=request.getParameter("email");
        String contactno=request.getParameter("contactno");


            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root" ); 
            PreparedStatement st=
            con.prepareStatement("insert into  dvpadvertisementtable values(?,?,?,?,?,?,?)");
            st.setString(1,pagename);
            st.setString(2,bannerposition);
            st.setString(3,bannersize);
            st.setString(4,uploadbanner);
            st.setString(5,name);
            st.setString(6,email);
            st.setString(7,contactno);

            st.executeUpdate();
            response.sendRedirect("dvp.html");
                   
   %>
