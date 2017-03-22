<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<html>
<body>
	<h2>Register Student</h2>
	
	<html:form action="student.htm" method="POST" commandName="std">
		Name <html:input path="name"/><html:errors path="name"/> <br>
		Email <html:input path="mail"/><html:errors path="mail"/><br>
		Phone <html:input path="phone"/><br>
		<html:select path="course"><br>
		<html:option value="Select Course"/>
		<html:option value="Java"/>
		<html:option value="Cloud"/>
		<html:option value="DevOps"/>
		</html:select>
		<input type="submit" value="Register>>">
	</html:form>
</body>
</html>
