import java.util.*;
class Swappin3no
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		double n1=sc.nextDouble();
		System.out.println("enter second number");
		double n2=sc.nextDouble();
		System.out.println("enter third number");
		double n3=sc.nextDouble();
		double n4=n3;
		n3=n2;
		n2=n1;
		n1=n4;
		System.out.println( "after sawpping we get "  +n1+"  "+n2+"  "+n3);



	}
}