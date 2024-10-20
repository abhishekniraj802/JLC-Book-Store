package com.jlcindia.bookstore.Controllers;

import javax.servlet.http.HttpServlet;

import com.jlcindia.bookstore.service.UserService;
import com.jlcindia.bookstore.service.UserServiceImpl;

public abstract class JLCBaseServlet extends HttpServlet {

	public static UserService userService;

	static {
		userService = new UserServiceImpl();
	}
}