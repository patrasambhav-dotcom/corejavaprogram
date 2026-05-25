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
class C extends B 
{
	void showC()
		{
			System.out.println("C class");

		}
}
class Multilevel
{
	public static void main(String arg[])
	{
		
		C c=new C();
		c.showA();
		c.showB();
		c.showC();
	}
}