package Admin_Module;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author AJIT PATHAK-G
 */
public class Rules extends HttpServlet 
{
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
       {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            
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
                    
                +"</div>"
                +"</div>");    
            out.println("<div style='width:900px;height:450px;'>"
                    + "<div style='width:650px;height:450px;float:left;background-color:#DBFDB4;'>"
                    + "<h1 style='color:black;text-align:center;'>Exam Rules</h1>"
                    + "<ul type=square>"
                    + "<li style='text-align:left;'>20 Question are listed in Each question paper.</li><br>"
                    + "<li style='text-align:left;'>Each Question Carry 5 Marks.</li><br>"
                    + "<li style='text-align:left;'>There are no Negative Marking.</li><br>"
                    + "<li style='text-align:left;'>In each test 50%(10 out of 20)Question must be correct for passing Marks.</li><br>"
                    +"<h4 style='text-align:center;margin:0px;color:green;'>Thanks for your kind Attention<br>Best of Luck</h4>"
                    + "<a href=Login>Home Page</a></ul>"
                    + "</table>"
                    + "</div></form>"
                    + "</div>");
            
            out.println("<a href=Login>Home Page</a></center></body></html>");
         }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
