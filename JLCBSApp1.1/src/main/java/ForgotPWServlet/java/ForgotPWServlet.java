package ForgotPWServlet.java;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlcindia.bookstore.Controllers.JLCBaseController;

@WebServlet(name = "mypassword", urlPatterns = "/mypassword.jlc")
public class ForgotPWServlet extends JLCBaseController {

    
    public void service(HttpServletRequest req, HttpServletResponse res) 
        throws ServletException, IOException {
        System.out.println("ForgotPWServlet - service()");

        // 1. Collect the Input
        String email = req.getParameter("email");

        // 2. Process
        String pw = userService.getPassword(email);

        // 3. Prepare to forward
        String page;
        if (pw == null) {
            page = "forgotpw.jsp";
            String msg = "Invalid Email ID";
            req.setAttribute("MyMsg", msg);
        } else {
            page = "passwordInfo.jsp";
            req.setAttribute("MyPassword", pw);
        }

        // Forward the request
        RequestDispatcher rd = req.getRequestDispatcher(page);
        rd.forward(req, res);
    }
}
