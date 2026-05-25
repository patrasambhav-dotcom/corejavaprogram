class X
{
	private static int a;
	X()
	{
		++a;
	}
	void show()
	{
		System.out.println("no of objects :"+a);
	}
	
}
class Noofobjects1
{
	public static void main(String arg[])
	{
		X ob=new X();
		ob.show();
		X ob1=new X();
		ob1.show();
		X ob2=new X();
		
		
		ob2.show();

	}
}