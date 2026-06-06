package inheri1;
class Ayush 
{
	int x;
	Ayush()
	{
		x=10;
	}
	Ayush(int x)
	{
		this.x=x;
	}
	void disp()
	{
		System.out.println("Value of x = "+x);
	}
}
class Bheem extends Ayush 
{
	int y;
	Bheem()
	{
		y=20;
	}
	Bheem(int x,int y)
	{
		super(x);
		this.y=y;
		
	}
	void look()
	{
		System.out.println("Value of y = "+y);
	}
}

public class Cons2 
{

	public static void main(String[] args) 
	{
		Bheem ob=new Bheem();
		Bheem obj=new Bheem(30,40);
		ob.disp();
		ob.look();
		obj.disp();
		obj.look();
		// TODO Auto-generated method stub

	}

}
