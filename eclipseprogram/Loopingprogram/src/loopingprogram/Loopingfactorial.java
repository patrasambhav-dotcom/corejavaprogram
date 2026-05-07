package loopingprogram;
import java.util.*;
public class Loopingfactorial 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		int no=sc.nextInt();
		int temp=no;
		if(no<0)
		{
			no=-no;
		}
		int fac=1;
		while(no>0)
		{
			fac=fac*no;
			no=no-1;
			
		}
		System.out.println("factorial of "+temp+"= "+fac );
	
		

	}

}
