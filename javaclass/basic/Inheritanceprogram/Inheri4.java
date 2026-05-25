class A
{
	void show()
	{
		System.out.println("show A");
	}
}
class B extends A 
{
	void show()
	{
		System.out.println("show B");
		super.show();
	}
}
class Inheri4
{
	public static void main (String arg[])
	{
		B ob=new B();
		ob.show();
	}
}