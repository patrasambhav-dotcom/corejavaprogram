import java.util.*;
class Loopingdec
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		for(no=no;no>0;no--)
		{
			System.out.print(no+"\t");

		}
		System.out.print(" numbers in decreasing order");
	}
}