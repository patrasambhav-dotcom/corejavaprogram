import java.util.*;
class Numberperfect
{
	public static void main(String arg[])
	{
		
		int no=1;
		int d,s;
		while(no<=100000)
		{
				d=1;
				s=0;
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
						System.out.println( no + "  is perfcet number");
					}
				
			no=no+1;	
          }
		
		

	}
}
