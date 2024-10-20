<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<h1>JLC BookStore</h1>
	<h2>Login Form</h2>
	<font color="red" size="5"> ${RegMsg} </font>
	<font color="red" size="5"> ${LoginMsg} </font>
	<font color="red" size="5"> ${LogoutMsg} </font>
	<form action="mylogin.jlc" method="post">
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login Now" /></td>
			</tr>
		</table>
	</form>
	<h2>
		<a href="register.jsp"> New User Signup </a> || <a href="forgotpw.jsp">
			Forgot My Password </a>
	</h2>
</body>
</html>
