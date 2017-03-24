package in.javahome.mvc.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

public class StdentExcelView extends AbstractXlsxView{


	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			// take data available in the model
		   // create excel out of it
		
		Sheet stdsSheet = workbook.createSheet("Students");
		
//		Create first row
		Row headerRow = stdsSheet.createRow(0);
		headerRow.createCell(0).setCellValue("Student Names");
		List<String>  studentsList = (List<String>) model.get("StudentsList");
//		Create rows to add students names
		for(int i=0; i<studentsList.size() ; i++){
			Row dataRow = stdsSheet.createRow(i+1);
			dataRow.createCell(0).setCellValue(studentsList.get(i));
		}
	}

}
