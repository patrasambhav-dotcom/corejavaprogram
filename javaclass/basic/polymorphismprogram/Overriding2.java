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
class Overriding2
{
	public static void main(String arg[])
	{
		Parent ch=new Parent();
		ch.marry();
		ch.property();
		Parent p=new Child();
		p.marry();
		p.property();
	}

}