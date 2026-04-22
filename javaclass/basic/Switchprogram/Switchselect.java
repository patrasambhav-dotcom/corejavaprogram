import java.util.Scanner;
class Switchselect
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a charecter");
		char ch=sc.next().charAt(0);
		if ( (ch>='A' && ch<='Z')  || (ch>='a' && ch<='z') )
		{
			if(ch>='A' && ch<='Z')
			{
				System.out.println(" Upper case");
			}
			else
			{
				System.out.println("Lower case");
			}
			switch(ch)
			{
			case 'a': case 'A':case 'e':case 'E': 
			case 'i': case 'I': case 'o':case 'O':case 'u':case 'U':
				System.out.println(" Vowels");break;
			default : System.out.println(" consonants");
			}
		}

	}
}