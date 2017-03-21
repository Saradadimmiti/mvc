package in.javahome.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public void addStudent() {
		// logic
	}
	
	@RequestMapping(value="/student", method=RequestMethod.PUT)
	public void updateStudent() {
		// logic
	}
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public void selectStudent() {
		// logic
	}
	
	@RequestMapping(value="/student", method=RequestMethod.DELETE)
	public void deleteStudent() {
		// logic
	}
}
