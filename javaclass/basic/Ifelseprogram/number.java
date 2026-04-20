import java.util.Scanner;
class number 
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		int no=sc.nextInt();
		if(no==0)
		{
			System.out.println("number is zero");
	    }
		else 
		{
			if(no>0)
			{
				System.out.println("number is positive");

			}
			else 
				{
					System.out.println("numberis negative");
				}
			
		}

		
	}
	
}