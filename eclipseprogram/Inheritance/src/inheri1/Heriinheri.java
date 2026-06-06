package inheri1;
class King 
{
	void show()
	{
		System.out.println("King");
	}
}
class Queen extends King 
{
	void side()
	{
		System.out.println("Queen");
	}
}
class Pawn extends King 
{
	void disp()
	{
		System.out.println("Pawn");
	}
}

public class Heriinheri 
{
	public static void main(String arg[])
	{
		Pawn ob=new Pawn();
		ob.disp();
		ob.show();
		Queen ob1=new Queen();
		ob1.side();
		ob1.show();
		
		
	}

}
