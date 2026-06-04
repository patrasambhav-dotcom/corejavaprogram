class Airth
{
	void show(Object...x)
	{
		int i;
		for(i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println();
	}
}
class VarargObject
{
	public static void main(String arg[])
	{
		Airth ar=new Airth();
		ar.show("hi",5,"bye",10,true);
	}
}