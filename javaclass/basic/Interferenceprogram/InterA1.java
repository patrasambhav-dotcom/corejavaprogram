interface A
{
	void show();
	int x=10;
}
interface B 

{
	 void show();
	int x=20;
}
class C implements A,B 
{
	public void show()
	{
		System.out.println("Show method");
		System.out.println(A.x);
		System.out.println(B.x);
	}
}
class InterA1
{
	public static void main(String arg[])
	{
		A ob=new C();
		ob.show();
		

	}
	
}