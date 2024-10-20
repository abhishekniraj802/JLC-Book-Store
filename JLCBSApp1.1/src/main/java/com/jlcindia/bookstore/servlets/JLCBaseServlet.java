package com.jlcindia.bookstore.servlets;

import javax.servlet.http.HttpServlet;
import com.jlcindia.bookstore.Controllers.ChangePWController;
import com.jlcindia.bookstore.Controllers.ForgotPWController;
import com.jlcindia.bookstore.Controllers.LoginController;
import com.jlcindia.bookstore.Controllers.LogoutController;
import com.jlcindia.bookstore.Controllers.RegisterController;
import com.jlcindia.bookstore.Controllers.UpdateProfileController;

public abstract class JLCBaseServlet extends HttpServlet {

	static LoginController loginController;
	static RegisterController registerController;
	static ChangePWController changePWController;
	static ForgotPWController forgotPWController;
	static UpdateProfileController updateProfileController;
	static LogoutController logoutController;

	static {
		loginController = new LoginController();
		registerController = new RegisterController();
		changePWController = new ChangePWController();
		forgotPWController = new ForgotPWController();
		updateProfileController = new UpdateProfileController();
		logoutController = new LogoutController();
	}
}