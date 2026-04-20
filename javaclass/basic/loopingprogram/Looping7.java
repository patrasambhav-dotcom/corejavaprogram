import java.util.*;
class Looping7
{
	public static void main( String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number");
		int no=sc.nextInt();
		if(no<0)
		{
			no=-no;
		}
		while(no>=10)

		{
		no=no/10;
		}
		System.out.println(no);
	}
}