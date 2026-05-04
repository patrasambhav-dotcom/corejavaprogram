class Employee
{
	String name;
	int salary;
	String martialstatus;
	int birthyear;
	String state;
}
class Opp3
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
	}
}