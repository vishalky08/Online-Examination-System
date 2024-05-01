/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class About_Us extends HttpServlet 
{

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
            "<marquee>Welcome You all in Online Examination 2023</marquee></div>" +
            "<div style='width:10px;height:20px;background-color:white;float:left;'>" +
            "<img src='Images/nav1.png'></div>" +
            "<div style='width:590px;height:20px;float:left;'>" +
            "<table width=590 height=20>" +
            "<tr><th style='color:white;'><a href='Login' style='color:white;text-decoration:none;'>HOME</a></th>" +
            "<th style='color:white;'><a href='About_Us' style='color:white;text-decoration:none;'>ABOUT US</a></th>" +
            "<th style='color:white;'><a href='Rules' style='color:white;text-decoration:none;'>RULES</a></th>" +
            //"<th style='color:white;'><a href='Feedback' style='color:white;text-decoration:none;'>FEEDBACK</a></th>" +
            "<th style='color:white;'><a href='Contact_Us' style='color:white;text-decoration:none;'>CONTACT US</a></th>" +
            "</tr>" +
            "</table>" +
            "</div>" +
            "</div>" +
            "<div style='width:900px;height:600px;background-image:url(Images/ska.jpg);'>" +
            "<br>" +
            "<div style='width:550px;height:580px;float:left;'>"
                                + "<fieldset style='width:500px;height:540px;border:3px solid blue;border-radius:8px;color:purple;font-size:20px;'>"
                                + "<br>Online Examination System is a MCQ(Multiple Choice Question)based examination system "
                                + "which is built using JAVA and MySql it provides an easy to see interface for<br>"
                                + "test Conductor and Student appearing in the examination"
                                + "</fieldset></div>"+
            "<div style='width:340px;height:580px;float:right;'><br><br><br><br><br><br><br>"
                                + "<img src='Images/think_exam_banner.png'>"
                                + "</div></div>"+                
            "</center>" +
            "</body>	" +
            "</html>");
        } finally {
            out.close();
        }
    }
}
