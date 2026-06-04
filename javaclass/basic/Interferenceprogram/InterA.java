interface A
{
	void show();
	int x=10;
}
class B implements A 

{
	public void show()
	{
		System.out.println("Show method");
	}
}
class InterA
{
	public static void main(String arg[])
	{
		A ob=new B();
		ob.show();
		System.out.println(A.x);
		System.out.println(B.x);

	}
	
}