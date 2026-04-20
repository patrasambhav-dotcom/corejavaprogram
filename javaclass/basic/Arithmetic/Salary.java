import java.util.*;
class Salary
{
	public static void main(String arg[])
	
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		double sal=sc.nextInt(),da=0,hra=0;
		if(sal>=5000)
			
		{

	        da=0.2*sal;
	        hra=0.3*sal;
			
		}
		 double total=sal+da+hra;
		System.out.println("basic salary = 5000");
		System.out.println("da =" +da);
			System.out.println("hra =" +hra);
			System.out.println(" total value equal to "  +total );
	}

}