import java.util.*;
class Array2Dsum
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
	
	    int a[][]={{1,2,3},{4,5,6}};
	    int b[][]={{1,1,1},{2,2,2}};
	    int c[][]=new int[2][3];
	    int i,j;

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