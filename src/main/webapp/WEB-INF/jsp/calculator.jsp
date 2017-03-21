<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
	<h2>Calculator</h2>
	<form action="calculate.htm" method="post">
	 Number 1 <input type="text" name="one">
	 Number 2 <input type="text" name="two">
	 <input type="submit" value="Calculate">

	 <c:if test="${result ne null}">
	 	<br>
	 	Result is ${result}
	 </c:if>
	</form>
</body>
</html>
