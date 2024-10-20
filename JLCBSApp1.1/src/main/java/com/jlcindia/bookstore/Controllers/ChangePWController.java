package com.jlcindia.bookstore.Controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.jlcindia.bookstore.to.UserTO;


public class ChangePWController extends JLCBaseController {
	public String process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("ChangePWController-process()");
		// 1.Collect the Input
		String currentpw = req.getParameter("currentpw"); // Not using now
		String newpw = req.getParameter("newpw");
		String confirmpw = req.getParameter("confirmpw");
//2.Process 
		int updateStatus = 0;
		if (newpw.equals(confirmpw)) {
			HttpSession session = req.getSession(false);
			if (session == null) {
				String msg = "Session Expired. Login Again";
				req.setAttribute("LoginMsg", msg);
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, res);
			} else {
				UserTO userTO = (UserTO) session.getAttribute("MyUserInfo");
				int userId = userTO.getUserId();
				updateStatus = userService.changePassword(userId, newpw);
			}
		}
// 3.Prepare to forward 
		String page = "";
		if (updateStatus == 1) {
			page = "changepwStatus.jsp";
			String msg = "Your Password Updated Successfully...";
			req.setAttribute("PwMsg", msg);
		} else {
			page = "changepw.jsp";
			String msg = "Something Wrong ..Enter Passwords correctly...";
			req.setAttribute("PwMsg", msg);
		}
		return page;
	}
}
