class A
{
	int x=10;
}
class B extends A 
{
	int x=20;
	void show()
    {
    	System.out.println(x);
    }
}

class Inheri1
{
	public static void main (String arg[])
	{
		B ob=new B();
		ob.show();
	}
}