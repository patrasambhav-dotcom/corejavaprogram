class A
{

}
class B extends A 
{

}
class Parent 
{
	A marry()
	{
		System.out.println("Gita");
		return null;
	}
}
class Child extends Parent 
{
	B marry()
	{
		System.out.println("Rita");
		return null;
	}
}
class CovarientAcess
{
	public static void main(String arg[])
	{
		Parent p=new Child();
		p.marry();
	}
}