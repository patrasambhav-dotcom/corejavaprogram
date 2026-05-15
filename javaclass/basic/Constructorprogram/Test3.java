class A
{
	void show()
	{
		System.out.println("show nostatic method");
		disp();
		A obj=new A();
		obj.disp();
		A.disp();
	}
	 static void disp()
	{
		System.out.println("display nostatic method");
	}
}
class Test3
{
	public static void main(String arg[])
	{
		A t1=new A();
		t1.show();
	}
}