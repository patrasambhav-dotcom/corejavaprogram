import java.util.*;
class Methodclass
{
	static void student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter class");
		int c=sc.nextInt();
		System.out.println("enter roll no ");
		int r=sc.nextInt();
		System.out.println("my name is "+name+", class "+c+",roll no"+r);
	}
	public static void main(String arg[])
	{
		student();
	}
}