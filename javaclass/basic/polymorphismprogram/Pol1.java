class Arith
{
	void add()
	{
	  int a=2,b=3,s;
	  s=a+b;
	  System.out.println("sum1="+s);
	}
	void add(int x,int y)// 2 argument
	{
	  System.out.println("sum2="+(x+y));
	}
	int add(int p,int q,int r) // 3 argment
	{
	  return p+q+r;
	}
	void add(double x,double y) //type
	{
	  System.out.println("sum3="+(x+y));
	}
	void add(double x,int y) //order
	{
	  System.out.println("sum4="+(x+y));
	}
	void add(int x,double y)//order
	{
	  System.out.println("sum5="+(x+y));
	}

}
class Pol1
{
	public static void main(String arg[])
	{
	   Arith ar=new Arith();
	   ar.add(10,20);
	   ar.add(2.5,3);
	   ar.add();
	}
}