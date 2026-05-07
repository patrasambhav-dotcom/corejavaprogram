package loopingprogram;
import java.util.*;
public class Loopingprime 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		int no=sc.nextInt();
		if(no<0)
		{
			no=-no;
		}
		int d=2,c=0;
		while(d<=no/2)
		{
			if(no%d==0)
			{
				c=c+1;
				break;
			}
			d=d+1;
		}
		if(c==0)
		{
			System.out.println(no+" is a prime number");
		}
		else 
		{
			System.out.println(no+ "is not a prime number");
		}
		
		

	}

}
