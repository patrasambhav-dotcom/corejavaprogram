class Husband
{
	void marry()throws Exception
	{
		System.out.println("rita");
	}
}
class Wife extends Husband
{
	void marry()throws ArithmeticException
	{
		System.out.println("Gita");
	}
}
class AriExcep
{
	public static void main(String arg[])throws Exception
	{
		Husband hu=new Wife();
		hu.marry();

	}
}