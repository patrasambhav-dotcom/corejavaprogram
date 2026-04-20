import java.util.*;
class Swappingno
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double a=sc.nextDouble();
		System.out.println("intially first no is  "+a+" ");
		System.out.println("enter a number");
		double b=sc.nextDouble();
		System.out.println("intially first no is   "+b"");
		double c=b;
		 b=a;
		 a=c;
		System.out.println(" after swapping numbers we get"+a+" "+b+"");


	}
}
