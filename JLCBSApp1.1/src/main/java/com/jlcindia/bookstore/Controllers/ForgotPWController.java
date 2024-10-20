package com.jlcindia.bookstore.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ForgotPWController extends JLCBaseController {
	public String process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("ForgotPWController-process()");

		// 1.Collect the Input
		String email = req.getParameter("email");
		// 2.Process
		String pw = userService.getPassword(email);

//3.Prepare to forward 
		String page = "";
		if (pw == null) {
			page = "forgotpw.jsp";
			String msg = "Invalid Email ID";
			req.setAttribute("MyMsg", msg);
		} else {
			page = "passwordInfo.jsp";
			req.setAttribute("MyPassword", pw);
		}

		return page;
	}
}
