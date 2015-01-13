import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class SqlInterlink
{
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
        
         String queryString = "select * from sysobjects where type='u'";
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
 
   
}