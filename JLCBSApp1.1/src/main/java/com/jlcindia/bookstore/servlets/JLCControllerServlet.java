package com.jlcindia.bookstore.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlcindia.bookstore.Controllers.JLCBaseController;

@WebServlet(name = "myControllerServlet", urlPatterns = "*.jlc", loadOnStartup = 1)
public class JLCControllerServlet extends JLCBaseServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String URI = request.getRequestURI();
		System.out.println(URI);

		JLCBaseController mycontroller = null;
		String page = "";

		if (URI.endsWith("mylogin.jlc")) {
			mycontroller = loginController;
		} else if (URI.endsWith("myreg.jlc")) {
			mycontroller = registerController;
		} else if (URI.endsWith("changepw")) {
			mycontroller = changePWController;
		} else if (URI.endsWith("mypassword.jlc")) {
			mycontroller = forgotPWController;
		} else if (URI.endsWith("updateProfile.jlc")) {
			mycontroller = updateProfileController;
		} else if (URI.endsWith("editProfile.jlc")) {
			mycontroller = updateProfileController;
		} else if (URI.endsWith("mylogout.jlc")) {
			mycontroller = logoutController;
		}

		page = mycontroller.process(request, response);

		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);

	}
}