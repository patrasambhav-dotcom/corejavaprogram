class A
{
	private A()
	{
		System.out.println("Private constructor");
	}
	static void show()
	{
		A ob=new A();
	}
}
class Testprivateconst
{
	public static void main(String arg[])
	{
		A.show();
	}
}