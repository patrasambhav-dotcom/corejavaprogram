import java.util.Scanner;
class Ifcharec
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a letter");
		char ch=sc.next().charAt(0);
		if(ch>='A')
		{
			if(ch<='Z')
		
		
		{
			ch=(char)(ch+32);
		}
		}
		
			System.out.println(" letter in lower case  " +ch);
		
	}
}	