class A
{
	static A ob;

	private A()
	{

	}
	static A create()
	{
		if(ob==null)
		{
			ob=new A();
		}
		return ob;
	}
	void show()
	{
		System.out.println("Show method");
	}
}
class Testsingleton
{

	public static void main(String arg[])
	{
		A obj=A.create();
		A obj1=A.create();
		System.out.println(obj==obj1);
		obj.show();

	}
}