package Admin_Module;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Contact_Us extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Contact us</title>");            
            out.println("</head>");
            out.println("<body><center>"+
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
            "<th style='color:white;'><a href='About_Us' style='color:white;text-decoration:none;'>CONTACT US</a></th>" +
            "</tr>" +
            "</table>" +
            "</div>" +
            "</div>" +
            "<div style='width:900px;height:400px;background-image:url(Images/ska.jpg);'><br><br><br><br>"
                                + "<div style='width:400px;height:300px;float:left;background-color:'>"
                                + "<fieldset style='width:360px;height:200px;border:1px solid brown;border-radius:8px;color:purple;font-size:20px;'>"
                                + "<br><h4>ONLINE EXAMINATION SYSTEM</h4>Developed By:<br>Online Examination Team<br>8545802070"
                                + "</div>"
                                + "<div style='width:450px;height:228px;float:right;'>"
                                + "<br><img src='Images/contact_us.jpg' width='320' height='200' bgcolor='khaki'>"
                                + "</div>"
                                + "</div>"

                                + "<div style='width:900px;height:40px;background-color:gray;color:white;'>"
                                + "&copy; Online Examination System<br>Powered By: Online Exam Team</div>");

                        out.println("</body>");
                        out.println("</html>");
                    } finally {            
                        out.close();
                    }
                }
            }
