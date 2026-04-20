import java.util.*;
class Loopingnoindec
{
	public static void main( String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" entera three digit number");
		int no=sc.nextInt();
		while(no!=0)
		{
			System.out.println(no%10);
			no=no/10;

		}
	}
}