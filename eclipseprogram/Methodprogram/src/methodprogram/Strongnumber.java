package methodprogram;
import java.util.*;

public class Strongnumber 
{
	 
	static int strongnumber(int no)
	{
		
		int r;
		int s=0;
		while(no!=0)
		{
		   r=no%10;
		   int fac=1;
		   while(r>0)
		   {
			   fac=fac*r;
			   r=r-1;  
		   }
		   
		   s=s+fac;
		   no=no/10;
		}
		return s;
		
	}
	static boolean check(int no)
	{
		if(strongnumber(no)==no)
		{
			return true;
		}
		return false;
	}

	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		int no=sc.nextInt();
		
		if(check(no))
		{
			System.out.println( no+"   is a strognumber");
		}
		else
		{
			System.out.println( no+" is not a strongnumber");
		}
		

	}

}
