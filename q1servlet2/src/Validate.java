import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Validate extends HttpServlet {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
     try {
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");

        if(pass.equals("prabhjot"))
        {
           RequestDispatcher rd = request.getRequestDispatcher("Welcome");
           rd.forward(request, response);
        }
        else
         {
         out.println("<b>You have entered incorrect password</b>");
                RequestDispatcher rd = request.getRequestDispatcher("form.html");
                rd.include(request, response);
            }
        }finally {            
        }
        
    }
}