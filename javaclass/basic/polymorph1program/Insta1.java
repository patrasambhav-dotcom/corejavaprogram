class A
{

}
class B extends A
{

}
class C extends B
{

}
class Insta1
{
	public static void main(String arg[])
	{
		A ob=new B();
		System.out.println(ob instanceof A);
		System.out.println(ob instanceof B);
		System.out.println(ob instanceof Object);
		System.out.println(ob instanceof C);
	}
}