abstract class Top
{
	abstract void show();
}
class Bot extends Top 
{
	void show()
	{
		System.out.println("Show method");
	}
}
class Ab2
{
	public static void main(String arg[])
	{
		Top a=new Bot();
		a.show();
	}
}