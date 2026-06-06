package pk1;

public class MyArith {
	int no1,no2;
	public MyArith(int no1,int no2)
	{
		this.no1=no1;
		this.no2=no2;
	}
	public void add()
	{
		System.out.println("sum="+(no1+no2));
	}
	static public void show()
	{
		System.out.println("show method ");
	}
}
