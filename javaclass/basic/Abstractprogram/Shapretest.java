abstract class Shape
{
	abstract double area();
	void disp()
	{
		System.out.println("This is a shape");
	}	
}
class Circle extends Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	double area()
	{
		return Math.PI*radius *radius;
	}
}
class Square extends Shape
{
	double length;
	Square(double length)
	{
		this.length=length;
	}
	double area()
	{
		return length * length;
	}
}
class Rectangle extends Shape
{
	double length,breadth;
	Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	double area()
	{
		return length * breadth;
	}
}
class Shapretest
{
	public static void main(String arg[])
	{
		Shape c=new Circle(4.0);
		Shape l=new Square(4.0);
		Shape r=new Rectangle(4.0,5.0);
		System.out.println("Circle area:"+c.area());
		System.out.println("Square area:"+l.area());
		System.out.println("Rectangle area:"+r.area());
	}
}
