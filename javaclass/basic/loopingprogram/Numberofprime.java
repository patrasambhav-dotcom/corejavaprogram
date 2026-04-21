import java.util.*;
class Numberofprime
{
	public static void main(String arg[])
	{
		int no=10,d,c;
		while(no<=20)
		{
			d=2;
			c=0;
		
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
				System.out.println( " number of prime no = " +no);
			}
			no=no+1;
			
		}
			
	
	}
}
