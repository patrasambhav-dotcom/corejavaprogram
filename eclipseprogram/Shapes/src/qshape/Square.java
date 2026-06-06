package qshape;

public  class Square extends ShapeM {
    double length;

    public Square (String name, double length) {
        super(name);
        this.length = length;
    }

    @Override
    public double area() {
        return length * length;
    }
}
