import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileWriter;

import com.tutego.jrtf.RtfUnit;

import static com.tutego.jrtf.Rtf.rtf;
import static com.tutego.jrtf.RtfDocfmt.*;
import static com.tutego.jrtf.RtfHeader.*;
import static com.tutego.jrtf.RtfInfo.*;
import static com.tutego.jrtf.RtfFields.*;
import static com.tutego.jrtf.RtfPara.*;
import static com.tutego.jrtf.RtfSectionFormatAndHeaderFooter.*;
import static com.tutego.jrtf.RtfText.*;
import static com.tutego.jrtf.RtfUnit.*;


public class ReportWriter 
{
	
	public static void main(String[] args) throws SQLException
	{

		
	
		
		
		
		
		//get list of trades
		
		ArrayList<String> bCodes = Sql.bdgtCodes();
		ArrayList Trades = new ArrayList();
		
		Trades = Sql.bdgtDesc(bCodes);
		
	
		
		
		Collections.sort(Trades);
		
		
		MainGUI.gui(Trades);
		
		//get list of companies with these trades 
		
		
	
		
		
		/*   List of trades generator
		ArrayList budgetstuff = new ArrayList();
		budgetstuff = Sql.bdgtDescALL();
		for(int i = 0; i < budgetstuff.size(); i++)
		{
			System.out.println(budgetstuff.get(i));
		}
		
		*/
		
	}	
		
}		
	
	

























/*ArrayList BdgtCode;










ArrayList PNames;
ArrayList PNumbers;
ArrayList PIDs;
ArrayList Inclusions;
BdgtCode = Sql.BdgtCode();
PNames = Sql.ProjectName();
PNumbers = Sql.ProjectNum();
PIDs = Sql.ProjectID();
Inclusions = Sql.Inclusions(37);

ArrayList SubItem, SubDesc, SubValue, SubStat;
SubItem = Sql.SubChangeOrdersItems(37);
SubDesc = Sql.SubChangeOrdersDesc(37);
SubValue = Sql.SubChangeOrdersValue(37);
SubStat = Sql.SubChangeOrdersStat(37);




String d1 = BdgtCode.toString() + "\n" + PNames.toString() + "\n" + PNumbers.toString() + "\n" + PIDs.toString();
String d2 = Inclusions.toString();
String d3 = SubItem.toString() + "\n" + SubDesc.toString() + "\n" + SubValue.toString() + "\n" + SubStat.toString();


writer(d1 + d2 + d3, "C:\\Users\\mbryson\\Dropbox\\Java\\ReportGenerator\\report.txt");
*/


/*
	//for rtf
						String scopeWork = "";
						
						for(int a = 0; a < ContInclusions.size(); a++)
						{
							int length;
							String temp;
						//	if(a == 0)
						//	{
								temp = "\n" +  ContInclusions.get(a) + ": " + "\t" +  ContInclDesc.get(a);
								length = temp.length();
								String num = ContInclusions.get(a);
								String desc = ContInclDesc.get(a);
								int dLength;
								int diff;
								int sSub;
								int sSub2;
								int sSub3;
								String sub0;
								String sub1 = "";
								String sub2 = "";
								String sub3 = "";
								if(length > 90)
								{
									dLength = desc.length();
									diff = length - dLength;
									sSub = desc.indexOf(' ', 80);
									sub0 = desc.substring(0, sSub);
									sub1 = desc.substring(sSub, desc.length());
									if(length > 180)
									{
										sSub2 = sSub + 90;
										sSub3 = sSub + 90;
										sub1 = desc.substring(sSub, sSub2);
										sub2 = desc.substring(sSub2, sSub3);
										if(length > 270)
										{
											sub3 = desc.substring(sSub3);
										}
									}
									scopeWork += "\n" +  ContInclusions.get(a) + ": " + sub0 + "\n\t" + sub1 + "\n\t" + sub2 + "\n\t" + sub3;
							//	}
							/*	else
								{
									scopeWork += "\n" +  (ContInclusions.get(a) + ": "); 
									scopeWork += "\t" +  (ContInclDesc.get(a));	
								}
								
						
							}
							else
							{
								scopeWork += "\n\n" +  (ContInclusions.get(a) + ": "); 
								scopeWork += "\t" +  (ContInclDesc.get(a));
							}
						}
						
						
						scopeWork += "\n" +  ("\nAlternates\n");
						for(int a = 0; a < ContAlternates.size(); a++)
						{
							scopeWork += "\n" +  (ContAlternates.get(a) + ": "); 
							scopeWork += "\n" +  (ContAltDesc.get(a));
						}
						scopeWork += "\n" +  ("\nExclusions\n");
						for(int a = 0; a < ContExclusions.size(); a++)
						{
							scopeWork += "\n" +  (ContExclusions.get(a) + ": "); 
							scopeWork += "\n" +  (ContExclDesc.get(a));
						}
						
						
						
						
						
						
						
						
						
						
							String report = "";
						

						report += "\n" +  ("Company Name:" + compName);
						report += "\n" +  ("\n\nProjectName: " + projectName + " ProjectID = " + projectID);
						report += "\n" +  ("\nSubcontractor:" + compName);
						report += "\n" +  ("\nTrade:" + trade);
						
						report += "\n" +  ("\nProject Specific Scope of Work\n");
						for(int a = 0; a < ContInclusions.size(); a++)
						{
							report += "\n" +  (ContInclusions.get(a) + ": "); 
							report += "\n" +  (ContInclDesc.get(a));
						}
						report += "\n" +  ("\nAlternates\n");
						for(int a = 0; a < ContAlternates.size(); a++)
						{
							report += "\n" +  (ContAlternates.get(a) + ": "); 
							report += "\n" +  (ContAltDesc.get(a));
						}
						report += "\n" +  ("\nExclusions\n");
						for(int a = 0; a < ContExclusions.size(); a++)
						{
							report += "\n" +  (ContExclusions.get(a) + ": "); 
							report += "\n" +  (ContExclDesc.get(a));
						}
						report += "\n" +  ("\n\nSchedule of Values\n");
						for(int a = 0; a < CSOV.size(); a++)
						{
							String temp = CSOV.get(a);
							temp += " : " + CSOVDesc.get(a);
							temp += " : " + CSOVSValue.get(a);
							temp += " : " + CSOVBdgtCode.get(a);
							report += "\n" +  (temp);
						}
						report += "\n" +  ("\nOriginal Contract Amount: " + OriginalValue + "\n");
						for(int a = 0; a < ChangeOrders.size(); a++)
						{
							String temp = ChangeOrders.get(a);
							temp += " : " + ChangeOrdersDesc.get(a);
							temp += " : " + ChangeOrdersAppAmount.get(a);
							temp += " : " + ChangeOrdersStatus.get(a);
							report += "\n" +  (temp);
						}
						report += "\n" +  ("\nRevised Contract Amount: " + RevisedValue + "\n");
						
						report += "\n" +  ("________________________________\n\n\n\n");
						
						
						
						
						
						
						
					
						
						
						
						mWordWriter.docWriter(compName, trade, ContInclusions, ContInclDesc, ContAlternates, ContAltDesc, ContExclusions, ContExclDesc, CSOV, CSOVDesc, ChangeOrders, ChangeOrdersDesc, OriginalValue, RevisedValue);
						writer(report);
						System.out.println("Reports finished: " + finished + " Duplicates indicate number in set: " + i);
						
						
						
					
					/*
					
					
					System.out.println("Company Name:" + compName);
					System.out.println("\n\nProjectName: " + projectName);
					System.out.println("\nSubcontractor:" + compName);
					System.out.println("Trade:" + trade);
					
					System.out.println("\n Project Specific Scope of Work\n");
					for(int a = 0; a < ContInclusions.size(); a++)
					{
						System.out.print(ContInclusions.get(a) + ": "); 
						System.out.println(ContInclDesc.get(a));
					}
					System.out.println("\n Alternates\n");
					for(int a = 0; a < ContAlternates.size(); a++)
					{
						System.out.print(ContAlternates.get(a) + ": "); 
						System.out.println(ContAltDesc.get(a));
					}
					System.out.println("\n Exclusions\n");
					for(int a = 0; a < ContExclusions.size(); a++)
					{
						System.out.print(ContExclusions.get(a) + ": "); 
						System.out.println(ContExclDesc.get(a));
					}
					System.out.println("\n\n Schedule of Values\n");
					for(int a = 0; a < CSOV.size(); a++)
					{
						String temp = CSOV.get(a);
						temp += " : " + CSOVDesc.get(a);
						temp += " : " + CSOVSValue.get(a);
						temp += " : " + CSOVBdgtCode.get(a);
						System.out.println(temp);
					}
					System.out.print("\nOriginal Contract Amount: " + OriginalValue + "\n");
					for(int a = 0; a < ChangeOrders.size(); a++)
					{
						String temp = ChangeOrders.get(a);
						temp += " : " + ChangeOrdersDesc.get(a);
						temp += " : " + ChangeOrdersAppAmount.get(a);
						temp += " : " + ChangeOrdersStatus.get(a);
						System.out.println(temp);
					}
					System.out.print("\nRevised Contract Amount: " + RevisedValue + "\n");
					
					System.out.println("________________________________\n\n\n\n");
					
					
					*/
						
						
						
						
						
				/*		
						try {
							rtf().section(
									p( text("Subcontractor Data, By Subcontractor") ).alignCentered().indentFirstLine( 0.25, RtfUnit.CM ),
									p( text("\n\n\n")),
									p( bold("Project Name: " + projectName)),
									p( text("\nSUBCONTACTOR: " + compName)),
									p( text("TRADE: " + trade)),
									p( bold("\n\n\nProject Specific Scope of Work")),
									p( text(scopeWork))
								).out( new FileWriter("out.rtf"));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						

*/