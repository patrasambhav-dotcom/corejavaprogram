import java.util.*;
abstract class Shape 
{
	String name;
	Shape(String S)
	{
		this.name=S;
	}
	abstract double area();
}
class Circle extends Shape
{
	double radius;
	
	Circle(String S,double radius)
	{
		super(S);
		this.radius=radius;
	}
	double area()
	{
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape
{
	double length,breadth;
	
	Rectangle(String S,double length,double breadth)
	{
		super(S);
		this.length=length;
		this.breadth=breadth;
	}
	double area()
	{
		return length*breadth;
	}
}
class Triangle extends Shape
{
	double base,height;
	
	Triangle(String S,double base,double height)
	{
		super(S);
		this.base=base;
		this.height=height;
	}
	double area()
	{
		return 0.5*base*height;
	}
}
class Shapreteststring
{
	static void show(Shape s)
	{
		System.out.println(s.name+" area = "+s.area());
	}

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		double r,l,b,q,h;
		System.out.println("enter radius of circle");
		r=sc.nextDouble();
		System.out.println("enter length and breadth of recatngle");
		l=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("enter base and height of triagle");
		q=sc.nextDouble();
		h=sc.nextDouble();
		Circle cr=new Circle("Circle",r);
		Rectangle re=new Rectangle("Rectangle",l,b);
		Triangle tri=new Triangle("Triangle",q,h);
		show(cr);
		show(re);
		show(tri);



	}
}