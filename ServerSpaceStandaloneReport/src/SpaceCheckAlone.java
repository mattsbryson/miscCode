import java.io.*;

public class SpaceCheckAlone 
{
	
	public static void main(String[] args) {
		
		
		System.out.println("Version 1.2\n\n");	
	
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
    	"Free space on Fax01 S Drive: " + availFaxS/1024/1024 + "\tmB,\t Percent Free: " + pFaxS + "%\n" +
    	"Free space on Fax01 X Drive: " + availFaxX/1024/1024 + "\tmB,\t Percent Free: " + pFaxX + "%\n" +
    	"Free space on Sql C Drive  : " + availSqlC/1024/1024 + "\tmB,\t Percent Free: " + pSqlC + "%\n" +
    	"Free Space on Sql D Drive  : " + availSqlD/1024/1024 + "\tmB,\t Percent Free: " + pSqlD + "%\n" +
    	"Free space on Web C Drive  : " + availWeb/1024/1024 + "\tmB,\t Percent Free: " + pWeb + "%\n";
    	
    	
    	System.out.print(SpaceReport);
	}
    	
}

	/*
System.out.println("Free space on Cube: " + availCube/1024/1024 + " mB");
System.out.println("Free space on Cube D Drive: " + availCubeD/1024/1024 + " mB");
System.out.println("Free space on DC01: " + availDC/1024/1024 + " mB");
System.out.println("Free space on Exchange: " + availExch/1024/1024 + " mB");
System.out.println("Free space on Fax01 C Drive: " + availFaxC/1024/1024 + " mB");
System.out.println("Free space on Fax01 S Drive: " + availFaxS/1024/1024 + " mB");
System.out.println("Free space on Fax01 X Drive: " + availFaxX/1024/1024 + " mB");
System.out.println("Free space on Sql: " + availSql/1024/1024 + " mB");
System.out.println("Free space on Web: " + availWeb/1024/1024 + " mB");
*/

