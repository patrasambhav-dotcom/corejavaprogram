import java.util.*;
class Strongnumber1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10000;i++)
		{
		int r,s=0;
		int fac=1; 
		int temp=i;
		while(temp>0)
		{
			r=temp%10;
			fac=1;

			while(r>0)
			{
				fac=fac*r;
			     r=r-1;
			}
			s=s+fac;
			temp=temp/10;
              
		}
			if(i==s)
			{
				System.out.println(i+"  is a strong number");
			}
			
          }
		} 

	}
