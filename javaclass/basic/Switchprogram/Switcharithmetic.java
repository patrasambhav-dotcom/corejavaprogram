import java.util.*;
class Switcharithmetic
{
	public static void main( String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter first number");
		double no1=sc.nextDouble();
		System.out.println(" enter second number");
		double no2=sc.nextDouble();
		System.out.println(" enter choice \1 1.add \2 2.subtract \3 3.muti");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println(" add =  " +(no1+no2) );break;
		case 2:System.out.println(" sub =  "+(no1-no2));break;
		case 3:System.out.println(" muti = " +(no1*no2));break;
		default :System.out.println(" invalid");
		}
	}
}