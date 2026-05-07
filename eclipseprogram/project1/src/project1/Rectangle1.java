package project1;
import java.util.*;
public class Rectangle1
{
	private double length;
	private double breadth;

	public Rectangle1() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of rectangle");
		length=sc.nextDouble();
		System.out.println("enter breadth of rectangle");
		breadth =sc.nextDouble();
		
	}
	void area()
	{
		System.out.println("area of rectangle = "+length*breadth);
	}
	void peri()
	{
		System.out.println("perimeter of rectangle = "+2*(length+breadth));
	}
	

	public static void main(String[] args) 
	{
		Rectangle1 r=new Rectangle1();
		r.area();
		r.peri();
		

	}

}
