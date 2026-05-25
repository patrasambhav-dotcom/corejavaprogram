class A
{
	void showA()
	{
		System.out.println("A class");
	}
}
class B extends A 
{
	void showB()
	{
		System.out.println("B class");
	}
}
class Singlein
{
	public static void main(String arg[])
	{
		A a=new A();
		a.showA();
		B b=new B();
		b.showA();
		b.showB();
	}
}