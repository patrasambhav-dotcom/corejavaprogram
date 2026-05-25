class Airth
{
	void show(int...x)
	{
		System.out.println("Variable arument method");
	}
	void show(int x)
	{
		System.out.println("Normal");
	}
}
class Vararg1
{
	public static void main(String arg[])
	{
		Airth ar=new Airth();
		ar.show(10,20);
		ar.show(1,2,3,4);
		ar.show(1);
		int arr[]={1,2,3,4,5};
		ar.show(arr); 
	}
}
