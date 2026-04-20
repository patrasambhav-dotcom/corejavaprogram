import java.util.Scanner;
class Enterchoiceshapes
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice \1 1.square\2 2.reactangle\3 3.circle");
		double ch=sc.nextDouble();
		if(ch==1)
		{
			System.out.println("enter lenght of sqaure");
			double a=sc.nextDouble();
			System.out.println("perimeter of sqaure = " +4*a);
			System.out.println("area of square = " +a*a);
		}
		else if(ch==2)
		{
			System.out.println("enter lenght and breadth of reactangle");
			double l=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.println(" perimeter of reactangle =  " +2*(l+b));
			System.out.println(" area of reactangle = " +(l*b) );

		}
		else if(ch==3)
		{
			System.out.println(" enter radius of circle");
			double r=sc.nextDouble();
			System.out.println("perimeter of circle = " +(2*3.14*r));
			System.out.println("area of circle = " +(3.14*r*r));

		}
		else 
			System.out.println(" invalid choice");

	}
}