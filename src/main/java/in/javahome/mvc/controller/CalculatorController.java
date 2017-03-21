package in.javahome.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {
	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public String getForm() {
		return "calculator";
	}

	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
	public String calculate(@RequestParam(name="one",required=false) Integer i, 
			@RequestParam("two") Integer j, ModelMap map) {
		int result = i + j;
		map.addAttribute("result", result);
		return "calculator";
	}
	
//  Demo using Path variables	
	@RequestMapping(value = "/calculate/{one}/{two}", method = RequestMethod.GET)
	@ResponseBody
	public String multiply(@PathVariable("one") Integer i, 
			@PathVariable("two") Integer j, ModelMap map) {
		int result = i + j;
		return "Result is "+result;
	}

}
