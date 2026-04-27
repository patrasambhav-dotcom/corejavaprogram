import java.util.*;
class Noreturnnoarg
{
	static void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int sum=no1+no2;
		System.out.println("sum =  " +sum);
		return;
		
		
	}
	public static void main(String arg[])
	{
		add();
	}
}