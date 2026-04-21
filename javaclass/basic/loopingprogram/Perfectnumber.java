import java.util.*;
class Perfectnumber
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a number");
		int no=sc.nextInt();
		int d=1,s=0;
		while(d<=no/2)
		{
			if (no%d==0)
			{
				s=s+d;
				
			}
			d=d+1;
		}	
			if(no==s)
			{
				System.out.println( no + "  is perfect number");
			}
			else 
			{
				System.out.println( no + " is not a perfect number");	
			}
		

		
		

	}
}
