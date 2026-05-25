class Airth
{
	void show(int...x)
	{
		System.out.println("Variable arument method");
	}
}
class Vararg
{
	public static void main(String arg[])
	{
		Airth ar=new Airth();
		ar.show(10,20);
		ar.show(1,2,3,4);
		ar.show(1);
	}
}
