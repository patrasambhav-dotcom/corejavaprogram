import java.util.*;
interface Mathutil
{
	static int power(int x,int y)
	{
		return (int)Math.pow(x, y);
	}
}
public class Staticface
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("enter an integer");
		x=sc.nextInt();
		System.out.println("enter power");
		y=sc.nextInt();
		int result= Mathutil.power(x, y);
		System.out.println("Result "+result);
		
	}
}