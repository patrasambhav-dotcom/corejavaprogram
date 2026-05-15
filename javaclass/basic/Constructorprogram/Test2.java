class A
{
	void show()
	{
		System.out.println("show nostatic method");
		disp();
		A obj=new A();
		obj.disp();
	}
	void disp()
	{
		System.out.println("display nostatic method");
	}
}
class Test2
{
	public static void main(String arg[])
	{
		A t1=new A();
		t1.show();
	}
}