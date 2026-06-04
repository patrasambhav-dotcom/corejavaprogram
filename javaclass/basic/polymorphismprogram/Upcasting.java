class A
{
	int x;
	A(int x)
	{
		this.x=x;
	}
	void show()
	{
		System.out.println(x);
	}
}
class B extends A
{
	int y;
	B(int x,int y)
	{
		super(x);
		System.out.println(y);
		this.y=y;
	}
	void disp()
	{
		System.out.println("in disp"+x);
		System.out.println("i disp"+y);
	}
}
class Upcasting
{
	public static void main(String arg[])
	{
		A ob=new B(10,20);
		ob.show();
		B obj=(B)ob;
		obj.disp();

	}
}