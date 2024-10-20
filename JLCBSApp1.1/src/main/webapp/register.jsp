<%@ page session="false"%> 
<!DOCTYPE html> 
<html> 
<body> 
<div align="center"> 
<h1>JLC BookStore</h1> 
<h2>Registration Form</h2> 
<font color="red" size="5"> ${RegMsg} </font> 
<form action="myreg.jlc" method="post"> 
<table> 
<tr> 
<td>Full Name</td> 
<td><input type="text" name="fullName" /></td> 
</tr> 
<tr> 
<td>Email</td> 
<td><input type="text" name="email" /></td> 
</tr> 
<tr> 
<td>Phone</td> 
<td><input type="text" name="phone" /></td> 
</tr> 
<tr> 
<td>Date of Birth</td> 
<td><input type="text" name="dob" /></td> 
</tr> 
<tr> 
<td>Gender</td> 
<td><input type="radio" name="gender" value="Male" /> Male <input 
type="radio" name="gender" value="Female" /> Female</td> 
</tr> 
<tr> 
<td>Username</td> 
<td><input type="text" name="username" /></td> 
</tr> 
<tr> 
<td>Password</td> 
<td><input type="password" name="password" /></td> 
</tr> 
<tr> 
<td colspan="2" align="center"><input type="submit" 
value="Register Now" /></td> 
</tr> 
</table> 
</form> 
</div> 
</body> 
</html>
