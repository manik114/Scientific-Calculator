import java.util.Scanner;
public class manik {

	public static void main(String[] args) {
		boolean ck=true;
		System.out.println("Enter Your Choice");
		while(ck)
		{
			System.out.println("Enter 1 for adding,subtracting,multiplication and division");
			System.out.println("Enter 2 for using Trigonometric function");
			System.out.println("Enter 3 for logarithomic functions");
			Scanner in=new Scanner(System.in);
			int a=in.nextInt();
			if(a==1)
			{
				four_Operations obj=new four_Operations();
			}
			else if(a==2) {
				Trig obj=new Trig();
			}
			else if(a==3)
			{
				Log obj=new Log();
			}
			System.out.println("If ended using calculator then enter 0 else 1");
			int x=in.nextInt();
			if(x==0) ck=false;
		}

	}

}
