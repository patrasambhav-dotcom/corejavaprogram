class Parent
{
	void property()
	{
		System.out.println("land + money");
	}
	protected void marry()
	{
		System.out.println("gita");
	}
}
class Child extends Parent
{
	public void marry()
	{
		System.out.println("Rita");
	}

}
class AccessModi1
{
	public static void main(String arg[])
	{
		Parent ch=new Child();
		ch.marry();
		
	}

}