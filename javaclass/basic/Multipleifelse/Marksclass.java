import java.util.*;
class Marksclass
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of each subject");
		System.out.println(" physics");
		double ph=sc.nextDouble();
		System.out.println("chemistry");
		double ce=sc.nextDouble();
		System.out.println("maths");
		double ma=sc.nextDouble();
		System.out.println("english");
		double eg=sc.nextDouble();
		System.out.println("computer");
		double co=sc.nextDouble();
		double t=ph+ce+ma+eg+co;
		double av=(ph+ce+ma+eg+co)*0.2;
		System.out.println("total marks =  "+t);
		System.out.println("average marks =   "+av);
		if(ph<30 || ce<30 || ma<30 || eg<30  || co<30)
		{
			System.out.println("Failed and have to take retest with subjects less than 30");
		}	
		else if(av>=90)
		{
			System.out.println(" GRADE S");
		}
		else if(av>=70  &&  av<90)
		{
			System.out.println(" GRADE A");
		}
		else if(av>=50  &&  av<70)
		{
			System.out.println(" GRADE B");
		}
		else if(av>=30  &&  av<50)
		{
			System.out.println("GRADE C");
		}
		
		

				
		
	}
}