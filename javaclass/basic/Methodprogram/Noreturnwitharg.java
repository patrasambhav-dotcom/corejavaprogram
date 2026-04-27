import java.util.*;
class Noreturnwitharg
{
	static void add(int no1,int no2)
	{
		int sum=no1+no2;
		System.out.println("sum = " +sum);
		

	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		add(no1,no2);
	}
}