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

}
class Overriding
{
	public static void main(String arg[])
	{
		Child ch=new Child();
		ch.marry();
		ch.property();
	}

}