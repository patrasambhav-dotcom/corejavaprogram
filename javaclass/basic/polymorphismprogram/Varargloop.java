class Airth
{
	void show(int...x)
	{
		int i;
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+"\t");
		}
		System.out.println();
	}
}
class Varargloop
{
	public static void main(String arg[])
	{
		Airth ar=new Airth();
		ar.show(10,20);
		ar.show(1,2,3,4);
		ar.show(1);
		ar.show(1,10);
		int arr[]={1,2,3,4,5};
		ar.show(arr);
		 
	}
}
