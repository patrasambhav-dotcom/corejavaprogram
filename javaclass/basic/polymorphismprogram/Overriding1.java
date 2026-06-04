class Parent
{
	void property()
	{
		System.out.println("land + money");
	}
	void marry()
	{
		System.out.println("gita");
	}
}
class Child extends Parent
{
	void marry()
	{
		System.out.println("Rita");
	}

}
class Overriding1
{
	public static void main(String arg[])
	{
		Child ch=new Child();
		ch.marry();
		ch.property();
	}

}