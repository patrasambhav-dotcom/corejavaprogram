class A
{

}
class B 
{
	
}
class C 
{

}
class Upcasting1
{
	public static void main(String arg[])
	{
		Object ob=new B();
		Object obj=new A();
		A obj1=new A();
		System.out.println(obj1 instanceof A);
		//System.out.println(obj1 instanceof B); error
		
}
}