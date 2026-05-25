import java.util.Scanner;
class A
{
	A(int x)
	{
		System.out.println("parameter constructor ="+x);
	}
}
class B extends A
{
	 B(int x,int y)
	{
		super(x);
		System.out.println("parameter = "+y);
	}	
}

class Arguinheri1
{
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two integers");
        int x=sc.nextInt();
        int y=sc.nextInt();

		B ob=new B(x,y);
		
	}
}