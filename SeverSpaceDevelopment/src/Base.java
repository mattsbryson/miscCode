
import java.sql.SQLException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class Base 
{

	public static void main(String[] args) 
	{
		System.out.println("Version 1.3");	
		

		Date current = new Date();
		
		
		
		
		TimerTask RegularReport = new RegularReports();
		TimerTask WarningReport = new WarningReports();
		Timer timerMain = new Timer();
		Timer timerWarn = new Timer();
		

		if(current.after(Clock.getTime(0, 6, 0)))
		{
			timerMain.scheduleAtFixedRate(RegularReport, Clock.getTime(1, 6, 0), Clock.DAY);
			timerWarn.scheduleAtFixedRate(WarningReport, current, Clock.HOUR);
		}
		else
		{
			timerMain.scheduleAtFixedRate(RegularReport, Clock.getTime(1, 6, 0), Clock.DAY);
			timerWarn.scheduleAtFixedRate(WarningReport, Clock.getTime(0, 6, 0), Clock.HOUR);
		}
		
		
		
	
		
		SqlInterlink connServer = new SqlInterlink();
	    connServer.dbConnect("jdbc:sqlserver://192.168.144.3;", "sa", "wp7w4-vdrdh");
	    
	    try {
			System.out.println(SqlInterlink.serverPercent("CubeC"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
