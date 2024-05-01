package Admin_Module;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJIT PATHAK-G
 */
public class Add_Ques extends HttpServlet 
{
       protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
       {
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
            out.println("<body><center>");
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
                    + "<div style='width:250px;height:450px;float:left;text-align:left;"
                    + "font-size:15px;color:white;border-style:grove;background-color:#CCCCCC;'><form action=Add_Ques_Conf>"
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
                    + "<div style='width:650px;height:450px;float:left;background-color:#DBFDB4;'>"
                    + "<br><table width=500px border=0 bgcolor=khaki>"
                    + "<tr><th colspan=3><h1>Add Question</h1></th></tr>"
                    + "<tr height=30><td width=25></td><td width=200>Question Id</td><td><input type=text name=queid placeholder='Question Id'></td></tr>"
                    + "<tr height=30><td width=25></td><td width=200>Question</td><td><textarea rows=5 cols=22  name=que placeholder='Question'></textarea></td></tr>"
                    + "<tr height=30><td width=25></td><td width=200>Option-1</td><td><input type=text name=op1 placeholder='Op1'></td></tr>"
                    + "<tr height=30><td width=25></td><td width=200>Option-2</td><td><input type=text name=op2 placeholder='Op2'></td></tr>"
                    + "<tr height=30><td width=25></td><td width=200>Option-3</td><td><input type=text name=op3 placeholder='Op3'></td></tr>"
                    + "<tr height=30><td width=25></td><td width=200>Option-4</td><td><input type=text name=op4 placeholder='Op4'></td></tr>"
                    + "<tr height=30><td width=25></td><td width=200>Answer</td><td><input type=text name=ans placeholder='Answer'></td></tr>");
                    String str = request.getParameter("msg");
                    if (str != null) 
                    {
                        out.println("<tr height=20px><th colspan=3><span style='color:red;'>" + str + "</span><th></tr>");
                    }
                    out.println("<tr height=30px><th colspan=3><input type=submit value=ADD>&nbsp;&nbsp;&nbsp;&nbsp;"
                            + "<input type=reset value=CLEAR></th></tr>"
                    + "</table>"
                    + "</div></form>"
                    + "</div>");
            out.println("</center></body></html>");
         }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
