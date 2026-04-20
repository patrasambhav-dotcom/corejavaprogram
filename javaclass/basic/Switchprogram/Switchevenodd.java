import java.util.*;
class Switchevenodd
{
	public static void main( String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no1=sc.nextInt();
		switch(no1%2)
		{
		case 0:System.out.println(" even number");break;
		default : System.out.println("odd number");
		}
	}
}