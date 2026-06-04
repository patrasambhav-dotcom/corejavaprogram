interface A
{
	void show();
}
interface B
{
	void look();
}
class  C 
{
	void disp()
	{
		System.out.println("display method");
	}
}
class D extends C implements A,B
{
	public void show()
	{
		System.out.println("Show method");
	}
	public void look()
	{
		System.out.println("Look method");
	}
	
}
class Multiint1
{
	public static void main(String arg[])
	{
		D ob=new D();
		ob.show();
		ob.look();
		ob.disp();
	}
}