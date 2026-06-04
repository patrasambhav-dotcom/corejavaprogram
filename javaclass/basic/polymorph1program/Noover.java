class Grand
{
	void marry()
	{
		System.out.println("Rita");
	}
}
class Semi extends Grand
{
	final  void marry()
	{
		System.out.println("Gita");
	}
}
class Noover
{
	public static void main (String arg[])
	{
		Grand g=new Semi();
		g.marry();
	}
}