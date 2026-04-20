import java.util.*;
class Looping11
{
	public static void main( String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number");
		int no=sc.nextInt();
		int c=0; 

		while(no!=0)
		{
		   c=c+1;
		   
		   no=no/10;
		}
		
		{
			System.out.println(" number of digits=" +c );
		}
		
		
	}
}