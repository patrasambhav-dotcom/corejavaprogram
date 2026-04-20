import java.util.*;
class Twenty
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value in fahrenhite");
		double f=sc.nextDouble();
		double c=(f-32)*5/9;
		System.out.println( "the value in celsius is"+c );


	}
}