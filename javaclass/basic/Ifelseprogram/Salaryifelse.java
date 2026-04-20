import java.util.*;
class Salaryifelse
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		double sal=sc.nextDouble(),da=0,hra=0;
		if(sal>=5000)
		{
          da=0.3*sal;
          hra=0.2*sal;
		}
		else 
		{
			da=0.2*sal;
			hra=0.1*sal;
		}
		System.out.println("your basic salary should be 5000");
		System.out.println("total salary =  " +(sal+da+hra));
	}
}