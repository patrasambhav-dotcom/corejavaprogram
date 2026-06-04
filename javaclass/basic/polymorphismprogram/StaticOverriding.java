class Parent
{
	void property()
	{
		System.out.println("land + money");
	}
	static void marry()
	{
		System.out.println("gita");
	}
}
class Child extends Parent
{
	static void marry()
	{
		System.out.println("Rita");
	}

}
class StaticOverriding
{
	public static void main(String arg[])
	{
		Parent ch=new Child();
		ch.marry();
		
	}

}