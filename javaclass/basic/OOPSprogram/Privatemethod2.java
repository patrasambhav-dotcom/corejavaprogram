class Employee
{
	private String name;
	private int salary;
	private String martialstatus;
	private int birthyear;
	private String state;
	void inti(String n,int sal,String mar,int birth,String state)
	{
		name=n;
		salary=sal;
		martialstatus=mar;
		birthyear=birth;
		this.state=state;

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
class Privatemethod2
{
	public static void main(String arg[])
	{
		Employee e=new Employee();
		e.inti("muna",400000,"married",1997,"Odisha");
		e.disp();
		Employee e1=new Employee();
		e1.inti("sam",500000,"unmarried",2003,"Rajasthan");
		e1.disp();
		
		
	}
}