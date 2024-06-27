package myserv2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String userName = request.getParameter("userName");
            out.print("Welcome " + userName);
            HttpSession session=request.getSession();
            session.setAttribute("uname",userName);
           
            out.print("<a href='servlet2'>visit</a>");
            out.close();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}