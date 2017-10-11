import java.util.Scanner;


public class Log {
	Log()
	{
		Scanner in=new Scanner(System.in);
		String a;
		boolean ck=true;
		while(ck)
		{
			System.out.println("Enter l for log");
			a=in.nextLine();
			if("l".equals(a))
			{
				System.out.println("Enter the value ");
				int x=in.nextInt();
				System.out.println(Math.log(x));
			}
			a=in.nextLine();
			System.out.println("If ended using this class then press 0 else any key");
			String x=in.nextLine();
			if("0".equals(x)) {
				ck=false;
			}
		}
	}
}
