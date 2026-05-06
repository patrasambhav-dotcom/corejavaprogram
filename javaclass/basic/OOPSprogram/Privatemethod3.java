import java.util.*;
class Employee
{
	private String name;
	private double salary;
	private String martialstatus;
	private int birthyear;
	private String state;
	void inti()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		 name=sc.nextLine();
		System.out.println("enter salary");
		 salary=sc.nextDouble();
		System.out.println("enter martialstatus");
		 martialstatus=sc.next();
		System.out.println("enter birthyear");
		 birthyear=sc.nextInt();
		System.out.println("enter state you live in");
		 state=sc.next();

	}
	void disp()
	{
		System.out.println("my name is "+name);
		System.out.println("my salary is "+salary);
		System.out.println("marital status "+martialstatus);
		System.out.println("my birth year is "+birthyear);
		System.out.println("state i live in is "+state);

	}
}
class Privatemethod3
{
	public static void main(String arg[])
	{
		Employee e=new Employee();
		e.inti();
		e.disp();
		Employee e1=new Employee();
		e1.inti();
		e1.disp();
		
		
	}
}