class A
{
	int x=10;
}
class B extends A 
{
	int x=20;
	void show()
    {
    	int x=30;
    	System.out.println(x);
    	System.out.println(this.x);
    	System.out.println(super.x);
    }
}

class Inheri3
{
	public static void main (String arg[])
	{
		B ob=new B();
		ob.show();
	}
}