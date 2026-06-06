package shapetest;


import java.util.*;
import qshape.Circle;
import qshape.Square;
import qshape.ShapeM;

public class Ashapes 
{
    public static void main(String[] args) 
    {
    	   Scanner sc=new Scanner(System.in);
    	   double r,l;
    	   System.out.println("enter radius of circle ");
    	   r=sc.nextDouble();
    	   System.out.println("enter length of sqaure");
    	   l=sc.nextDouble();
    	

        ShapeM s1 = new Circle("Circle",r);
        ShapeM s2 = new Square("Square",l);

        System.out.println("Area = " + s1.area());
        System.out.println("Area = " + s2.area());
    }
}
