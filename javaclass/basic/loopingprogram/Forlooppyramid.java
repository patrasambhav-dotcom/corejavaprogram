 import java.util.*;
 class Forlooppyramid
 {
 	public static void main(String arg[])
 	{
 		Scanner sc=new Scanner(System.in);
 		System.out.println("enter number");
 		int n=sc.nextInt();
 		int i,j;
 		for(j=n;j>=1;j--)
 		{
 			for(i=n;i>=j;i--)
 		
 		  System.out.print(i+"\t");
        
        System.out.println();
    }
 	}
 }