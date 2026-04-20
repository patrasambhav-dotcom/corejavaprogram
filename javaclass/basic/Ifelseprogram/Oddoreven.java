import java.util.*;
class Oddoreven
{
	public static void main( String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double no1=sc.nextDouble();
		String msg;
		msg=no1%2==0?"even no":"odd no";
		System.out.println(msg);

	}
}