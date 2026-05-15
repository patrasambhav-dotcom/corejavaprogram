class Circle
{
	double radius;

	Circle(double r)
	{
		radius=r;
	}
	double Area()
	{
		return 3.14*radius*radius;
	}
}
class Objectspecific
{
	public static void main(String arg[])
	{
		Circle c1=new Circle(4);
		Circle c2=new Circle(5);
		System.out.println(c1.Area());
		System.out.println(c2.Area());
	}
}