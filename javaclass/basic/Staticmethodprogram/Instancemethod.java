class A
{
	private int x;
	A()
	{
		x=10;
	}
	int getX()
	{
		return x;
	}
}
class Instancemethod
{
	public static void main(String arg[])
	{
		A ob=new A();
		System.out.println(ob.getX());
	}
}