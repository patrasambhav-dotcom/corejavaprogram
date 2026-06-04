interface A
{
	void show();
}
interface B
{
	void look();
}
interface C extends A,B 
{
	void disp();
}
class D implements C 
{
	public void show()
	{
		System.out.println("Show method");
	}
	public void look()
	{
		System.out.println("Look method");
	}
	public void disp()
	{
		System.out.println("Display method");
	}
}
class Multiint
{
	public static void main(String arg[])
	{
		C ob=new D();
		ob.show();
		ob.look();
		ob.disp();
	}
}