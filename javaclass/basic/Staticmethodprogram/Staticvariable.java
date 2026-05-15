class X
{
	static int a;
}
class Staticvariable
{
	public static void main(String arg[])
	{
		X ob=new X();
		X obj=new X();
		ob.a=10;
		obj.a=30;
		obj.a=ob.a+obj.a;
		System.out.println(ob.a+" "+obj.a+" "+X.a);
	}
}