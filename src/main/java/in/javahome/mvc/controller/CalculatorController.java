package in.javahome.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public String getForm() {
		return "calculator";
	}

	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
	public String calculate(@RequestParam("one") Integer i, 
			@RequestParam("two") Integer j, ModelMap map) {
		int result = i + j;
		map.addAttribute("result", result);
		return "calculator";
	}

}
