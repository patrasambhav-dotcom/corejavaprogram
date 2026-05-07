package methodprogram;
import java.util.*;
public class Armstrongnumber1
{
	static int count(int no)
	{
		int p=0;
		while(no!=0)
		{
			no=no/10;
			p++;
		}
		return p;
	}
	static int armstrong(int no)
	{
		int p=count(no);
		int arm=0,r;
		while(no!=0)
		{
			r=no%10;
			arm=arm+ (int)Math.pow(r, p);
			no=no/10;	
		}
		return arm;
	}
	static boolean check(int no)
	{
		if(armstrong(no)==no)
		{
			return true;
		}
		return false;
	}
	  

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter an integer");
		for(int no=1;no<=1000;no++)
		{
			if(check(no))
				
			System.out.println(no+" is a armstrong number");
			
		}
		
		

	}

}
