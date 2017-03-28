package in.javahome.mvc.controller;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class StudentsUploadController {
	@RequestMapping(value="/studentsUpload",method=RequestMethod.GET)
	public String getForm(){
		return "studentsUpload";
	}
	@RequestMapping(value="/studentsUpload",method=RequestMethod.POST)
	public String studenExcel(@RequestParam("file") MultipartFile file) throws IOException{
		Workbook workbook = new XSSFWorkbook(file.getInputStream());
		Sheet sheet = workbook.getSheetAt(0);
		 Iterator<Row> rows = sheet.iterator();
		while(rows.hasNext()){
			Row row = rows.next();
			System.out.println("Name "+row.getCell(0).getStringCellValue());
			System.out.println("Email "+row.getCell(1).getStringCellValue());
			System.out.println("Phone "+row.getCell(2).getStringCellValue());
		}
		return "success";
	}
}
