import java.util.*;
class Identifycases
{
	public static void main( String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter an charecter,digit,symbol");
		char ch = sc.nextLine().charAt(0);
		if(ch>='A' &&  ch<='Z')
		{
			System.out.println( ch + "  is upper case ");
		}
		else  if(ch>='a'  && ch<='z')
		{
			System.out.println( ch + " is lower case");
		}
		else  if(ch>='0'  && ch<='9')
		{
			System.out.println( ch + "  is digit");
		}
		else if(Character.isWhitespace(ch))
		{
			System.out.println(  "  is a space");
		}
		else 
		{
			System.out.println( ch + " is a speacial symbol");
		}
		
		    
	    
	}
		
}