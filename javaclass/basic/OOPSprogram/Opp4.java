class Employee
{
	String name;
	int salary;
	String martialstatus;
	int birthyear;
	String state;
}
class Opp4
{
	public static void main(String arg[])
	{
		Employee e=new Employee();
		e.name="muna";
		e.salary=400000;
		e.martialstatus="married";
		e.birthyear=1997;
		e.state="Odisha";
		System.out.println("my name is "+e.name);
		System.out.println("my salary is "+e.salary);
		System.out.println("marital status "+e.martialstatus);
		System.out.println("my birth year is "+e.birthyear);
		System.out.println("state i live in is "+e.state);

		Employee e1=new Employee();
		e1.name="rahul";
		e1.salary=500000;
		e1.martialstatus="unmarried";
		e1.birthyear=2001;
		e1.state="Rajasthan";
		System.out.println("my name is "+e1.name);
		System.out.println("my salary is "+e1.salary);
		System.out.println("marital status "+e1.martialstatus);
		System.out.println("my birth year is "+e1.birthyear);
		System.out.println("state i live in is "+e1.state);
	}
}