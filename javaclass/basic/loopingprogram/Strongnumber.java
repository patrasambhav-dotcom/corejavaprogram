import java.util.*;
class Strongnumber
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int i=sc.nextInt();
		int r,s=0;
		int fac=1; 
		int temp=i;
		while(i>0)
		{
			r=i%10;
			fac=1;

			while(r>0)
			{
				fac=fac*r;
			     r=r-1;
			}
			s=s+fac;
			i=i/10;
              
		}
			if(temp==s)
			{
				System.out.println(temp+"  is a strong number");
			}
			else 
			{
				System.out.println(temp +"  is not astrong number");
			}

		} 

	}
