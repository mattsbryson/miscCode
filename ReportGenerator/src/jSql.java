import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class jSql 
{
	private static final String serverName = "jdbc:sqlserver://192.168.144.3;";
	private static final String user = "sa";
	private static final String pass = "wp7w4-vdrdh";
	private static Statement statement;
	
	
	
	
	
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
	

	public static String ProjectNum(String data, String pName) throws SQLException
	   {
		   dbConnect(serverName,user,pass);
		   String queryString = "USE [" + data + "] SELECT Number From dbo.Projects Where Name = '" + pName + "'";
		   ResultSet rs = statement.executeQuery(queryString);
		   String temp;
		   
		   String pNum = "";
		 
		   
		   int i = 0;
		   if(rs.next())
		   {
			   pName = rs.getString("Number");
		   }
		   else
		   {
			   pName = "-1";
		   }
		  
		   return pNum;
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
	
	
	

}
