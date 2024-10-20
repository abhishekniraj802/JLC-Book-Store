<!DOCTYPE html>
<html>
<body>
	<div align="center">
		<h1>JLC BookStore</h1>
		<h2>Update Profile Form</h2>
		<font color="red" size="5"> ${UpdateMsg} </font>
		<form action="updateProfile.jlc" method="post">
			<table>
				<tr>
					<td>UserId</td>
					<td>${MyUserInfo.userId}<input type="hidden" name="userId"
						value="${MyUserInfo.userId}" />
					</td>
				</tr>
				<tr>
					<td>Full Name</td>
					<td><input type="text" name="fullName"
						value="${MyUserInfo.fullName}" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"
						value="${MyUserInfo.email}" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone"
						value="${MyUserInfo.phone}" /></td>
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td><input type="text" name="dob" value="${MyUserInfo.dob}"
						readonly="readonly" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td>${MyUserInfo.gender}</td>
				</tr>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"
						value="${MyUserInfo.username}" readonly="readonly" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"
						value="${MyUserInfo.password}" readonly="readonly" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Update My Profile" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
