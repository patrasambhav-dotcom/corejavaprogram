 import java.util.*;
 class Forlooppyramid1
 {
 	public static void main(String arg[])
 	{
 		Scanner sc=new Scanner(System.in);
 		System.out.println("enter number");
 		int n=sc.nextInt();
 		int i,j;
 		for(j=1;j<=n;j++)
 		{
 			for(i=j;i>=1;i--)
 		
 		  System.out.print(i+"\t");
        
        System.out.println();
    }
 	}
 }