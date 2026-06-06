package inheri1;
class A 
{
	void show() 
	{
		System.out.println("Bye");		
	}
	
	
}
class B extends A 
{
	void disp()
	{
		System.out.println("Hi");	
	}
	
}

public class inheri1 
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.disp();
		ob.show();
	}

}
