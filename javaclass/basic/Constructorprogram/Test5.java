class A 
{
	void disp()
	{
		System.out.println("Display non static method");
	}
}
class Test5
{
	void show()
	{
		
		A obj=new A();
		obj.disp();
	}
	public static void main(String arg[])
	{
		Test5 t1=new Test5();
		t1.show();
	}
} 