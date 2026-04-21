import java.util.*;
class Primenumber
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a number");
		int no=sc.nextInt();
		int d=2,c=0;
		while(d<=no/2)
		{
			if (no%d==0)
			{
			   c=c+1;
			  break;
			   
			}

			d=d+1;
		}
			if(c==0)
			{
				System.out.println( no + "  is a prime number");
			}
			else 
			{
				System.out.println( no + " is not a prime number");
			}
	
	}
}
