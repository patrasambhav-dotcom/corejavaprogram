class Employee
{
	static String company="ABC Ltd";
	String name;
	Employee(String name)
	{
		this.name=name;
	}
	void show()
	{
		System.out.println(name +" works at "+ company);
	}
	static void companychange(String c)
	{
		company =c;
	}

}
class Bothsaticandnon
{
	public static void main(String arg[])
	{
		Employee e1=new Employee("Riya");
		Employee e2=new Employee("Rahul");
		e1.show();
		e2.show();
		Employee.companychange("XYZ Ltd");
		e1.show();
		e2.show();
	}
}