class A
{
	static int data;
	static void show()
	{
		data=10;
		System.out.println(data);
	}
}
class Teststaticdata
{
	public static void main(String arg[])
	{
		System.out.println(A.data);
		A.show();
		System.out.println(A.data);
	}
}