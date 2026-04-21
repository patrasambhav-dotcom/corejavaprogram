import java.util.*;
class Switchshapes
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter choice \1 1.Square \2 2.Rectangle \3 3.circle");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println(" enter lenght of Square"); 
			double a=sc.nextDouble();
			System.out.println(" area of square is  " +(a*a));break;

		case 2: System.out.println(" enter lenght and breadth of Rectangle"); 
			double l=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.println(" area of reactangle is  " +l*b);break;

		case 3: System.out.println(" enter radius of circle");
			double r=sc.nextDouble();
			System.out.println(" area of circle is  " +3.14*(r*r));break;

		default : System.out.println(" invalid ");

		}


	}
}