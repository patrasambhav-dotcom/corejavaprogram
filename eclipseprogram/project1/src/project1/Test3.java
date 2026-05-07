package project1;

public class Test3 
{
	private String name;
	private int rollno;
	private int marks;

	public Test3(String n,int r,int m) 
	{
		name=n;
		rollno=r;
		marks=m;
		
	}
	void dis()
	{
		System.out.println("my name is "+name);
		System.out.println("my rollno is "+rollno);
		System.out.println("my marks is "+marks);
	}

	public static void main(String arg[]) 
	{
		Test3 t=new Test3("sam",5,60);
		t.dis();

	}

}
