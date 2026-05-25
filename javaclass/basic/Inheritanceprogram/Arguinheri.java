class A
{
	A(int x)
	{
		System.out.println("parameter constructor ="+x);
	}
}
class B extends A
{
	 B()
	{
		super(10);
		System.out.println("BC");
	}	
}
class Arguinheri
{
	public static void main(String arg[])
	{
		B ob=new B();
		
	}
}