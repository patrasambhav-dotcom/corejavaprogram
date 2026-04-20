import java.util.*;
class Looping13
{
	public static void main( String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number");
		int no=sc.nextInt();
		int es=0,os=0,r=0; 

		while(no!=0)
		{
			r=no%10;
			if(r%2==0)
			{
				es=es+r;

			}
			else 
			{
				os=os+r;

			}
			no=no/10;
		}
		System.out.println(" sum of even digits =  " +es);
		System.out.println(" sum of odd digits =  " +os);
		
		
		
	}
}