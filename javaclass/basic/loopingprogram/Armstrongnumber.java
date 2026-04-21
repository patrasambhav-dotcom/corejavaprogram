import java.util.*;
class Armstrongnumber
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a number");
		int no=sc.nextInt();
		int p=0,arm=0,r,temp;
		temp=no;
		while (temp!=0)
		{
			p=p+1;
			temp=temp/10;
		}
		temp=no;
		arm=0;
		while(temp!=0)
		{
			r=temp%10;
			arm=arm+(int)Math.pow(r,p);
			temp=temp/10;
		}
		if(no==arm)
		{
			System.out.println(no + "  is armstrongnumber");

		}
		else 
		{
			System.out.println( no + " is not armstrongnumber");
		}

	}
}