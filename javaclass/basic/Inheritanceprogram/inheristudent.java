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
class inheristudent
{
	public static void main(String arg[])
	{
		Student ob=new Student("Sam",19,90.8,5);
		ob.disp();
		ob.show();
	}
}