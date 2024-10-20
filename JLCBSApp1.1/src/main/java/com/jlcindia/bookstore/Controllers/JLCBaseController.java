package com.jlcindia.bookstore.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jlcindia.bookstore.service.UserService;
import com.jlcindia.bookstore.service.UserServiceImpl;

public abstract class JLCBaseController {
	static UserService userService;
	static {
		userService = new UserServiceImpl();
	}

	public abstract String process(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException;
}
