package in.javahome.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcome() {
		return "redirect:https://www.google.in/";
	}
}
