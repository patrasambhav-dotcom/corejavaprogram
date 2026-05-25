class X
{
	static int a;
	X()
	{
		++a;
	}
	
}
class Noofobjects
{
	public static void main(String arg[])
	{
		X ob=new X();
		X ob1=new X();
		X ob2=new X();

		System.out.println("no of objects :"+X.a);

	}
}