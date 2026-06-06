class Rectangle
{
	private int L,B;
	
	public int getL() {
		return L;
	}
	public void setL(int l) {
		L = l;
	}
	public int getB() {
		return B;
	}
	public void setB(int b) {
		B = b;
	}
	public static int getX() {
		return x;
	}
	public static void setX(int x) {
		Rectangle.x = x;
	}
	static int x;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int l, int b) {
		super();
		L = l;
		B = b;
	}
	static void look()
	{
		System.out.println("hi");
	}
	int area()
	{
		return L*B;
	}
}
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(5, 7);
		Rectangle.look();
	   //System.out.println(r.L); error
		System.out.println(r.getL());
	}

}
