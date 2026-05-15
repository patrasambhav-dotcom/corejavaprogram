class A
{
	private static int data;
	static void show()
	{
		data=10;
		System.out.println(data);
	}

}
class Testprivatestatic
{
	public static void main(String arg[])
	{
		A.show();
	}
	
}