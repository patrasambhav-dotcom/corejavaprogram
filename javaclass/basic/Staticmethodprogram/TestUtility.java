class Mymath
{
	static int c=0;
	static void add(int a,int b)
	{
		System.out.println("sum ="+(a+b));
	}
	static int multi(int a,int b)
	{
		return a*b;
	}
}
class TestUtility
{
	public static void main(String arg[])
	{
		Mymath.add(10,20);
		System.out.println(Mymath.multi(5,6));
		System.out.println(Mymath.c);
		System.out.println(Math.pow(2,3));


	}
}