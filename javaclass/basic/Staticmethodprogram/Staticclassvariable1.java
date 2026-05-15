class X
{
	 static int a;
}
class Staticclassvariable1
{
	public static void main(String arg[])
	{
		System.out.println(X.a);
		X ob=new X();
		System.out.println(ob.a);
		ob.a=10;
		System.out.println(X.a);
		System.out.println(ob.a);
	}

}