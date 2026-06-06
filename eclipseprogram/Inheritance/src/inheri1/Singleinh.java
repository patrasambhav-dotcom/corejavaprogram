package inheri1;
class Mhe 
{
	int x;
	void showA()
	{
		x=10;
	}
	void disp()
	{
		System.out.println("x value = "+x);
	}
}
class Shame extends Mhe
{
	int y;
	void showB()
	{
		y=20;
	}
	void look()
	{
		System.out.println("y value ="+y);
	}
}

public class Singleinh 
{
	public static void main(String arg[])
	{
	    Shame ob=new Shame();
		ob.showA();
		ob.showB();
		ob.disp();
		ob.look();
		
	}

}
