import java.util.*;
class Salary2
{
	public static void main(String arg[])
	
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		double sal=sc.nextInt(),da=0,hra=0,bas=0,con=0,fix=0,pf=0;
		if(sal>=5000)
			
		{
			bas=0.4*sal;
            con=0.1*sal;
	        da=0.1*sal;
	        hra=0.5*bas;
			fix=0.1*sal;
			pf=0.1*sal;
		}
		System.out.println("basic sal="   +bas);
		System.out.println("conveyence ="  +con);
		System.out.println("daily allowence =" +da);
		System.out.println("house rent allowence =" +hra);
		System.out.println("fixed allowence =" +fix);
		System.out.println("provident fund deducted from salary =" +pf);
            


			System.out.println(" total in hand salary "+(bas+con+da+hra+fix) );
	}

}