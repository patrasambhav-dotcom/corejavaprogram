class Demo
{
	static int staticvar=20;
	int instavari=30;
	Demo()
	{
		int constrvar=10;
		System.out.println("Constructor vari:"+constrvar);
	}
	void show(int paravar)
	{
		int localvar=40;
		System.out.println("Static variable : "+staticvar);
		System.out.println("Instance variable : "+instavari);
		System.out.println("Local variable : "+localvar);
		System.out.println("Parameter variable : "+paravar);
		

	}

}
class Allrounder
{
	public static void main(String arg[])
	{
		Demo ob=new Demo();
		ob.show(50);
	}
}