class A
{
	int x;
	A()
	{
		x=10;
	}
	A(int x)
	{
		this.x=x;
	}
	void show()
	{
		System.out.println("X value = "+x);
		
	}
}
class B extends A
{
	int y;
	B()
	{
		y=20;
	}
	B(int x ,int y)
	{
		super(x) ;
		this.y=y;
	}
	void disp()
	{
		System.out.println("Y value = "+y);
	}
}
class Arguinheri3
{
	public static  void main(String arg[])
	{
		B ob=new B();
		B ob1=new B(30,40);
		ob.show();
		ob.disp();
		ob1.show();
		ob1.disp();
	}
}