class Arith
{
	static void add()
	{
		int a=2,b=5,s;
		s=a+b;
		System.out.println("Sum1 ="+s);
	}
	final void add(int x,int y)
	{
		System.out.println("Sum2 ="+(x+y));
	}
	synchronized void add(int p ,int q,int r)
	{
		System.out.println("Sum 6"+(p+q+r) );
	}
	private void add(double x,double y)
	{
		System.out.println("Sum3 ="+(x+y));
	}
	public void add(double x,int y)
	{
		System.out.println("Sum4 ="+(x+y));
	}
	void add(int x,double y)
	{
		System.out.println("Sum5 ="+(x+y));
	}
}
class Pol2
{
	public static void main(String arg[])
	{
		Arith ah=new Arith();
		ah.add(9,10);
		ah.add();
		ah.add(9.1,10.1);
		ah.add(9.01,10);
		ah.add(9,10.01);

	}
}