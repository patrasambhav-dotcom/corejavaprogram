package inheri1;
class Sam
{
	void show()
	{
		System.out.println("AC");
	}
}
class Tam extends Sam
{
	
}

public class Cons1 
{
	public static void main(String arg[])
	{
		Tam ob=new Tam();
		ob.show();
	}

}
