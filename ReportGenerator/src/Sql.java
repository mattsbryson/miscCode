import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;


public class Sql
{
	static String serverName = "jdbc:sqlserver://192.168.144.3;";
	static String user = "sa";
	static String pass = "wp7w4-vdrdh";
	static Statement statement;
	
	
	
	
	public static void dbConnect(String db_connect_string,String db_userid,String db_password)
	   {
	      try 
	      {
	    	 //connection setup 
	         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	         Connection conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);
	         
	         statement = conn.createStatement();
	      } 
	      catch (Exception e) 
	      {
	         e.printStackTrace();
	      }
	   }
	
	
	public static ArrayList<String> bdgtCodes() throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT BdgtCode From dbo.Budget";
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList<String> desc = new ArrayList<String>();
		   
		   int i = 0;
		   
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("BdgtCode");
			   if(!desc.contains(temp))
			   {
				   desc.add(temp);
				   i++;
				  
			   }
		   }
		  
		   return desc;
	   }
	
	public static ArrayList<String> bdgtDesc(ArrayList BdgtCodes) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   int y = 0;
		   ArrayList<String> desc = new ArrayList<String>();
		   while(BdgtCodes.size() > y)
		   {
			   String queryString = "USE Cobaltcc SELECT Description From dbo.Budget WHERE BdgtCode =" + BdgtCodes.get(y);
			   ResultSet rs = statement.executeQuery(queryString);
			   String temp;
			   
			  
			   
			   int i = 0;
			   
			   while(rs.next())
			   {
				   temp =  "" + rs.getString("Description");
				   if(!desc.contains(temp))
				   {
					   desc.add(temp);
					   i++;
					  
				   }
			   }
			  y++;
		   }
		   return desc;
	   }
	
	public static String bdgtCodeIDbydesc(String desc) throws SQLException
	   {
		
			
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT BdgtCode From Budget WHERE Description = '" + desc + "'";
		   ResultSet rs = statement.executeQuery(queryString);
		
		   rs.next();
		   return rs.getString("BdgtCode");
	   }
	
	
	
	
	public static ArrayList<String> contractIDbyBdgtCode(String BdgtCode) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ContractID From dbo.ContractSchedOfValues WHERE BdgtCode = " + BdgtCode;
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList<String> desc = new ArrayList<String>();
		   
		   int i = 0;
		   
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("ContractID");
			   if(!desc.contains(temp))
			   {
				   desc.add(temp);
				   i++;
				  
			   }
		   }
		  
		   return desc;
	   }
	
	
	public static String ProjectIDbyName(String name) throws SQLException
	   {
		
			
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ProjectID From Projects WHERE Name = '" + name + "'";
		   ResultSet rs = statement.executeQuery(queryString);
		
		   rs.next();
		   return rs.getString("ProjectID");
	   }
	
	
	public static ArrayList<String> ContractIDsbyProjectID(String pID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ContractID From dbo.ProjectSummarySubcontracts WHERE ProjectID = " + pID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList<String> desc = new ArrayList<String>();
		   
		   
		   
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("ContractID");
			   if(!desc.contains(temp))
			   {
				   desc.add(temp);
				  
			   }
		   }
		  
		   return desc;
	   }
	
	
	
	public static ArrayList<String> trades() throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Description From dbo.Contracts";
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList<String> desc = new ArrayList<String>();
		   
		   
		   
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("Description");
			   if(!desc.contains(temp))
			   {
				   desc.add(temp);
				  
			   }
		   }
		  
		   return desc;
	   }
	
	public static ArrayList<String> ContractIDs(String desc) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ContractID From dbo.Contracts WHERE Description = '" + desc + "'";
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList<String> IDS = new ArrayList<String>();
		   
		   
		   
		   while(rs.next())
		   {
			   temp =  "" + rs.getInt("ContractID");
			   if(!IDS.contains(temp))
			   {
				   IDS.add(temp);
				  
			   }
		   }
		  
		   return IDS;
	   }
	
	
	public static String CompanyID(String cID) throws SQLException
	   {
		
			int compId = Integer.parseInt(cID);
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ToCompanyID From Contracts WHERE ContractID = " + compId;
		//   System.out.println(queryString);
		   ResultSet rs = statement.executeQuery(queryString);
		
		   rs.next();
		   return rs.getString("ToCompanyID");
	   }
	
	
	public static String CompanyName(String companyID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Name From dbo.Company WHERE CompanyID = '" +  companyID + "'";
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("Name");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	
	
	public static String ProjectID(String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ProjectID From dbo.ProjectSummarySubcontracts WHERE ContractID =" +  contractID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("ProjectID");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	public static String ProjectIDfromName(String projectName) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String [] ProjectArray = MainGUI.CobaltProjects;
		   ArrayList pArray = new ArrayList();
		   for(int i = 0; i < ProjectArray.length; i++)
		   {
			   pArray.add(ProjectArray [i]);
		   }
		   if(!pArray.contains(projectName))
		   {
			   return "Not Found";
		   }
		   String queryString = "USE Cobaltcc SELECT ProjectID From dbo.Projects WHERE Name = '" +  projectName + "'";
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("ProjectID");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	public static String ProjectName(String projectID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Name From dbo.Projects WHERE ProjectID =" +  projectID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("Name");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	
	public static String ContractDescription(String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Description From dbo.Contracts WHERE ContractID =" +  contractID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("Description");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	

	public static ArrayList<String> ContractInclusions(String ContractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ItemNumber From dbo.ContractInclusions WHERE ContractID = " + ContractID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList<String> list = new ArrayList<String>();
		   
		   
		   
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("ItemNumber");
			   if(!list.contains(temp))
			   {
				   list.add(temp);
				  
			   }
		   }
		  
		   return list;
	   }
	
	
	public static String ContractInclusionsDescription(String ItemNumber, String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Description From dbo.ContractInclusions WHERE ContractID =" +  contractID + "AND ItemNumber = " + ItemNumber;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("Description");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	
	public static ArrayList<String> ContractAlternates(String ContractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ItemNumber From dbo.ContractAlternates WHERE ContractID = " + ContractID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList<String> list = new ArrayList<String>();
		   
		   
		   
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("ItemNumber");
			   if(!list.contains(temp))
			   {
				   list.add(temp);
				  
			   }
		   }
		  
		   return list;
	   }
	
	
	public static String ContractAlternatesDescription(String ItemNumber, String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Description From dbo.ContractAlternates WHERE ContractID =" +  contractID + "AND ItemNumber = " + ItemNumber;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("Description");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	
	public static ArrayList<String> ContractExclusions(String ContractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ItemNumber From dbo.ContractExclusions WHERE ContractID = " + ContractID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList<String> list = new ArrayList<String>();
		   
		   
		   
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("ItemNumber");
			   if(!list.contains(temp))
			   {
				   list.add(temp);
				  
			   }
		   }
		  
		   return list;
	   }
	
	
	public static String ContractExclusionsDescription(String ItemNumber, String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Description From dbo.ContractExclusions WHERE ContractID =" +  contractID + "AND ItemNumber = " + ItemNumber;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("Description");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	
	public static ArrayList<String> ContractSchedOfValues(String ContractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ItemNumber From dbo.ContractSchedOfValues WHERE ContractID = " + ContractID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList<String> list = new ArrayList<String>();
		   
		   
		   
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("ItemNumber");
			   if(!list.contains(temp))
			   {
				   list.add(temp);
				  
			   }
		   }
		  
		   return list;
	   }
	
	
	public static String ContractSchedOfValuesDescription(String ItemNumber, String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Description From dbo.ContractSchedOfValues WHERE ContractID =" +  contractID + "AND ItemNumber = " + ItemNumber;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("Description");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	
	public static String ContractSchedOfValuesScheduledValue(String ItemNumber, String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ScheduledValue From dbo.ContractSchedOfValues WHERE ContractID =" +  contractID + "AND ItemNumber = " + ItemNumber;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("ScheduledValue");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	public static String ContractSchedOfValuesBdgtCode(String ItemNumber, String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT BdgtCode From dbo.ContractSchedOfValues WHERE ContractID =" +  contractID + "AND ItemNumber = " + ItemNumber;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("BdgtCode");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	
	
	public static ArrayList<String> ContractChangeOrders(String ContractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT SCONumber From dbo.SubcontractCO WHERE ContractID = " + ContractID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList<String> list = new ArrayList<String>();
		   
		   
		   
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("SCONumber");
			   if(!list.contains(temp))
			   {
				   list.add(temp);
				  
			   }
		   }
		  
		   return list;
	   }
	
	
	
	public static String ChangeOrderDescription(String SCONumber, String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Description From dbo.SubcontractCO WHERE ContractID =" +  contractID + "AND SCONumber = " + SCONumber;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("Description");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	
	public static String ChangeOrderApprovedAmount(String SCONumber, String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ApprovedAmount From dbo.SubcontractCO WHERE ContractID =" +  contractID + "AND SCONumber = " + SCONumber;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("ApprovedAmount");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	public static String ChangeOrderStatus(String SCONumber, String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Status From dbo.SubcontractCO WHERE ContractID =" +  contractID + "AND SCONumber =" + SCONumber;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("Status");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	
	//z
	
	public static String ContractOriginalValue(String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT OrigValue From dbo.Contracts WHERE ContractID =" +  contractID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("OrigValue");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	
	public static String ContractRevisedValue(String contractID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT RevisedValue From dbo.Contracts WHERE ContractID =" +  contractID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String n;
		   
		   if(rs.next())
		   {
			  n =  rs.getString("RevisedValue");
		   }
		   else
			  n = "Not Found";
		   
		   return n;
		   
		   
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static ArrayList ProjectName() throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Name From dbo.Projects";
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList proj = new ArrayList();
		 
		   
		   int i = 0;
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("Name");
			   if(!proj.contains(temp))
			   {
				   proj.add(temp);
				   i++;
			
			   }
		   }
		  
		   return proj;
	   }
	
	public static ArrayList ProjectNum() throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Number From dbo.Projects";
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList proj = new ArrayList();
		 
		   
		   int i = 0;
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("Number");
			   if(!proj.contains(temp))
			   {
				   proj.add(temp);
				   i++;
			
			   }
		   }
		  
		   return proj;
	   }
	
	public static ArrayList ProjectID() throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ProjectID From dbo.Projects";
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList proj = new ArrayList();
		 
		   
		   int i = 0;
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("ProjectID");
			   if(!proj.contains(temp))
			   {
				   proj.add(temp);
				   i++;
				  
			   }
		   }
		  
		   return proj;
	   }
	
	public static ArrayList Inclusions(int PID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Description From dbo.ContractInclusions WHERE ProjectID = " + PID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList incl = new ArrayList();
		 
		   
		   int i = 0;
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("Description");
			   if(!incl.contains(temp))
			   {
				   incl.add(temp);
				   i++;
				   
			   }
		   }
		  
		   return incl;
	   }
	
	
	
	//change orders
	
	public static ArrayList SubChangeOrdersItems(int PID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT PotentialChangeValue From dbo.Contracts WHERE ProjectID = " + PID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList pcv = new ArrayList();
		 
		   
		   int i = 0;
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("PotentialChangeValue");
			 	   pcv.add(temp);
		   }
		  
		   return pcv;
	   }
	
	public static ArrayList SubChangeOrdersDesc(int PID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Description From dbo.SubcontractCO WHERE ProjectID = " + PID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList d = new ArrayList();
		 
		   
		   int i = 0;
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("Description");
			 	   d.add(temp);
		   }
		  
		   return d;
	   }
	
	public static ArrayList SubChangeOrdersValue(int PID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT ApprovedAmount From dbo.SubcontractCO WHERE ProjectID = " + PID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList d = new ArrayList();
		 
		   
		   int i = 0;
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("ApprovedAmount");
			 	   d.add(temp);
		   }
		  
		   return d;
	   }
	
	public static ArrayList SubChangeOrdersStat(int PID) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE Cobaltcc SELECT Status From dbo.SubcontractCO WHERE ProjectID = " + PID;
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   ArrayList d = new ArrayList();
		 
		   
		   int i = 0;
		   while(rs.next())
		   {
			   temp =  "" + rs.getString("Status");
			 	   d.add(temp);
		   }
		  
		   return d;
	   }
	
	
	
	public static ArrayList<String> bdgtDescALL() throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   int y = 0;
		   ArrayList<String> desc = new ArrayList<String>();
			   String queryString = "USE Cobaltcc SELECT Description From dbo.Budget";
			   ResultSet rs = statement.executeQuery(queryString);
			   String temp;
			   
			  
			   
			   int i = 0;
			   
			   while(rs.next())
			   {
				   temp =  "" + rs.getString("Description");
				   if(!desc.contains(temp))
				   {
					   desc.add(temp);
					   i++;
					  
				   }
			   }
		
			  
			  
			  
			  
			  
			  
			  
			  
			  
			
			   String queryString2 = "USE [Cobalt Archive] SELECT Description From dbo.Budget";
			   String temp2;
			   
			  
			   
			   int i2 = 0;
			   
			   while(rs.next())
			   {
				   temp2 =  "" + rs.getString("Description");
				   if(!desc.contains(temp2))
				   {
					   desc.add(temp2);
					   i2++;
					  
				   }
			   }
			   Collections.sort(desc);
		   
		   return desc;
	   }
	
	
	
	
	
	
	
	
	
	
	

}
