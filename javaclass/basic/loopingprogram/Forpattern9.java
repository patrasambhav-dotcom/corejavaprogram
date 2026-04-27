import java.util.*;
class Forpattern9
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	
        System.out.println("enter number of rows");
        int r=sc.nextInt();
        int i,
        j=1;
        for(i=1;i<=r;i++)
        {
            for(;j<=i*(i+1)/2;j++)
            {
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
}
