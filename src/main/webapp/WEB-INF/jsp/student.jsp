<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
	<h2>Register Student</h2>
	<form action="student.htm" method="post">
	
	 Name <input type="text" name="name">
	 Email <input type="text" name="mail">
	 Phone <input type="text" name="phone">
	 <select name="course">
	 	<option>Select Course</option>
	 	<option>Java</option>
	 	<option>Cloud</option>
	 	<option>DevOps</option>
	 </select>
	 <input type="submit" value="Register>>">
	</form>
</body>
</html>
