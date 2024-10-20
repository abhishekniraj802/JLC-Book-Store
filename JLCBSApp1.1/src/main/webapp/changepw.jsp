<!DOCTYPE html>
<html>
<body>
	<h1>JLC BookStore</h1>
	<h2>Password Change Form</h2>
	<font color="red" size="5"> ${PwMsg} </font>
	<form action="/changepw.jlc" method="post">
		<table>
			<tr>
				<td>Current Password</td>
				<td><input type="password" name="currentpw" /></td>
			</tr>
			<tr>
				<td>New Password</td>
				<td><input type="password" name="newpw" /></td>
			</tr>
			<tr>
				<td>Confirm New Password</td>
				<td><input type="password" name="confirmpw" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Change Now" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
