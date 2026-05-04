import java.util.*;
class Array2Dsum1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=sc.nextInt();
	    System.out.println("enter number of columns");
	    int col=sc.nextInt();

	    
	    int i,j;
	    int a[][]=new int[2][3];

	    System.out.println("enter first  6 numbers ");
	    
	    for(i=0;i<2;i++)
	    {
	    	for(j=0;j<3;j++)
	    		a[i][j]=sc.nextInt();
	    }
	    int b[][]=new int[2][3];
	    System.out.println("enter second  6 numbers ");
	    
	    for(i=0;i<2;i++)
	    {
	    	for(j=0;j<3;j++)
	    		b[i][j]=sc.nextInt();
	    }
        int c[][]=new int[2][3];
	    for(i=0;i<2;i++)
	    {
	    	
	    	for(j=0;j<3;j++)
	    	{
	    		c[i][j]=a[i][j]+b[i][j];
	    	}
	    }
	    System.out.println("First 2D elements are");
	    for(i=0;i<2;i++)
	    {
	    	for(j=0;j<3;j++)
	    	{
	    		System.out.print(a[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println("Second 2D elements are");
	    for(i=0;i<2;i++)
	    {
	    	for(j=0;j<3;j++)
	    	{
	    		System.out.print(b[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println("sum =");
	    for(i=0;i<2;i++)
	    {
	    	for(j=0;j<3;j++)
	    	{
	    		System.out.print(c[i][j]+"\t");
	    	}
             System.out.println();
	    }
	    
	    

	    
	}
}