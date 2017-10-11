import java.util.Scanner;


public class four_Operations {
	four_Operations()
	{
		boolean ck=true;
		while(ck)
		{
			System.out.println("Enter a for add s for subtract m for multiplication and d for division");
			String operation_Ckeck;
			Scanner in=new Scanner(System.in);
			operation_Ckeck=in.nextLine();
			if("a".equals(operation_Ckeck))
			{
				System.out.println("Enter two number to add");
				int a,b;
				a=in.nextInt();
				b=in.nextInt();
				System.out.println(a+b);
			}
			
			if("s".equals(operation_Ckeck))
			{
				System.out.println("Enter two number to subtract");
				int a,b;
				a=in.nextInt();
				b=in.nextInt();
				System.out.println(a-b);
			}
			
			if("m".equals(operation_Ckeck))
			{
				System.out.println("Enter two number to multiply");
				int a,b;
				a=in.nextInt();
				b=in.nextInt();
				System.out.println(a*b);
			}
			
			if("d".equals(operation_Ckeck))
			{
				System.out.println("Enter two number to divide");
				int a,b;
				a=in.nextInt();
				b=in.nextInt();
				System.out.println(a/b);
			}
			operation_Ckeck=in.nextLine();
			
			System.out.println("If ended this type of operation then type e to exit this class");
			operation_Ckeck=in.nextLine();
			if("e".equals(operation_Ckeck))
				ck=false;
			
		}
	}
}
