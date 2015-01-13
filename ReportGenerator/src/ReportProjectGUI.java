import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ReportProjectGUI extends JFrame {

	private JPanel contentPane;
	static String dataB;
	static ArrayList trades;
	static String projectN = "";
	
	
	static XWPFDocument document;
	static JComboBox searchbox;
	//project names
	static String[] CobaltProjects = {"2700 S Figueroa",
		"Alta Centrum Apartments  - San Diego",
		"Archstone Santa Clarita",
		"Coventry Court - Tustin",
		"Hollywood & Garfield Apartments",
		"LB + Anaheim Senior Artists Colony",
		"LB + Anaheim The Annex",
		"Long Beach Burnett Apartments",
		"Vermont Family Apartments"};
	static String[] ArchiveProjects = {"Adams and Central Mixed-Use",
		"Jamboree West Gateway Housing",
		"Northridge II",
		"Playa del Oro",
		"RP Apartments 400",
		"Villages at Cabrillo"};
	static String[] selectedProjects;



	/**
	 * Launch the application.
	 */
	public static void rGUI(final String database, final String [] projects) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectedProjects = projects;
					dataB = database;
					ReportProjectGUI frame = new ReportProjectGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReportProjectGUI() {
		setTitle("Report Generator - Project Based");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow]", "[][][][][]"));
		
		JLabel lblProject = new JLabel("Projects:");
		contentPane.add(lblProject, "cell 1 1,alignx trailing");
		
		final JComboBox comboBox = new JComboBox(selectedProjects);
		contentPane.add(comboBox, "cell 2 1,growx");
		
		JButton btnGenerateReport = new JButton("Generate Report");
		btnGenerateReport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					System.out.println(comboBox.getSelectedItem());
					projectN = (String) comboBox.getSelectedItem();
					reportGen((String) comboBox.getSelectedItem(), dataB);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		contentPane.add(btnGenerateReport, "cell 2 4");
	}
	
	public static void reportGen(String tr, String dataB) throws SQLException
	{
		
		if(dataB.equals("Cobaltcc"))
		{
			ArrayList<String> Contracts;
			Contracts = Sql.ContractIDsbyProjectID(Sql.ProjectIDfromName(tr));
			System.out.println("ID List size: " + Contracts.size());
			for(int y = 0; y < Contracts.size(); y++)
			{
				System.out.println("I ran!");
				//c3
					String ContractID = Contracts.get(y);
				
				//c1
					String cID = Sql.CompanyID(ContractID);
				//c2
					String compName = Sql.CompanyName(cID);
				//c4
					String projectID = Sql.ProjectID(ContractID);
				//c5 
					String projectName;
					if(projectID.equalsIgnoreCase("Not Found"))
					{
						projectName = "Not Available";
						System.out.println("Empty Contract");
						y++;
					}
					else
					{
						projectName = Sql.ProjectName(projectID);
						if(projectName.equalsIgnoreCase("Not Applicable"))
						{
							y++;
						}
					}
				
				
				//c6
					String companyNameRedundancy;
					//no sql method yet
					
				//c7
					String trade = Sql.ContractDescription(ContractID);
					
				//c8 
					ArrayList<String> ContInclusions = Sql.ContractInclusions(ContractID);
					
					//c9
					ArrayList<String> ContInclDesc = new ArrayList(ContInclusions.size());
					for(int a = 0; a < ContInclusions.size(); a++)
					{
						ContInclDesc.add(Sql.ContractInclusionsDescription(ContInclusions.get(a), ContractID));
					}
					
				//8 & 9 test
					/*for(int a = 0; a < ContInclusions.size(); a++)
					{
						System.out.print(ContInclusions.get(a) + ": "); 
						System.out.println(ContInclDesc.get(a));
					}
				*/
					
				//c10 
					ArrayList<String> ContAlternates = Sql.ContractAlternates(ContractID);
					
				//c11
					ArrayList<String> ContAltDesc = new ArrayList(ContAlternates.size());
					for(int a = 0; a < ContAlternates.size(); a++)
					{
						ContAltDesc.add(Sql.ContractAlternatesDescription(ContAlternates.get(a), ContractID));
					}
					
				/*10 & 11 test
					for(int a = 0; a < ContAlternates.size(); a++)
					{
						System.out.print(ContAlternates.get(a) + ": "); 
						System.out.println(ContAltDesc.get(a));
					}
				*/	
					
					
				//c12 
					ArrayList<String> ContExclusions = Sql.ContractExclusions(ContractID);
					
				//c13
					ArrayList<String> ContExclDesc = new ArrayList(ContExclusions.size());
					for(int a = 0; a < ContExclusions.size(); a++)
					{
						ContExclDesc.add(Sql.ContractExclusionsDescription(ContExclusions.get(a), ContractID));
					}
					
				/*12 & 13 test
					for(int a = 0; a < ContExclusions.size(); a++)
					{
						System.out.print(ContExclusions.get(a) + ": "); 
						System.out.println(ContExclDesc.get(a));
					}
				*/
				
					
					
					
					
					
					
				//Schedule of values
			
				//a1
					ArrayList<String> CSOV = Sql.ContractSchedOfValues(ContractID);
				//a2
				//a3
				//a4
					ArrayList<String> CSOVDesc = new ArrayList(CSOV.size());
					ArrayList<String> CSOVSValue = new ArrayList(CSOV.size());
					ArrayList<String> CSOVBdgtCode = new ArrayList(CSOV.size());
					for(int a = 0; a < CSOV.size(); a++)
					{
						String ItemNumber = CSOV.get(a);
						CSOVDesc.add(Sql.ContractSchedOfValuesDescription(ItemNumber, ContractID));
						CSOVSValue.add(Sql.ContractSchedOfValuesScheduledValue(ItemNumber, ContractID));
						CSOVBdgtCode.add(Sql.ContractSchedOfValuesBdgtCode(ItemNumber, ContractID));
					}
					
					if(CSOV.size() == 0)
					{
						System.out.println("Empty Contract");
						break;
					}
					
					
				//change orders
				//o1
					ArrayList<String> ChangeOrders = Sql.ContractChangeOrders(ContractID);
				//o2
				//o3
				//o4
					ArrayList<String> ChangeOrdersDesc = new ArrayList(ChangeOrders.size());
					ArrayList<String> ChangeOrdersAppAmount = new ArrayList(ChangeOrders.size());
					ArrayList<String> ChangeOrdersStatus= new ArrayList(ChangeOrders.size());
					for(int a = 0; a < ChangeOrders.size(); a++)
					{
						String ChangeOrderID = ChangeOrders.get(a);
						ChangeOrdersDesc.add(Sql.ChangeOrderDescription(ChangeOrderID, ContractID));
						ChangeOrdersAppAmount.add(Sql.ChangeOrderApprovedAmount(ChangeOrderID, ContractID));
						ChangeOrdersStatus.add(Sql.ChangeOrderStatus(ChangeOrderID, ContractID));
					}
					
					
				
				
				//contract amounts
					//z1
					String OriginalValue = Sql.ContractOriginalValue(ContractID);
					//z2
					String RevisedValue	= Sql.ContractRevisedValue(ContractID);
					
					String subName = compName;
					String conTrade = trade;
					ArrayList <String> scopeNum = ContInclusions;
					ArrayList <String> scopeDesc = ContInclDesc;
					ArrayList <String> altNum = ContAlternates;
					ArrayList <String> altDesc = ContAltDesc;
					ArrayList <String> exclNum = ContExclusions;
					ArrayList <String> exclDesc = ContExclDesc;
					ArrayList <String> schdValNum = CSOV;
					ArrayList <String> schdValDesc = CSOVDesc;
					ArrayList <String> cOrderNum = ChangeOrders;
					ArrayList <String> cOrderDesc = ChangeOrdersDesc;
					String orginalValue = OriginalValue;
					String revisedValue = RevisedValue;
					
					
					
					if(y == 0)
					{
						 document = new XWPFDocument();
					}
					
					 
				        XWPFParagraph paragraphOne = document.createParagraph();
				        paragraphOne.setAlignment(ParagraphAlignment.CENTER);
				 
				        XWPFRun paragraphOneRunOne = paragraphOne.createRun();
				        paragraphOneRunOne.setBold(true);
				        paragraphOneRunOne.setItalic(false);
				        paragraphOneRunOne.setText("Subcontractor Data, By Subcontractor");
				        paragraphOneRunOne.addBreak();
				        paragraphOneRunOne.addBreak();
				        
				        XWPFParagraph cName = document.createParagraph();
				        XWPFRun cNameRunOne = cName.createRun();
				        cNameRunOne.setBold(true);
				        cNameRunOne.setItalic(false);
				        cNameRunOne.setText(subName);
				        cNameRunOne.addBreak();

				
					 
					  	XWPFParagraph projectN = document.createParagraph();
				        XWPFRun projectNRunOne = projectN.createRun();
				        projectNRunOne.setBold(true);
				        projectNRunOne.setItalic(false);
				        projectNRunOne.setText("Project Name: " + projectName);
				        projectNRunOne.addBreak();
				        ReportProjectGUI.projectN = projectName;
				 
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
				        
				       
				     
				        
				        if(scopeNum.size() > 0)
				        {
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
				        }
				   
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
					        		schdValRow.addNewTableCell();
					        		schdValRow.addNewTableCell();
					        		
					        		schdValRow.getCell(0).setText("Item");
					        		schdValRow.getCell(1).setText("Description");
					        		schdValRow.getCell(2).setText("Value");
					        		schdValRow.getCell(3).setText("Budget Code");
					        	}
					        	
					        		schdValRow = schdValTable.createRow();
					        		
					        		schdValRow.getCell(0).setText(schdValNum.get(a) + ": ");
						        	schdValRow.getCell(1).setText("" + schdValDesc.get(a));
						        	schdValRow.getCell(2).setText(" " + CSOVSValue.get(a));
						        	schdValRow.getCell(3).setText(" " + CSOVBdgtCode.get(a));
					        	
					        		
					        	
					        	
					        	
								
								
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
					        		cOrderRow.addNewTableCell();
					        		cOrderRow.addNewTableCell();
					        		
					        		cOrderRow.getCell(0).setText("Item");
					        		cOrderRow.getCell(1).setText("Description");
					        		cOrderRow.getCell(2).setText("Value");
					        		cOrderRow.getCell(3).setText("Status");
					        	}
					        	
					        		cOrderRow = cOrderTable.createRow();
					        		cOrderRow.getCell(0).setText(cOrderNum.get(a) + ": ");
						        	cOrderRow.getCell(1).setText("" + cOrderDesc.get(a));
						        	cOrderRow.getCell(2).setText("" + ChangeOrdersAppAmount.get(a));
						        	cOrderRow.getCell(3).setText("" + ChangeOrdersStatus.get(a));
						        	
					        	
					        		
					        	
					        	
					        	
								
								
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
				   
				
			}
			
			 FileOutputStream outStream = null;
		        try {
		            outStream = new FileOutputStream(projectN+ " SubReport.docx");
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
		else
		{
			ArrayList<String> Contracts;
			String projectIDC = aSql.ProjectIDfromName(tr);
			Contracts = aSql.ContractIDsbyProjectID(projectIDC);
			System.out.println("ID List size: " + Contracts.size());
			for(int y = 0; y < Contracts.size(); y++)
			{
				System.out.println("I ran!");
				//c3
					String ContractID = Contracts.get(y);
				
				//c1
					String cID = aSql.CompanyID(ContractID);
				//c2
					String compName = aSql.CompanyName(cID);
				//c4
					String projectID = aSql.ProjectID(ContractID);
				//c5 
					String projectName;
					if(projectID.equalsIgnoreCase("Not Found"))
					{
						projectName = "Not Available";
						System.out.println("Empty Contract");
						y++;
					}
					else
					{
						projectName = aSql.ProjectName(projectID);
						if(projectName.equalsIgnoreCase("Not Applicable"))
						{
							y++;
						}
					}
				
				
				//c6
					String companyNameRedundancy;
					//no aSql method yet
					
				//c7
					String trade = aSql.ContractDescription(ContractID);
					
				//c8 
					ArrayList<String> ContInclusions = aSql.ContractInclusions(ContractID);
					
					//c9
					ArrayList<String> ContInclDesc = new ArrayList(ContInclusions.size());
					for(int a = 0; a < ContInclusions.size(); a++)
					{
						ContInclDesc.add(aSql.ContractInclusionsDescription(ContInclusions.get(a), ContractID));
					}
					
				//8 & 9 test
					/*for(int a = 0; a < ContInclusions.size(); a++)
					{
						System.out.print(ContInclusions.get(a) + ": "); 
						System.out.println(ContInclDesc.get(a));
					}
				*/
					
				//c10 
					ArrayList<String> ContAlternates = aSql.ContractAlternates(ContractID);
					
				//c11
					ArrayList<String> ContAltDesc = new ArrayList(ContAlternates.size());
					for(int a = 0; a < ContAlternates.size(); a++)
					{
						ContAltDesc.add(aSql.ContractAlternatesDescription(ContAlternates.get(a), ContractID));
					}
					
				/*10 & 11 test
					for(int a = 0; a < ContAlternates.size(); a++)
					{
						System.out.print(ContAlternates.get(a) + ": "); 
						System.out.println(ContAltDesc.get(a));
					}
				*/	
					
					
				//c12 
					ArrayList<String> ContExclusions = aSql.ContractExclusions(ContractID);
					
				//c13
					ArrayList<String> ContExclDesc = new ArrayList(ContExclusions.size());
					for(int a = 0; a < ContExclusions.size(); a++)
					{
						ContExclDesc.add(aSql.ContractExclusionsDescription(ContExclusions.get(a), ContractID));
					}
					
				/*12 & 13 test
					for(int a = 0; a < ContExclusions.size(); a++)
					{
						System.out.print(ContExclusions.get(a) + ": "); 
						System.out.println(ContExclDesc.get(a));
					}
				*/
				
					
					
					
					
					
					
				//Schedule of values
			
				//a1
					ArrayList<String> CSOV = aSql.ContractSchedOfValues(ContractID);
				//a2
				//a3
				//a4
					ArrayList<String> CSOVDesc = new ArrayList(CSOV.size());
					ArrayList<String> CSOVSValue = new ArrayList(CSOV.size());
					ArrayList<String> CSOVBdgtCode = new ArrayList(CSOV.size());
					for(int a = 0; a < CSOV.size(); a++)
					{
						String ItemNumber = CSOV.get(a);
						CSOVDesc.add(aSql.ContractSchedOfValuesDescription(ItemNumber, ContractID));
						CSOVSValue.add(aSql.ContractSchedOfValuesScheduledValue(ItemNumber, ContractID));
						CSOVBdgtCode.add(aSql.ContractSchedOfValuesBdgtCode(ItemNumber, ContractID));
					}
					
					if(CSOV.size() == 0)
					{
						System.out.println("Empty Contract");
						break;
					}
					
					
				//change orders
				//o1
					ArrayList<String> ChangeOrders = aSql.ContractChangeOrders(ContractID);
				//o2
				//o3
				//o4
					ArrayList<String> ChangeOrdersDesc = new ArrayList(ChangeOrders.size());
					ArrayList<String> ChangeOrdersAppAmount = new ArrayList(ChangeOrders.size());
					ArrayList<String> ChangeOrdersStatus= new ArrayList(ChangeOrders.size());
					for(int a = 0; a < ChangeOrders.size(); a++)
					{
						String ChangeOrderID = ChangeOrders.get(a);
						ChangeOrdersDesc.add(aSql.ChangeOrderDescription(ChangeOrderID, ContractID));
						ChangeOrdersAppAmount.add(aSql.ChangeOrderApprovedAmount(ChangeOrderID, ContractID));
						ChangeOrdersStatus.add(aSql.ChangeOrderStatus(ChangeOrderID, ContractID));
					}
					
					
				
				
				//contract amounts
					//z1
					String OriginalValue = aSql.ContractOriginalValue(ContractID);
					//z2
					String RevisedValue	= aSql.ContractRevisedValue(ContractID);
					
					String subName = compName;
					String conTrade = trade;
					ArrayList <String> scopeNum = ContInclusions;
					ArrayList <String> scopeDesc = ContInclDesc;
					ArrayList <String> altNum = ContAlternates;
					ArrayList <String> altDesc = ContAltDesc;
					ArrayList <String> exclNum = ContExclusions;
					ArrayList <String> exclDesc = ContExclDesc;
					ArrayList <String> schdValNum = CSOV;
					ArrayList <String> schdValDesc = CSOVDesc;
					ArrayList <String> cOrderNum = ChangeOrders;
					ArrayList <String> cOrderDesc = ChangeOrdersDesc;
					String orginalValue = OriginalValue;
					String revisedValue = RevisedValue;
					
					
					
					if(y == 0)
					{
						 document = new XWPFDocument();
					}
					
						
						
					
					
				        XWPFParagraph paragraphOne = document.createParagraph();
				        paragraphOne.setAlignment(ParagraphAlignment.CENTER);
				        XWPFRun paragraphOneRunOne = paragraphOne.createRun();
				        paragraphOneRunOne.setBold(false);
				        paragraphOneRunOne.setItalic(false);
				        paragraphOneRunOne.setText("Subcontractor Data, By Subcontractor");
				        paragraphOneRunOne.addBreak();
				        paragraphOneRunOne.addBreak();
				 
				        XWPFParagraph cName = document.createParagraph();
				        XWPFRun cNameRunOne = cName.createRun();
				        cNameRunOne.setBold(true);
				        cNameRunOne.setItalic(false);
				        cNameRunOne.setText(subName);
				        cNameRunOne.addBreak();

				
					 
					  	XWPFParagraph projectN = document.createParagraph();
				        XWPFRun projectNRunOne = projectN.createRun();
				        projectNRunOne.setBold(true);
				        projectNRunOne.setItalic(false);
				        projectNRunOne.setText("Project Name: " + projectName);
				        projectNRunOne.addBreak();
				        
				        
				        
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
				        
				       
				     
				        
				     
				        if(scopeNum.size() > 0)
				        {
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
				        }
				   
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
					        		schdValRow.addNewTableCell();
					        		schdValRow.addNewTableCell();
					        		
					        		schdValRow.getCell(0).setText("Item");
					        		schdValRow.getCell(1).setText("Description");
					        		schdValRow.getCell(2).setText("Value");
					        		schdValRow.getCell(3).setText("Budget Code");
					        	}
					        	
					        		schdValRow = schdValTable.createRow();
					        		
					        		schdValRow.getCell(0).setText(schdValNum.get(a) + ": ");
						        	schdValRow.getCell(1).setText("" + schdValDesc.get(a));
						        	schdValRow.getCell(2).setText(" " + CSOVSValue.get(a));
						        	schdValRow.getCell(3).setText(" " + CSOVBdgtCode.get(a));
					        	
					        		
					        	
					        	
					        	
								
								
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
					        		cOrderRow.addNewTableCell();
					        		cOrderRow.addNewTableCell();
					        		
					        		cOrderRow.getCell(0).setText("Item");
					        		cOrderRow.getCell(1).setText("Description");
					        		cOrderRow.getCell(2).setText("Value");
					        		cOrderRow.getCell(3).setText("Status");
					        	}
					        	
					        		cOrderRow = cOrderTable.createRow();
					        		cOrderRow.getCell(0).setText(cOrderNum.get(a) + ": ");
						        	cOrderRow.getCell(1).setText("" + cOrderDesc.get(a));
						        	cOrderRow.getCell(2).setText("" + ChangeOrdersAppAmount.get(a));
						        	cOrderRow.getCell(3).setText("" + ChangeOrdersStatus.get(a));
						        	
					        	
					        		
					        	
					        	
					        	
								
								
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
					
				
			}
			
			 FileOutputStream outStream = null;
		        try {
		            outStream = new FileOutputStream(projectN + " SubReport.docx");
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
}
