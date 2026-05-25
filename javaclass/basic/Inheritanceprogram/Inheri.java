class A
{
	int x=10;
}
class B extends A 
{
	int x=20;
}
class Inheri
{
	public static void main (String arg[])
	{
		B ob=new B();
		System.out.println(ob.x);
	}
}