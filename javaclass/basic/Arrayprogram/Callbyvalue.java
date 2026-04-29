class Callbyvalue
{
	static void show(int a)
	{
	   a=20;
	}

	public static void main(String arg[])
	{
	    int a=10;
	    show(a);
	    System.out.println(a);
        
	}
}