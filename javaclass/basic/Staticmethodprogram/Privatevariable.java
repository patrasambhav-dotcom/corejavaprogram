class X
{
	private static int a;
	private int b;
	X()
	{
		++a;
		++b;
	}
	void show()
	{
		System.out.println(a+" "+b);
	}
}
class Privatevariable
{
	public static void main (String arg[])
	{
		X ob=new X();
		X ob1=new X();
		X ob2=new X();
		ob.show();
		ob1.show();
		ob2.show();
	}
}