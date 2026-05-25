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
class Privatevariable1
{
	public static void main (String arg[])
	{
		X ob=new X();
		ob.show();
		X ob1=new X();
		ob1.show();
		X ob2=new X();
		ob2.show();
		
	}
}