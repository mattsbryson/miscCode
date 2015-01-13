import java.io.*;

public class SpaceCheck 
{

	String [] to; 
	String from; 
	String host;
	
	
	
	File Cube = new File("\\\\192.168.144.4\\c$\\");
	File CubeD = new File("\\\\192.168.144.4\\d$\\");
	File DC01 = new File("\\\\192.168.144.1\\c$\\");
	File Exch = new File("\\\\192.168.144.2\\c$\\");
	File ExchD = new File("\\\\192.168.144.2\\d$\\");
	File FaxC = new File("\\\\192.168.144.11\\c$\\");
	File FaxS = new File("\\\\192.168.144.11\\s$\\");
	File FaxX = new File("\\\\192.168.144.11\\s$\\");
	File SqlC = new File("\\\\192.168.144.3\\c$\\");
	File SqlD = new File("\\\\192.168.144.3\\d$\\");
	File Web = new File("\\\\192.168.191.2\\c$\\");
	
	
	long availCube = Cube.getUsableSpace();
	long availCubeD = CubeD.getUsableSpace();
	long availDC = DC01.getUsableSpace();
	long availExch = Exch.getUsableSpace();
	long availExchD = ExchD.getUsableSpace();
	long availFaxC = FaxC.getUsableSpace();
	long availFaxS = FaxS.getUsableSpace();
	long availFaxX = FaxX.getUsableSpace();
	long availSqlC = SqlC.getUsableSpace();
	long availSqlD = SqlD.getUsableSpace();
	long availWeb = Web.getUsableSpace();
	
	long tCube = Cube.getTotalSpace();
	long tCubeD = CubeD.getTotalSpace();
	long tDC = DC01.getTotalSpace();
	long tExch = Exch.getTotalSpace();
	long tExchD = ExchD.getTotalSpace();
	long tFaxC = FaxC.getTotalSpace();
	long tFaxS = FaxS.getTotalSpace();
	long tFaxX = FaxX.getTotalSpace();
	long tSqlC = SqlC.getTotalSpace();
	long tSqlD = SqlD.getTotalSpace();
	long tWeb = Web.getTotalSpace();
	
	int pCubeC = (int)(availCube * 100.0 / tCube + 0.5);
	int pCubeD = (int)(availCubeD * 100.0 / tCubeD + 0.5);
	int pDC = (int)(availDC * 100.0 / tDC + 0.5);
	int pExchC = (int)(availExch * 100.0 / tExch + 0.5);
	int pExchD = (int)(availExchD * 100.0 / tExchD + 0.5);
	int pFaxC = (int)(availFaxC * 100.0 / tFaxC + 0.5);
	int pFaxS = (int)(availFaxS * 100.0 / tFaxS + 0.5);
	int pFaxX = (int)(availFaxX * 100.0 / tFaxX + 0.5);
	int pSqlC = (int)(availSqlC * 100.0 / tSqlC + 0.5);
	int pSqlD = (int)(availSqlD * 100.0 / tSqlD + 0.5);
	int pWeb = (int)(availWeb * 100.0 / tWeb + 0.5);
	


	String SpaceReport = 
	"Free space on Cube C Drive : " + availCube/1024/1024 + "\tmB,\t Percent Free: " + pCubeC + "%\n" +
	"Free space on Cube D Drive : " + availCubeD/1024/1024 + "\tmB,\t Percent Free: " + pCubeD + "%\n" +
	"Free space on DC01 C Drive : " + availDC/1024/1024 + "\tmB,\t Percent Free: " + pDC + "%\n" +
	"Free space on Exchange C:  : " + availExch/1024/1024 + "\tmB,\t Percent Free: " + pExchC + "%\n" +
	"Free space on Exchange D:  : " + availExchD/1024/1024 + "\tmB,\t Percent Free: " + pExchD + "%\n" +
	"Free space on Fax01 C Drive: " + availFaxC/1024/1024 + "\tmB,\t Percent Free: " + pFaxC + "%\n" +
	"Free space on Fax01 S Drive: " + availFaxS/1024/1024 + "mB,\t Percent Free: " + pFaxS + "%\n" +
	"Free space on Fax01 X Drive: " + availFaxX/1024/1024 + "mB,\t Percent Free: " + pFaxX + "%\n" +
	"Free space on Sql C Drive  : " + availSqlC/1024/1024 + "\tmB,\t Percent Free: " + pSqlC + "%\n" +
	"Free Space on Sql D Drive  : " + availSqlD/1024/1024 + "\tmB,\t Percent Free: " + pSqlD + "%\n" +
	"Free space on Web C Drive  : " + availWeb/1024/1024 + "\tmB,\t Percent Free: " + pWeb + "%\n";
	

	
	
	
	
	

	
	
	public SpaceCheck(String [] t, String f, String h) //sets values
	{
		to = t;
		from = f;
		host = h;
	
	}
	
	
	
	public void SpaceReport()  //actually tells the email object to send
	{
		Email sender = new Email();
		sender.sendEmails(to, from, host, "Daily Storage Report", SpaceReport);
	}
    	
	public void DailySpaceAlerts(String to, String from, String host) //emails by itself
	{
		Email sender = new Email();
		
		if(pCubeC < 20 && pCubeC > 5)
		{
			sender.SendEmail(to, from, host, "Low Drive Space on Cube C:", " Cobalt-Cube C Drive has " + pCubeC + "% space remaining.");
		}
		if(pCubeD < 20 && pCubeD > 5)
		{
			sender.SendEmail(to, from, host, "Low Drive Space on Cube D:", " Cobalt-Cube C Drive has " + pCubeD + "% space remaining.");
		}
		if(pDC < 20 && pDC > 5)
		{
			sender.SendEmail(to, from, host, "Low Drive Space on DC01:", " Cobalt-DC01 has " + pDC + "% space remaining.");
		}
		if(pExchC < 20 && pExchC > 5)
		{
			sender.SendEmail(to, from, host, "Low Drive Space on Exchange C:", " Cobalt-Exch C Drive has " + pExchC + "% space remaining.");
		}
		if(pExchD < 20 && pExchD > 5)
		{
			sender.SendEmail(to, from, host, "Low Drive Space on Exchange D:", " Cobalt-Exch D Drive has " + pExchD + "% space remaining.");
		}
		if(pFaxC < 20 && pFaxC > 5)
		{
			sender.SendEmail(to, from, host, "Low Drive Space on Fax C:", " Fax01 C drive has " + pFaxC + "% space remaining.");
		}
		if(pFaxS < 20 && pFaxS > 5)
		{
			sender.SendEmail(to, from, host, "Low Drive Space on Fax S:", " Fax01 S drive has " + pFaxS + "% space remaining.");
		}
		if(pFaxX < 20 && pFaxX > 5)
		{
			sender.SendEmail(to, from, host, "Low Drive Space on Fax X:", " Fax01 X drive has " + pFaxX + "% space remaining.");
		}
		if(pSqlC < 20 && pSqlC > 5)
		{
			sender.SendEmail(to, from, host, "Low Drive Space on Sql C:", " Sql C drive has " + pSqlC + "% space remaining.");
		}
		if(pSqlD < 20 && pSqlD > 5)
		{
			sender.SendEmail(to, from, host, "Low Drive Space on Sql D:", " Sql D drive has " + pSqlD + "% space remaining.");
		}
		if(pWeb < 20 && pWeb > 5)
		{
			sender.SendEmail(to, from, host, "Low Drive Space on Web C:", " Wec C drive has " + pWeb + "% space remaining.");
		}
		
	}
	
	public void DailySpaceAlerts(String [] to, String from, String host) //emails by itself
	{
		Email sender = new Email();
		
		if(pCubeC < 20 && pCubeC > 5)
		{
			sender.sendEmails(to, from, host, "Low Drive Space on Cube C:", " Cobalt-Cube C Drive has " + pCubeC + "% space remaining.");
		}
		if(pCubeD < 20 && pCubeD > 5)
		{
			sender.sendEmails(to, from, host, "Low Drive Space on Cube D:", " Cobalt-Cube C Drive has " + pCubeD + "% space remaining.");
		}
		if(pDC < 20 && pDC > 5)
		{
			sender.sendEmails(to, from, host, "Low Drive Space on DC01:", " Cobalt-DC01 has " + pDC + "% space remaining.");
		}
		if(pExchC < 20 && pExchC > 5)
		{
			sender.sendEmails(to, from, host, "Low Drive Space on Exchange C:", " Cobalt-Exch C Drive has " + pExchC + "% space remaining.");
		}
		if(pExchD < 20 && pExchD > 5)
		{
			sender.sendEmails(to, from, host, "Low Drive Space on Exchange D:", " Cobalt-Exch D Drive has " + pExchD + "% space remaining.");
		}
		if(pFaxC < 20 && pFaxC > 5)
		{
			sender.sendEmails(to, from, host, "Low Drive Space on Fax C:", " Fax01 C drive has " + pFaxC + "% space remaining.");
		}
		if(pFaxS < 20 && pFaxS > 5)
		{
			sender.sendEmails(to, from, host, "Low Drive Space on Fax S:", " Fax01 S drive has " + pFaxS + "% space remaining.");
		}
		if(pFaxX < 20 && pFaxX > 5)
		{
			sender.sendEmails(to, from, host, "Low Drive Space on Fax X:", " Fax01 X drive has " + pFaxX + "% space remaining.");
		}
		if(pSqlC < 20 && pSqlC > 5)
		{
			sender.sendEmails(to, from, host, "Low Drive Space on Sql C:", " Sql C drive has " + pSqlC + "% space remaining.");
		}
		if(pSqlD < 20 && pSqlD > 5)
		{
			sender.sendEmails(to, from, host, "Low Drive Space on Sql D:", " Sql D drive has " + pSqlD + "% space remaining.");
		}
		if(pWeb < 20 && pWeb > 5)
		{
			sender.sendEmails(to, from, host, "Low Drive Space on Web C:", " Web C drive has " + pWeb + "% space remaining.");
		}
		
	}
	
	
	
	
	
	
	
	
	public void HourlySpaceAlerts(String [] to, String from, String host) //emails by itself
	{
		Email hourSender = new Email();
		
		
		
		
		if(pCubeC < 6)
		{
			hourSender.sendEmails(to, from, host, "Extremely Low Drive Space on Cube C:", " Cobalt-Cube C Drive has " + pCubeC + "% space remaining.");
		}
		if(pCubeD < 6)
		{
			hourSender.sendEmails(to, from, host, "Extremely Low Drive Space on Cube D:", " Cobalt-Cube C Drive has " + pCubeD + "% space remaining.");
		}
		if(pDC < 6)
		{
			hourSender.sendEmails(to, from, host, "Extremely Low Drive Space on DC01:", " Cobalt-DC01 has " + pDC + "% space remaining.");
		}
		if(pExchC < 6)
		{
			hourSender.sendEmails(to, from, host, "Extremely Low Drive Space on Exchange C:", " Cobalt-Exch C Drive has " + pExchC + "% space remaining.");
		}
		if(pExchD < 6)
		{
			hourSender.sendEmails(to, from, host, "Extremely Low Drive Space on Exchange D:", " Cobalt-Exch D Drive has " + pExchD + "% space remaining.");
		}
		if(pFaxC < 6)
		{
			hourSender.sendEmails(to, from, host, "Extremely Low Drive Space on Fax C:", " Fax01 C drive has " + pFaxC + "% space remaining.");
		}
		if(pFaxS < 6)
		{
			hourSender.sendEmails(to, from, host, "Extremely Low Drive Space on Fax S:", " Fax01 S drive has " + pFaxS + "% space remaining.");
		}
		if(pFaxX < 6)
		{
			hourSender.sendEmails(to, from, host, "Extremely Low Drive Space on Fax X:", " Fax01 X drive has " + pFaxX + "% space remaining.");
		}
		if(pSqlC < 6)
		{
			hourSender.sendEmails(to, from, host, "Extremely Low Drive Space on Sql C:", " Sql C drive has " + pSqlC + "% space remaining.");
		}
		if(pSqlD < 6)
		{
			hourSender.sendEmails(to, from, host, "Extremely Low Drive Space on Sql D:", " Sql D drive has " + pSqlD + "% space remaining.");
		}
		if(pWeb < 6)
		{
			hourSender.sendEmails(to, from, host, "Extremely Low Drive Space on Web C:", " Web C drive has " + pWeb + "% space remaining.");
		}
		
	}
	
	public void HourlySpaceAlerts(String to, String from, String host) //emails by itself
	{
		Email hourSender = new Email();
			
		if(pCubeC < 6)
		{
			hourSender.SendEmail(to, from, host, "Extremely Low Drive Space on Cube C:", " Cobalt-Cube C Drive has " + pCubeC + "% space remaining.");
		}
		if(pCubeD < 6)
		{
			hourSender.SendEmail(to, from, host, "Extremely Low Drive Space on Cube D:", " Cobalt-Cube C Drive has " + pCubeD + "% space remaining.");
		}
		if(pDC < 6)
		{
			hourSender.SendEmail(to, from, host, "Extremely Low Drive Space on DC01:", " Cobalt-DC01 has " + pDC + "% space remaining.");
		}
		if(pExchC < 6)
		{
			hourSender.SendEmail(to, from, host, "Extremely Low Drive Space on Exchange C:", " Cobalt-Exch C Drive has " + pExchC + "% space remaining.");
		}
		if(pExchD < 6)
		{
			hourSender.SendEmail(to, from, host, "Extremely Low Drive Space on Exchange D:", " Cobalt-Exch D Drive has " + pExchD + "% space remaining.");
		}
		if(pFaxC < 6)
		{
			hourSender.SendEmail(to, from, host, "Extremely Low Drive Space on Fax C:", " Fax01 C drive has " + pFaxC + "% space remaining.");
		}
		if(pFaxS < 6)
		{
			hourSender.SendEmail(to, from, host, "Extremely Low Drive Space on Fax S:", " Fax01 S drive has " + pFaxS + "% space remaining.");
		}
		if(pFaxX < 6)
		{
			hourSender.SendEmail(to, from, host, "Extremely Low Drive Space on Fax X:", " Fax01 X drive has " + pFaxX + "% space remaining.");
		}
		if(pSqlC < 6)
		{
			hourSender.SendEmail(to, from, host, "Extremely Low Drive Space on Sql C:", " Sql C drive has " + pSqlC + "% space remaining.");
		}
		if(pSqlD < 6)
		{
			hourSender.SendEmail(to, from, host, "Extremely Low Drive Space on Sql D:", " Sql D drive has " + pSqlD + "% space remaining.");
		}
		if(pWeb < 6)
		{
			hourSender.SendEmail(to, from, host, "Extremely Low Drive Space on Web C:", " Web C drive has " + pWeb + "% space remaining.");
		}
		
	}
	
}
