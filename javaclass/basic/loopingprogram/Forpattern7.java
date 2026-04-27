import java.util.*;
class Forpattern7
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter  start of a number");
        int no=sc.nextInt();
        System.out.println("enter number of rows");
        int r=sc.nextInt();
        int i,j;
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(no+ "\t");
                no++;
            }
            System.out.println();
        }
    }
}
