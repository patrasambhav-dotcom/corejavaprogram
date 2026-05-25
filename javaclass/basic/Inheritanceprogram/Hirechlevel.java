class X
{
	class A
	{
		void showA()
		{
			System.out.println("Class A");
		}
		
	}
	class B extends A
	{
		void showB()
		{
			System.out.println("Class B");
		}
	}
	class C extends A
	{
		void showC()
		{
			System.out.println("Class C");
		}
	}
}
class Hirechlevel
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.showB();
		ob.showA();
		C ob1=new C();
		ob1.showC();
		ob1.showA();

	}
}