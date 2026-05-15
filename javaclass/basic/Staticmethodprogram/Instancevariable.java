class X
{
	int a;
}
class Instancevariable
{
	public static void main(String arg[])
	{
		X ob=new X();
		System.out.println(ob.a);
		X obj=new X();
		System.out.println(obj.a);
		ob.a=10;
		obj.a=20;
		System.out.println(ob.a+" "+obj.a);
	}
}