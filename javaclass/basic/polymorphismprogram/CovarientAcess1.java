class Parent 
{
	Object marry()
	{
		System.out.println("Gita");
		return null;
	}
}
class Child extends Parent 
{
	String marry()
	{
		System.out.println("Rita");
		return null;
	}
}
class CovarientAcess1
{
	public static void main(String arg[])
	{
		Parent p=new Child();
		p.marry();
	}
}