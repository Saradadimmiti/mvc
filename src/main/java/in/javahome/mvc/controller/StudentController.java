package in.javahome.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.mvc.model.Student;

@Controller
public class StudentController {
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public void addStudent(@RequestBody Student std) {
		System.out.println(std.toString());
	}
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public String selectStudent() {
		return "student";
	}
	
}
