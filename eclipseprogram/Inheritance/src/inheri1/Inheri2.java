package inheri1;
class Top 
{
	void show()
	{
		System.out.println("Class A");
	}
}
class Bot extends Top 
{
	void disp()
	{
		System.out.println("Class B");
	}
}
class C extends Bot 
{
	void meh()
	{
		System.out.println("Class C");
	}
}

public class Inheri2 
{
	public static void main(String arg[])
	{
		C ob=new C();
		ob.meh();
		ob.show();
		ob.disp();
	}

}
