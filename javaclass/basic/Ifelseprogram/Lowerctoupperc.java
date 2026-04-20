import java.util.*;
class Lowertoupperc
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a letter");
		char ch=sc.next().charAt(0);
		if(ch>='a')
		{
			if(ch<='z')
		
	
		
			ch=(char)(ch-32);
		}
	    
	
		System.out.println("lower case to upper case =  " +ch);
	

	}
}