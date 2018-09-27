<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href = "taurus.css" rel = "stylesheet" type = "text/css">
		<title>Login Page</title>
	</head>
	
	<body>
		<form>
			<table>
  				<div class = "block">
    				<input type = "text" placeholder = "Username" name = "user" required>
    				<input type = "password" placeholder = "Password" name = "pass" required>
    				<button type = "submit">Login</button>
  				</div>

  				<div class = "block" style = "background-color : #f1f1f1">
    				<button type = "button" class = "btnCancel">Cancel</button>
    				<span class = "register"><a href = "#">Register</a></span>
  				</div>
			</table>
		</form>
	</body>
</html>