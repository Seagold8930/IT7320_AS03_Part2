<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href = "taurus.css" rel = "stylesheet" type = "text/css">
		<title>Registration Page</title>
	</head>
	<body>
		<form>
			<table>
  				<div class = "block">
    				<input type = "text" placeholder = "Enter username" name = "user" required>
    				<input type = "password" placeholder = "Enter password" name = "pass" required>
    				<input type = "password" placeholder = "Confirm password" name = "passConfirm" required>
    				<button type = "submit">Register</button>
  				</div>

  				<div class = "block" style = "background-color : #f1f1f1">
    				<button type = "button" class = "btnCancel">Cancel</button>
    				<button type = "button" class = "btnCancel" style = "float : right">Another</button>
  				</div>
			</table>
		</form>
	</body>
</html>