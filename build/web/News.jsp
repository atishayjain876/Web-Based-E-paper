<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%
    //String button1=request.getParameter("btn1");
    //System.out.println(button1);
   // if(button1.equals("Subscribed"))
    //{
        String heading=request.getParameter("heading");
        String news=request.getParameter("news");
        String pc=request.getParameter("photocaption");
        String bs=request.getParameter("uploadphoto");
        String ns=request.getParameter("newssource");
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String contactno=request.getParameter("contactno");


            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root" ); 
            PreparedStatement st=
            con.prepareStatement("insert into  sharenewstable values(?,?,?,?,?,?,?,?)");
            st.setString(1,heading);
            st.setString(2,news);
            st.setString(3,pc);
            st.setString(4,bs);
            st.setString(5,ns);
            st.setString(6,name);
            st.setString(7,email);
            st.setString(8,contactno);

            st.executeUpdate();
            response.sendRedirect("dvp.html");
                   
   %>