import java.util.Scanner;
class Celtofare
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value in celsius");
		double c=sc.nextDouble();
		double f=(c*9/5) +32;
		System.out.println("value in fare = "+f);

	}
}