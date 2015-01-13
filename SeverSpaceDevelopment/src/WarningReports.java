import java.util.TimerTask;


public class WarningReports extends TimerTask 
{

	
	public void run() 
	{
		
		
		//possibly move this array to a centralized class
			String [] to = new String[4]; 
			to[1] = "ian.stanton@cobaltcc.com";
			to[0] = "matt.bryson@cobaltcc.com";
			to[3] = "glenn.purcell@cobaltcc.com";
			to[2] = "sam.accardo@cobaltcc.com";
			String from = "bob@cobaltcc.com";
			String host = "mail.cobaltcc.com";
			SpaceCheck Warn = new SpaceCheck(to, from, host);
			Warn.HourlySpaceAlerts(to, from, host);
			
			
	
		
		
	}

}
