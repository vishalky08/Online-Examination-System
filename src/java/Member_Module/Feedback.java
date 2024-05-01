package Member_Module;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Feedback extends HttpServlet 
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
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Feedback</title>");            
            out.println("</head>");
            out.println("<body bgcolor=#DCDCDC><center>");
            out.println("<center>" +
                "<div style='width:900px;height:200px;'>" +
                "<img src='Images/adminBanner.jpg' width='900' height='200'>" +
                "</div>" +
                "<div style='width:900px;height:20px;background-color:black;'>" +
                "<div style='width:250px;height:20px;background-color:white;float:left;color:red;'>" +
                "<marquee>Welcome You all in Online Examination 2016</marquee></div>" +
                "<div style='width:10px;height:20px;background-color:white;float:left;'>" +
                "<img src='Images/nav1.png'></div>" +
                "<div style='width:590px;height:20px;float:left;'>" +
                "<table width=590 height=20>" +
                "<tr><th style='color:white;'><a href='Login' style='color:white;text-decoration:none;'>HOME</a></th>" +
                "<th style='color:white;'><a href='About_Us' style='color:white;text-decoration:none;'>ABOUT US</a></th>" +
                "<th style='color:white;'><a href='Rules' style='color:white;text-decoration:none;'>RULES</a></th>" +
                "<th style='color:white;'><a href='Feedback' style='color:white;text-decoration:none;'>FEEDBACK</a></th>" +
                "<th style='color:white;'><a href='Contact_Us' style='color:white;text-decoration:none;'>CONTACT US</a></th>" +
                "</tr></table></div></div>" +
                "<div style='width:900px;height:400px;background-image:url(Images/ska.jpg);'>"
                + "<div style='width:420px;height:400px;float:left;'><form action= Feedback_Conf>"
                + "<table width=400 border=1><tr bgcolor='purple'>"
                + "<td style='color:white;text-align:center;'><b>FEEDBACK</b></td></tr><br>"
                + "<tr height=200><td>"
                + "<table width=400 height=200 border=0>"
                + "<br>"
                + "<tr>"
                + "<th width=300>Student Name&nbsp;&nbsp;:</th>"
                + "<th  width=300><input type='text' name=name placeholder='Enter Your Name' style='text-align:center;' required></th></tr>"
                + "<tr>"
                + "<th  width=300><br>Email_Id&nbsp;&nbsp;:</th>"
                + "<th  width=300><br><input type='email' name=email placeholder='Enter Email_id' style='text-align:center;' required></th></tr>"
                + "<tr>"
                + "<th width=300><br>Question No.&nbsp;&nbsp;:</th>"
                + "<th width=300><br><input type='number' name=qno placeholder='Enter Question No.' style='text-align:center;' required></th></tr>"
                + "<tr>"
                + "<th width=300><br>Subject&nbsp;&nbsp;:</th>"
                + "<th width=300><br><input type='text' name=sub placeholder='Enter Subject Name' style='text-align:center;' required></th></tr>"
                + "<tr>"
                + "<th width=300><br>Query&nbsp;&nbsp;:</th>"
                + "<th  width=300><br><textarea rows=8 cols=21 name=query placeholder='Enter Your Feedback  In Short AS possible AS' style='text-align:center;' "
                + "required></textarea></th></tr>" 
                +"<tr><td colspan=2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                + "<input type='SUBMIT' value='SUBMIT&nbsp;QUERY' style='border-radius:5px;background-color:blue;color:white;width:120px;'>"
                + "</table></form></td></tr></table></form></div>"
                + "<br><div style='width:460px;height:375px;float:right;'>"
                + "<br><br><br><br><br><br><h3 style='color:red;'>PLEASE SEND YOUR<br>QUERIES AND VIEW</h3>"
                + "</div></div>"
                + "<div style='width:900px;height:40px;background-color:gray;color:white;'>"
                + "&copy; Online Examination System<br>Powered By: Online Exam Team</div>");
            out.println("</body>");
            out.println("</html>");
        }
        finally
        {            
            out.close();
        }
    }
}
