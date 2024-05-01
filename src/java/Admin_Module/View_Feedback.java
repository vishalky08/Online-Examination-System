package Admin_Module;
import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class View_Feedback extends HttpServlet {

       protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            HttpSession session=request.getSession();
            String user=(String)session.getAttribute("user_id");
            String pswd=(String)session.getAttribute("pswd");
            if(user==null &&pswd==null)
            {
                response.sendRedirect("Login?msg=Please login first");
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Admin</title>");
            out.println("<style>"
                +".style1{color:blue;text-decoration:none;font-size:15px;background-color:white;}"
                +".style1:hover{font-size:17px;color:red;}"
                +".style2{color:white;text-decoration:none;font-size:16px;}"
                +".style2:hover{font-size:15px;color:blue;}</style>");
            out.println("</head>");
            out.println("<body bgcolor=#DCDCDC><center>");
            out.println("<div style='width:900px;height:180px;background-image:url(Images/adminBanner.jpg);'></div>"
                    +"<div style='width:900px;height:20px;background-color:white;'>"
                    +"<div style='width:250px;height:20px;background-color:white;float:left;'>"
                    + "<marquee direction=right style='color:crimson;font-weight:bold;font-family:times new roman;'>"
                    +"Online Examinatiion System</marquee></div>"
                    +"<div style='width:10px;height:20px;background-image:url(Images/nav1.png);float:left;'></div>"
                    +"<div style='width:640px;height:20px;background-color:black;float:left;'>"
                    +"<table width=590px height=20px border=0>"
                +"<tr>"
                    +"<td style='width:3px'>&nbsp</td><td style='width:115px;text-align:center;'><a href='Login'class='style2'>Home</a></td>"
                    +"<td style='width:3px'>&nbsp</td><td style='width:115px;text-align:center;'><a href='Change_Password'class='style2'>Change Password</a></td>"
                    +"<td style='width:3px'>&nbsp</td><td style='width:115px;text-align:center;'><a href='Logout'class='style2'>Log Out</a></td>"
                    +"<td style='width:3px'>&nbsp</td>"
                +"</tr>"
                +"</table>"
                +"</div>"
                +"</div>");    
            out.println("<div style='width:900px;height:450px;'>"
                    + "<div style='width:250px;height:450px;background-color:#CCCCCC;float:left;text-align:left;"
                    + "font-size:15px;color:white;border-style:grove;'>"
                    + "<h1 style='text-align:center'>Admin Module</h1>"
                    + "<ul type=box &raquo;>"
                       + "<li><a href='View_User_Detail' class='style1'>View&nbsp;Student&nbsp;Information&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='Search_User' class='style1'>Serach Student&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='Add_Ques' class='style1'>Add Question&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='Update_Ques' class='style1'>Update Question&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='Delete_Ques' class='style1'>Delete Question&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='View_All_Ques' class='style1'>View Question List&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='View_Feedback' class='style1'>View Feedback&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                           + "</ul></div>"
                    + "<div style='width:650px;height:450px;background-color:#DBFDB6;float:right;'>");
             DBCon db=new DBCon();
             db.stmt=db.con.createStatement();
             db.rst=db.stmt.executeQuery("SELECT * from feedback");
             out.println("<table width=600 border=1 cellspacing=0><br><b><span style='color:red;'>All User Feedback</span>"
                     + "</b><br><tr><th>Student Name</th><th>Email</th>"
                     + "<th>Question No.</th><th>Subject</th><th>Query</th></tr>");
                 while(db.rst.next())
             {                
                 out.println("<tr><td style='text-align:center;'>"+db.rst.getString(1)+"</td>"
                         + "<td style='text-align:center;'>"+db.rst.getString(2)+"</td>"
                         +"<td style='text-align:center;'>"+db.rst.getString(3)+"</td>"
                         + "<td style='text-align:center;'>"+db.rst.getString(4)+"</td>"
                         + "<td style='text-align:center;'>"+db.rst.getString(5)+"</td></tr>");
             }
           out.println("</div></div></center></body></html>");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
