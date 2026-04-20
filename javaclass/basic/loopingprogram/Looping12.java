import java.util.*;
class Looping12
{
	public static void main( String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number");
		int no=sc.nextInt();
		int ec=0,oc=0,r=0; 

		while(no!=0)
		{
			r=no%10;
			if(r%2==0)
			{
				ec++;

			}
			else 
			{
				oc++;

			}
			no=no/10;
		}
		System.out.println(" number of even digits =  " +ec);
		System.out.println(" number of odd digits =  " +oc);
		
		
		
	}
}