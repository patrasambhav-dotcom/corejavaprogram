package constructor;

public class Employee 
{
	String name;
	int salary;
	String state;
	int birthyear;
	public Employee(String name,int salary,String state,int birthyear)
	{
		this(name,salary,state);
		this.birthyear=birthyear;
	}
	public Employee(String name,int salary,String state)
	{
		this(name,salary);
		this.state=state;
	}
	public Employee(String name,int salary)
	{
		this(name);
		this.salary=salary;
	}
	public Employee(String name)
	{
		this.name=name;
	}
	void show()
	{
		System.out.println(name+" "+salary+" "+state+" "+birthyear);
	}
	public static void main(String arg[])
	{
		Employee e=new Employee("Sam",400000,"Odisha",2007);
		e.show();
	}

}
