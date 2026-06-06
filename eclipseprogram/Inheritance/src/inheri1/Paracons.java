package inheri1;
import java.util.*;
class Dam 
{
	Dam(int x)
	{
		System.out.println("parameter constructor "+x);
		
	}
}
class Mam extends Dam
{
	Mam(int x,int y)
	{
		super(x);
		System.out.println("constructor "+y);
	}
	
}

public class Paracons 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("enter two integer");
		 x=sc.nextInt();
		 y=sc.nextInt();
		 Mam ob=new Mam(x, y);
		 
		 
		
		
		// TODO Auto-generated method stub

	}

}
