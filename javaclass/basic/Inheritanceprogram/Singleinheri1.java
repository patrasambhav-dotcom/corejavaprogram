

	class A
	{
		int x;
		A()
		{
			 x=10;
		}
		void disp()
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
		void look()
		{
			System.out.println("Y value = "+y);
		}
	}

class Singleinheri1
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.disp();
		ob.look();
	}
}