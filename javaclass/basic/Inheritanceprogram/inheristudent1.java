import java.util.*;
class Person
{
	String n;
	int a;
	Person()
	{
		n=" ";
		a=0;
	}
	Person(String n,int a)
	{
		this.n=n;
		this.a=a;
	}
	void disp()
	{
		System.out.println("Name : "+n);
		System.out.println("Age : "+a);
	}
}
class Student extends Person
{
	double m;
	int r;
	Student()
	{
		m=0.0;
		r=0;
	}
	Student(String n,int a,double m,int r)
	{
		super(n,a);
		this.m=m;
		this.r=r;
	}
	void show()
	{
		System.out.println("Roll no : "+r);
		System.out.println("Marks :"+m);
	}
}
class inheristudent1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String n=sc.nextLine();
		System.out.println("enter age");
		int a=sc.nextInt();
		System.out.println("enter roll no");
		int r=sc.nextInt();
		System.out.println("enter marks");
		double m=sc.nextDouble();

		Student ob=new Student(n,a,m,r);
		ob.disp();
		ob.show();
	}
}