import java.util.*;
class Factorial
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a number");
		int no=sc.nextInt();
		int f=1;
		while(no>0)
		{
			f=f*no;
			no=no-1;

		}
		System.out.println(" factorial product is" +f);

	}
}