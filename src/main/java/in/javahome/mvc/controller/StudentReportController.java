package in.javahome.mvc.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;

import in.javahome.mvc.view.StdentExcelView;
import in.javahome.mvc.view.StudentPdfView;

@Controller
public class StudentReportController {
	@RequestMapping(value="/studentExcel", method=RequestMethod.GET)
	public View downloadExcel(Map<String, Object> map){
		// get student data from DB
		List<String> students = Arrays.asList("Hari","Rama","Githa","Sitha");
		map.put("StudentsList", students);
		return new StdentExcelView();
	}
	
	@RequestMapping(value="/studentPdf", method=RequestMethod.GET)
	public View downloadPdfl(Map<String, Object> map){
		// get student data from DB
		List<String> students = Arrays.asList("Hari","Rama","Githa","Sitha");
		map.put("StudentsList", students);
		return new StudentPdfView();
	}
}
