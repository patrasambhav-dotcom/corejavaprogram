import java.util.Scanner;
class Eighteen
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter reactangle length and breadth");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double p=2*(l+b);
		double a=(l*b);
		System.out.println("lenght of rectangle = "+l);
		System.out.println("breadth of reatangle = "+b);
		System.out.println("area = "+a);
		System.out.println("perimeter = "+p);

	}
}