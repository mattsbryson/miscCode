import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.VerticalAlign;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTable.XWPFBorderType;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn;

public class mWordWriter {
	 
    public static void docWriter(String subName, String conTrade, ArrayList <String> scopeNum, ArrayList <String> scopeDesc, ArrayList <String> altNum, ArrayList <String> altDesc, ArrayList <String> exclNum, ArrayList <String> exclDesc, ArrayList <String> schdValNum, ArrayList <String> schdValDesc, ArrayList <String> cOrderNum, ArrayList <String> cOrderDesc, String orginalValue, String revisedValue) 
    {
        XWPFDocument document = new XWPFDocument();
 
        XWPFParagraph paragraphOne = document.createParagraph();
        paragraphOne.setAlignment(ParagraphAlignment.CENTER);
 
        XWPFRun paragraphOneRunOne = paragraphOne.createRun();
        paragraphOneRunOne.setBold(true);
        paragraphOneRunOne.setItalic(false);
        paragraphOneRunOne.setText("Subcontractor Data, By Subcontractor");
        paragraphOneRunOne.addBreak();
        paragraphOneRunOne.addBreak();
 
        XWPFParagraph contInfo = document.createParagraph();
        contInfo.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun name = contInfo.createRun();
        name.setBold(true);
        name.setText("SUBCONTRACTOR: " + subName);
        name.addBreak();
        
        XWPFRun tradeInfo = contInfo.createRun();
        tradeInfo.setText("TRADE: " + conTrade);
        tradeInfo.addBreak();
        
        XWPFParagraph scopeWork = document.createParagraph();
        scopeWork.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun title = scopeWork.createRun();
        title.setBold(true);
        title.setText("Project Specific Scope of Work");
        
       
     
        
     
        XWPFTable scopeW = document.createTable();
        XWPFTableRow row1;
        for(int a = 0; a < scopeNum.size(); a++)
		{
        	if(a == 0)
        	{
        		row1 = scopeW.getRow(0);
        		row1.addNewTableCell();
        	}
        	else
        	{
        		row1 = scopeW.createRow();
        	}
        		
        	
        	
        	row1.getCell(0).setText(scopeNum.get(a) + ": ");
        	row1.getCell(1).setText(" " + scopeDesc.get(a));
			
			
		}
        document.createParagraph().createRun().addBreak();
   
        XWPFParagraph alt = document.createParagraph();
        alt.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun altHeading = alt.createRun();
        altHeading.setBold(true);
        altHeading.setUnderline(UnderlinePatterns.SINGLE);
        altHeading.setText("Alternates");
        altHeading.addBreak();
        
        if(altNum.size() > 0)
        {
        	XWPFTable altTable = document.createTable();
	        XWPFTableRow altRow;
	        for(int a = 0; a < altNum.size(); a++)
			{
	        	if(a == 0)
	        	{
	        		altRow = altTable.getRow(0);
	        		altRow.addNewTableCell();
	        	}
	        	else
	        	{
	        		altRow = altTable.createRow();
	        	}
	        		
	        	
	        	
	        	altRow.getCell(0).setText(altNum.get(a) + ": ");
	        	
	        	altRow.getCell(1).setText(" " + altDesc.get(a));
				
				
			}
	        document.createParagraph().createRun().addBreak();
        	
        }
	        
	   
        XWPFParagraph excl = document.createParagraph();
        excl.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun exclHeading = excl.createRun();
        exclHeading.setBold(true);
        exclHeading.setUnderline(UnderlinePatterns.SINGLE);
        exclHeading.setText("Exclusions");
        exclHeading.addBreak();
        

        if(exclNum.size() > 0)
        {
        	XWPFTable exclTable = document.createTable();
	        XWPFTableRow exclRow;
	        for(int a = 0; a < exclNum.size(); a++)
			{
	        	if(a == 0)
	        	{
	        		exclRow = exclTable.getRow(0);	
	        		exclRow.addNewTableCell();
	        	}
	        	else
	        	{
	        		exclRow = exclTable.createRow();
	        	}
	        		
	        	
	        	
	        	exclRow.getCell(0).setText(exclNum.get(a) + ": ");
	        	
	        	exclRow.getCell(1).setText(" " + exclDesc.get(a));
				
				
			}
	        document.createParagraph().createRun().addBreak();
        	
        }
        
        
 	   
        XWPFParagraph schdVal = document.createParagraph();
        schdVal.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun schdValHeading = schdVal.createRun();
        schdValHeading.setBold(true);
        schdValHeading.setText("Schedule of Values");
        schdValHeading.addBreak();
        
        
        if(schdValNum.size() > 0)
        {
        	XWPFTable schdValTable = document.createTable();
	        XWPFTableRow schdValRow;
	        for(int a = 0; a < schdValNum.size(); a++)
			{
	        	if(a == 0)
	        	{
	        		schdValRow = schdValTable.getRow(0);	
	        		schdValRow.addNewTableCell();
	        	}
	        	else
	        	{
	        		schdValRow = schdValTable.createRow();
	        	}
	        		
	        	
	        	
	        	schdValRow.getCell(0).setText(schdValNum.get(a) + ": ");
	        	
	        	schdValRow.getCell(1).setText(" " + schdValDesc.get(a));
				
				
			}
	        document.createParagraph().createRun().addBreak();
        	
        }
        
        XWPFParagraph cValue = document.createParagraph();
        cValue.setAlignment(ParagraphAlignment.LEFT);
        cValue.setIndentationLeft(100);
        XWPFRun cValueHeading = cValue.createRun();
        cValueHeading.setBold(false);
        cValueHeading.setText("     Original Contract Amount:     " + orginalValue);
        cValueHeading.addBreak();
        
        
        
        XWPFParagraph cOrder = document.createParagraph();
        cOrder.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun cOrderHeading = cOrder.createRun();
        cOrderHeading.setBold(true);
        cOrderHeading.setText("Change Orders");
        cOrderHeading.addBreak();
        
        
        if(cOrderNum.size() > 0)
        {
        	XWPFTable cOrderTable = document.createTable();
	        XWPFTableRow cOrderRow;
	        for(int a = 0; a < cOrderNum.size(); a++)
			{
	        	if(a == 0)
	        	{
	        		cOrderRow = cOrderTable.getRow(0);	
	        		cOrderRow.addNewTableCell();
	        	}
	        	else
	        	{
	        		cOrderRow = cOrderTable.createRow();
	        	}
	        		
	        	
	        	
	        	cOrderRow.getCell(0).setText(cOrderNum.get(a) + ": ");
	        	
	        	cOrderRow.getCell(1).setText(" " + cOrderDesc.get(a));
				
				
			}
	        document.createParagraph().createRun().addBreak();
        	
	        XWPFParagraph nValue = document.createParagraph();
	        nValue.setAlignment(ParagraphAlignment.LEFT);
	        nValue.setIndentationFirstLine(100);
	        XWPFRun nValueHeading = nValue.createRun();
	        nValueHeading.setBold(false);
	        nValueHeading.setText("Final Contract Amount with Change Orders:     " + orginalValue);
	        nValueHeading.addBreak();
        }
        
        
        document.createParagraph().createRun().addBreak(BreakType.PAGE);
        
   
        FileOutputStream outStream = null;
        try {
            outStream = new FileOutputStream("TestFile.docx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
 
        try {
            document.write(outStream);
            outStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}