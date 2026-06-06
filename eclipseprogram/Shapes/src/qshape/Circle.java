package qshape;

public  class Circle extends ShapeM {
    double radius;

   public Circle(String name, double radius) {
       super(name);
       this.radius = radius;
   }

   @Override
   public double area() {
       return Math.PI * radius * radius;
   }
}