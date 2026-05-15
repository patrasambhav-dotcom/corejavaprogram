class A
{
	 static void disp()
	{
		System.out.println("Display static method");
	}
}
class Test4
{
	void show()
	{
		A.disp();
		A ob=new A();
		ob.disp();
	}
	public static void main(String arg[])
	{
		Test4 t1=new Test4();
		t1.show();
	}

}