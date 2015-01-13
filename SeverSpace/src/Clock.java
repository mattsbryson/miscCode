

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class Clock{

	
	final public static long DAY = 1000*60*60*24;
	final public static long HOUR = 1000*60*60;
	
	
	
	
	

	
	public static Date getTime(int OneDay, int Hour, int Minutes)
	{
		
		Calendar tomorrow = new GregorianCalendar();
		tomorrow.add(Calendar.DATE, OneDay);
	    Calendar result = new GregorianCalendar(
	    tomorrow.get(Calendar.YEAR),
	    tomorrow.get(Calendar.MONTH),
	    tomorrow.get(Calendar.DATE),
	    Hour,
	    Minutes
	    );
	    
	    if(Hour > 5 || Hour < 11)
	    {
	    	return result.getTime();
	    }
	    else
	    {
	    	return getTime(0, 6, 0);
	    }
	}



}
