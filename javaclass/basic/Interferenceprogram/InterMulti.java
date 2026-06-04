interface Top
{
	void show();
}
interface Bot
{
	void disp();
}
class Cop implements Top,Bot 
{
	public void show()
	{
		System.out.println("Show method");
	}
	public void disp()
	{
		System.out.println("display method");
	}
}
class InterMulti
{
	public static void main(String arg[])
	{
		Top ob=new Cop();
		ob.show();
		Bot obj=new Cop();
		obj.disp();
		Cop obj1=new Cop();
		obj1.show();
		obj1.disp();
	}
}