class Parent
{
	void property()
	{
		System.out.println("land + money");
	}
	int marry()
	{
		System.out.println("gita");
		return 0;
	}
}
class Child extends Parent
{
	int marry()
	{
		System.out.println("Rita");
		return 0;
	}

}
class AccessModiint
{
	public static void main(String[] args)
	{
		Parent ch=new Child();
		ch.marry();
		
	}

}