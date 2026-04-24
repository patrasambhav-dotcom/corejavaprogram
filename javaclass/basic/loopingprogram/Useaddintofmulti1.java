import java.util.*;
class Useaddintofmulti1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int i=sc.nextInt();
		System.out.println("enter a number to divide it");
		int j=sc.nextInt();
		int n=0;
		while(i>=j)
		{
			i=i-j;
			n++;
				
        }
		System.out.println("divison of two numbers without divide is =  " +n);
        System.out.println(" remainder =  "+i);

	}
}