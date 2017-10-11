import java.util.Scanner;
import java.lang.Math;


public class Trig {
	Trig()
	{
		boolean ck=true;
		while(ck) {
			String operation;
			System.out.println("Enter s fo Sine, c for Cos, t for Tan");
			Scanner in=new Scanner(System.in);
			operation=in.nextLine();
			if("s".equals(operation))
			{
				int x;
				System.out.println("Enter a value for x");
				x=in.nextInt();
				System.out.println(Math.sin(Math.toRadians(x)));
			}
			else if("c".equals(operation))
			{
				int x;
				System.out.println("Enter a value of x");
				x=in.nextInt();
				System.out.println(Math.cos(Math.toRadians(x)));
			}
			else if("t".equals(operation))
			{
				int x;
				System.out.println("Enter a value of x");
				x=in.nextInt();
				System.out.println(Math.tan(Math.toRadians(x)));
			}
			operation=in.nextLine();
			System.out.println("If ended using this class then enter 0 else any key");
			String x=in.nextLine();
			if("0".equals(x)) ck=false;
		}
	}
}
