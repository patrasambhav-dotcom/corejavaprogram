class StudentOver
{
	int id;
	String name;
	int age;
	StudentOver(int i,String n)
	{
		id=i;
		name=n;
	}
	StudentOver(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void disp()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String arg[])
	{
		StudentOver s=new StudentOver(1,"Sam",19);
		StudentOver s1=new StudentOver(2,"Ram");
		s.disp();
		s1.disp(); 
	}
}