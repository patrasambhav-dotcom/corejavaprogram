class Square
{
	private double length;
	Square(double l)
	{
		length=l;
	}
	void dis()
	{
		System.out.println("length of Square = "+length);
	}
	void area()
	{
		System.out.println("area of sqaure = "+length*length);
	}
	void perimeter()
	{
		System.out.println("perimeter of square = "+4*length);
	}
}
class Privatesquare
{
	public static void main(String arg[])
	{
		Square s=new Square(4.0);
		s.dis();
		s.area();
		s.perimeter();
		Square s1=new Square(5.0);
		s1.dis();
		s1.area();
		s1.perimeter();

	}
}