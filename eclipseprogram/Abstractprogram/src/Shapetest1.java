abstract class Shape1 
{
	String name;
	Shape1(String name)
	{
		this.name=name;
		
	}
	abstract double area();
	
}
class Circle1 extends Shape1
{
	double radius;
	Circle1(String name,double radius )
	{
		super(name);
		this.radius=radius;
	}
	double area()
	{
		return Math.PI*radius*radius;
	}
}
class Rectangle1 extends Shape1
{
	double length,breadth;
	Rectangle1(String name,double length,double breadth )
	{
		super(name);
		this.length=length;
		this.breadth=breadth;
	}
	double area()
	{
		return length*breadth;	
	}	
}
class Triangle1 extends Shape1
{
	double base,height ;
	public Triangle1(String name, double base, double height) 
	{
		super(name);
		this.base = base;
		this.height = height;
	}
	double area()
	{
		return 0.5 * base *height;
	}

}
public class Shapetest1 
{
	static void show(Shape1 s)
	{
		System.out.println(s.name+" area :"+s.area());
		
	}
	

	public static void main(String[] args) 
	{
		Shape1 ob=new Circle1("Circle",4.0);
		Shape1 ob1=new Rectangle1("Rectangle",4.0,5.0);
		Shape1 obj=new Triangle1("Triangle",5.0,6.0);
		show(ob);
		show(ob1);
		show(obj);
		
		// TODO Auto-generated method stub

	}

}
