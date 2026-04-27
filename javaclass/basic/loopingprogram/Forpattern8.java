import java.util.*;
class Forpattern8
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
    	System.out.println("enter  start of a Uppercaseletter");
        char ch=sc.next().charAt(0);
        System.out.println("enter number of rows");
        int r=sc.nextInt();
        int i,j;
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch+ "\t");
                ch++;
            }
            System.out.println();
        }
	}
}