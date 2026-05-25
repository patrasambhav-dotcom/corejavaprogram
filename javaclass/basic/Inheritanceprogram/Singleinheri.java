

	class A
	{
		int x;
		void setA()
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
		void setB()
		{
			 y=20;
		}
		void look()
		{
			System.out.println("Y value = "+y);
		}
	}

class Singleinheri
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.setA();
		ob.setB();
		ob.disp();
		ob.look();
	}
}