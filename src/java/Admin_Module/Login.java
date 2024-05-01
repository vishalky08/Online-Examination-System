package Admin_Module;
import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Login extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {                  
            out.println(""
            + "<html>" +
            "<head>" +
            "<title>webpage</title>" +
            "</head>" +
            "<body>" +
            "<center>" +
            "<div style='width:900px;height:200px;'>" +
            "<img src='Images/adminBanner.jpg' width='900' height='200'>" +
            "</div>" +
            "<div style='width:900px;height:20px;background-color:black;'>" +
            "<div style='width:250px;height:20px;background-color:white;float:left;color:red;'>" +
            "<marquee>Welcome You all in Online Examination 2022</marquee></div>" +
            "<div style='width:10px;height:20px;background-color:white;float:left;'>" +
            "<img src='Images/nav1.png'></div>" +
            "<div style='width:590px;height:20px;float:left;'>" +
            "<table width=590 height=20>" +
            "<tr><th style='color:white;'><a href='Login' style='color:white;text-decoration:none;'>HOME</a></th>" +
            "<th style='color:white;'><a href=About_Us style='color:white;text-decoration:none;'>ABOUT US</a></th>" +
            "<th style='color:white;'><a href=Rules style='color:white;text-decoration:none;'>RULES</a></th>" +
           // "<th style='color:white;'><a href=Feedback style='color:white;text-decoration:none;'>FEEDBACK</a></th>" +
            "<th style='color:white;'><a href=Contact_Us style='color:white;text-decoration:none;'>CONTACT US</a></th>" +
            "</tr>" +
            "</table>" +
            "</div>" +
            "</div>" +
            "<div style='width:900px;height:450px;background-image:url(Images/ska.jpg);'>" +
            "<br>" +
            "<div style='width:300px;height:450px;float:left;'>" +
            "" +
            "<fieldset style='width:230;height:auto;border:2px solid brown;'>" +
            "<form action=Login_Authentication>" +
            "<table width='230' height='30'>" +
            "" +
            "<tr>" +
            "<th style='color:white;background-color:blue;width:310px;'>LogIn</th>" +
            "</tr>" +
            "<tr>" +
            "<td style='color:red;'>Username:</td></tr>" +
            "<tr><td><input type='text' name='t1' style='border-radius:5px;border:1px solid brown;width:230px;height:20px;text-align:center;' placeholder='UserName' required></td>" +
            "</tr>" +
            "<tr>" +
            "<td style='color:red;'>Password :</td></tr>" +
            "<tr><td><input type='password' name='t2' style='border-radius:5px;border:1px solid brown;width:230px;height:20px;text-align:center;' placeholder='Enter Password' required></td>" +
            "</tr>" +
            "" +
            "<tr>" +
            "<td>&nbsp;&nbsp;&nbsp;<input type='SUBMIT' value='SUBMIT' style='border-radius:5px;background-color:blue;color:white;width:90px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
            "<input type='RESET' value='RESET' style='border-radius:5px;background-color:blue;color:white;width:90px;'></td>" +
            "</tr>" +
            "" +
            "<tr>" +
            "<th style='color:red;'>New Member ?<a href='Registration'>Click here:</a></th>" +
            "</tr>" +
            "</table></form>" +
            "</fieldset>" +
            "" +
            "<fieldset style='width:230;height:200px;border:2px solid brown;'>" +
            "" +
           
            "</fieldset>" +
            "</div>" +
            "" +
            "<div style='width:600px;height:500px;float:right;'>" +
            "<img src='Images/funPicture1.jpg' width='570' height='150'>" +
            "" +
            "<tr>Online Examination System has Divided exams in two categories and each category has a " +
            "<span>sub category:</span></tr>" +
            "" +
            "<table width='500'>" +
            "<tr>" +
            "<td><img src='Images/bulet.jpg' ></td><td>Computer exams</td>" +
            "</tr>" +
            "" +
            "<tr>" +
            "<td><img src='Images/bullet.jpg' ></td><td>C Language Test</td>" +
            "</tr>" +
            "" +
            "<tr>" +
            "<td><img src='Images/bullet.jpg' ></td><td>C ++ Language Test</td>" +
            "</tr>" +
            "" +
            "<tr>" +
            "<td><img src='Images/bullet.jpg' ></td><td>Java Test</td>" +
            "</tr>" +
            "" +
            "<tr>" +
            "<td><img src='Images/bullet.jpg' ></td><td>Other Test</td>" +
            "</tr>" +
            "" +
            "<tr>" +
            "<td><img src='Images/bullet.jpg' ></td><td>General knowledge</td>" +
            "</tr>" +
            "" +
            "<tr>" +
            "<td><img src='Images/bulet.jpg' ></td><td>English Test</td>" +
            "</tr>" +
            "</table>" +
            "</div>" +
            "</div>" +
            "<div style='width:900px;height:50px;background-color:gray;'>" +
            "<div style='width:900px;height:20px;background-color:#DCDCDC;'>"
            + "<h5 style='position:absolute; overflow:hidden; left:850px; top:660px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=red>New Member</font>&nbsp;&nbsp;&nbsp;<a href=Registration>Click Here</a></h5></div>"+
            "<div style='width:900px;height:30px;'>"
            + "<h4  style='text-align:center;"
            + " position:absolute; overflow:hidden; left:600px; top:690px; width:250px; height:100px;"
            + " text-decoration:Blink;font-family:Monotype Corsiva;'>&copy;Online Examination Team</h4>"
            + "</div>"+
            "</div>"+
            "</center>" +
            "<div>" +
            "</body>	" +
            "</html>");
        
        }
        catch(Exception e)
        {
            out.close();
        }
    }
}
