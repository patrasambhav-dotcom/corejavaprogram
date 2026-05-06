import java.util.*;
class Simple
{
	private double prin;
	private double rate; 
	private double time;
	Simple()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal amount ");
		prin=sc.nextDouble();
		System.out.println("enter rate ");
		rate=sc.nextDouble();
		System.out.println("enter time");
		time=sc.nextDouble();

	}
	
	void simpleint()
	{
		System.out.println("simpleintrest = "+(prin*rate*time)/100);
	}
}
class Privatesimple
{
	public static void main(String arg[])
	{
		Simple s=new Simple();
		
		s.simpleint();
	}
}