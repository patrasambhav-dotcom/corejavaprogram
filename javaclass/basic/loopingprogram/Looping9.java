import java.util.*;
class Looping9
{
	public static void main( String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number");
		int no=sc.nextInt();
		int r,s=0;
		while(no!=0)
		{
		   r=no%10;
		   s=s*10+r;
		   no=no/10;
		}
		System.out.println( " reverse is"+s);
	}
}