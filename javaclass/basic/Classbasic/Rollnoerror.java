import java.util.*;
class Rollnoerror
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno");
		int q=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String n=sc.nextLine();
		System.out.println("enter marks");
		double e=sc.nextDouble();
		System.out.println("my name is "+n+",roll no is "+q+" and marks is"+e);

	}
}