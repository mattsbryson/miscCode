import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
 
public class SqlInterlink
{
	
	static String serverName = "jdbc:sqlserver://192.168.144.3;";
	static String user = "sa";
	static String pass = "wp7w4-vdrdh";
	
	
   public void dbConnect(String db_connect_string,String db_userid,String db_password)
   {
      try 
      {
    	 //connection setup 
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);
         System.out.println("connected");
         Statement statement = conn.createStatement();
         
         
         //query statements
        
         String queryString = "USE ServerStats SELECT CubeC From dbo.FreeSpace";
         ResultSet rs = statement.executeQuery(queryString);
         while (rs.next()) 
         {
            System.out.println(rs.getString(1));
         }
      } 
      catch (Exception e) 
      {
         e.printStackTrace();
      }
   }
 
   
   public static int serverPercent(String serv) throws ClassNotFoundException, SQLException
   {
	   //connection
	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       Connection conn = DriverManager.getConnection(serverName, user, pass);
       Statement statement = conn.createStatement();
       Statement stat2  = conn.createStatement();
       
       
       
       stat2.executeUpdate("USE ServerStats INSERT INTO dbo.FreeSpace " + "VALUES (1/1/1, 1, 1, 1, 1 ,1 ,1 ,1 ,1 ,1 ,1 ,1  )");
	   
       //query
       String queryString = "USE ServerStats SELECT * From dbo.FreeSpace";
       ResultSet rs = statement.executeQuery(queryString);
       while(rs.next())
       {
    	   Date saveDate = rs.getDate("Date");
    	   int CubeC = rs.getInt("CubeC");
    	   int CubeD = rs.getInt("CubeD");
    	   int DC01C = rs.getInt("DC01C");
    	   int ExchC = rs.getInt("ExchC"); 
    	   int ExchD = rs.getInt("ExchD");
    	   int FaxC = rs.getInt("FaxC");
    	   int FaxS = rs.getInt("FaxS");
    	   int FaxX = rs.getInt("FaxX");
    	   int SqlC = rs.getInt("SqlC");
    	   int SqlD = rs.getInt("SqlD");
    	   int WebC = rs.getInt("WebC");
    	   return CubeC;
       }
       
       return rs.getInt(serv);
       
     
   }
   
}