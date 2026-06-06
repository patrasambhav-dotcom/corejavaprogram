
abstract class Shape
{
	abstract double area();
	
	void display()
	{
		System.out.println("This is a shape. ");
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
		return Math.PI*radius*radius;
	}
}
 class Rectangle extends Shape 
 {
 	double length,breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	double area()
	{
		return length*breadth;
	}
 	
 }
 class Triangle extends Shape
 {
	 double base,height;

	 public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	 }
	 double area()
	 {
		 return 0.5*base*height;
	 }
	 
 }
public class Abs1 
{

	public static void main(String[] args)
	{
		Shape ob=new Circle(4.0);
		Shape obj=new Rectangle(4.0,5.0);
		Shape ob1=new Triangle(5.0,4.0);
		ob.display();
		System.out.println("Circle area "+ob.area());
		obj.display();
		System.out.println("Rectangle area "+obj.area());
		ob1.display();
		System.out.println("Triangle area "+ob1.area());
		
		
		// TODO Auto-generated method stub

	}

}
