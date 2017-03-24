package in.javahome.mvc.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.mvc.model.Student;

@Controller
public class StudentController {
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String addStudent(@Valid @ModelAttribute("std") Student std, BindingResult result) {
		if(result.hasErrors()){
			System.out.println("validation errros..");
			return "student";
		}
		// create student data in db and show success message
		return "student";
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String selectStudent(ModelMap map) throws SQLException {
		if(10>5){
			throw new SQLException();
		}
		map.addAttribute("std", new Student());
		return "student";
	}

}
