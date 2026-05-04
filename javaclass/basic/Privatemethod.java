class Employee
{
	private String name;
	private int salary;
	private String martialstatus;
	private int birthyear;
	private String state;
	void inti()
	{
		name="muna";
		salary=400000;
		martialstatus="married";
		birthyear=1997;
		state="Odisha";

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
class Privatemethod
{
	public static void main(String arg[])
	{
		Employee e=new Employee();
		e.inti();
		e.disp();
		
		
	}
}