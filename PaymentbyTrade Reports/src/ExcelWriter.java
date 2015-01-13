import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelWriter
{


	public static void main(String[] args) throws IOException 
	{
		
	
		Workbook wb = new XSSFWorkbook();
		CreationHelper createHelper = wb.getCreationHelper();
		
		//row styles
		CellStyle lBlue = wb.createCellStyle();
		lBlue.setFillForegroundColor(IndexedColors.SKY_BLUE.getIndex());
		lBlue.setFillPattern(CellStyle.SOLID_FOREGROUND);
		
		
		
		
		Sheet sheet1 = wb.createSheet("Payment by Trade");
		ArrayList <Row> rows = new ArrayList<Row>();
		rows.add(sheet1.createRow(0));
		//rows.get(0).setRowStyle(lBlue);
		Cell tVendor = rows.get(0).createCell(0);
		Cell tTrade = rows.get(0).createCell(1);
		Cell tM1 = rows.get(0).createCell(2);
		Cell tM2 = rows.get(0).createCell(3);
		Cell tM3 = rows.get(0).createCell(4);
		Cell tM4 = rows.get(0).createCell(5);
		Cell tM5 = rows.get(0).createCell(6);
		Cell tM6 = rows.get(0).createCell(7);
		Cell tM7 = rows.get(0).createCell(8);
		Cell tM8 = rows.get(0).createCell(9);
		Cell tM9 = rows.get(0).createCell(10);
		Cell tM10 = rows.get(0).createCell(11);
		Cell tM11 = rows.get(0).createCell(12);
		Cell tM12 = rows.get(0).createCell(13);
		
		
		
		
		tVendor.setCellValue("Vendor");
		tTrade.setCellValue("");
		tM1.setCellValue("January");
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		FileOutputStream fileOut = new FileOutputStream("exports\\workbook.xlsx");
	    wb.write(fileOut);
	    fileOut.close();

	}

}
