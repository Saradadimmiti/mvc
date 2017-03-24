package in.javahome.mvc.exceptionhandlers;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyAppExceptionHandler {
	@ExceptionHandler(value=SQLException.class)
	public String handelSQLExceprion(SQLException e) {
		// Store the stack trace in log file
		// Forward the request to error page
		return "sql";
	}
}
