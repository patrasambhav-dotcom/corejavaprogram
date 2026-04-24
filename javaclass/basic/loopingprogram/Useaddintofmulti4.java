import java.util.*;
class Useaddintofmulti4
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int i=sc.nextInt();
		System.out.println("enter a number for power");
		int j=sc.nextInt();
		int s=1;
		while(j>0)
		{
			s=s*i;
			j--;
			
			System.out.print(s+"\t");	
        }
		
        
	}
}