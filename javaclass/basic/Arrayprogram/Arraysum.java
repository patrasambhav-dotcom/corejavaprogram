import java.util.*;
class Arraysum
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int no[];
		System.out.println("enter number of integers");
		int size=sc.nextInt();
		no=new int[size];
		System.out.println("enter "+size+" integers  ");
        int i;
        for(i=0;i<no.length;i++)
        {
        	no[i]=sc.nextInt();
        }
		int s=0;
		
		for(i=0;i<no.length;i++)
		{
			s=s+no[i];
		}
		System.out.println("sum of integers = "+s);
	}
}