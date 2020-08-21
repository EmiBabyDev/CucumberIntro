package cucumberJava;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcel {

	public static void main(String []arg) throws FileNotFoundException, IOException, EncryptedDocumentException, InvalidFormatException {
		try (InputStream inp = new FileInputStream("C:\\Users\\formation\\Documents\\EH_Exercices\\salary_list.xls")) {
			//InputStream inp = new FileInputStream("workbook.xlsx");
			    Workbook wb = WorkbookFactory.create(inp);
			    Sheet sheet = wb.getSheetAt(0);
			    Row row = sheet.getRow(2);
			    Cell cell = row.getCell(3);
			    if (cell == null)
			        cell = row.createCell(3);
			    cell.setCellType(CellType.STRING);
			    cell.setCellValue("a test");
			    // Write the output to a file
			    try (OutputStream fileOut = new FileOutputStream("C:\\Users\\formation\\Documents\\EH_Exercices\\salary_list.xls")) {
			        wb.write(fileOut);
			    }
			}
	}
}