class A 
{
	void show()
	{
		System.out.println("hi");

	}

}
class B extends A 
{
	void disp()
	{
		System.out.println("bye");
	}
}
class Aysuh
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.show();
		ob.disp();
	}
}