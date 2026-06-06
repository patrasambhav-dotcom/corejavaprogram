package inheri1;
class Person 
{
	int age;
	String name;
	Person()
	{
		age=0;
		name=" ";	
	}
	 Person(int age, String name) 
	{
		super();
		this.age = age;
		this.name = name;
	}
	void disp()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}
class Student extends Person
{
	double marks;
	int rollno;
	Student()
	{
		marks=0.0;
		rollno=0;
	}
	public Student(int age, String name,double marks,int rollno) 
	{
		super(age, name);
		this.marks=marks;
		this.rollno=rollno;
	}
	void look()
	{
		System.out.println("Marks :"+marks);
		System.out.println("Rollno :"+rollno);
	}
	
}

public class Stingcon 
{
	public static void main(String arg[])
	{
		Student ob=new Student(19,"Sam",90.5,5);
		ob.disp();
		ob.look();
	}

}
