import java.util.*;
class Returnnoarg
{
	static int  add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int sum=no1+no2;
		return sum;
		

	}
	public static void main(String arg[])
	{
		int res=add();
		System.out.println("sum = " +res);
	}
	
		
		
}