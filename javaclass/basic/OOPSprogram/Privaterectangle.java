class Rectangle
{
	private double length;
	private double breadth;
	Rectangle(double l,double b)
	{
		length=l;
		breadth=b;
	}
	void dis()
	{
		System.out.println("length of Rectangle = "+length);
		System.out.println("breadth of Rectangle = "+breadth);
	}
	void area()
	{
		System.out.println("area of Rectangle = "+length*breadth);
	}
	void perimeter()
	{
		System.out.println("perimeter of Rectangle = "+2*(length+breadth));
	}
}
class Privaterectangle
{
	public static void main(String arg[])
	{
		Rectangle r=new Rectangle(2.0,3.0);
		r.dis();
		r.area();
		r.perimeter();
		Rectangle r1=new Rectangle(4.0,5.0);
		r1.dis();
		r1.area();
		r1.perimeter();


	}
}