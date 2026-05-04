import java.util.*;
class Array2Dinsert
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows and columns for matrix 1");
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("enter number of rows and columns for matrix 2");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int matrix[][]=new int[r][c];
		int matrix1[][]=new int[l][b];
		int i,j,k;
		System.out.println("enter "+r*c+" integers ");
		for(i=0;i<matrix.length;i++)
		{
			for(j=0;j<matrix[i].length;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter "+l*b+" integers ");
		for(i=0;i<matrix1.length;i++)
		{
			for(j=0;j<matrix1[i].length;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("first matrix =");
		for(i=0;i<matrix.length;i++)
		{
			for(j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
				
			}
			System.out.println();
		}
		System.out.println("second matrix =");
		for(i=0;i<matrix1.length;i++)
		{
			for(j=0;j<matrix1[i].length;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
				
			}
			System.out.println();
		}
		int arr[][]=new int[r][b];
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j]=0;
				for(k=0;k<c;k++)
				{
					arr[i][j]=arr[i][j]+matrix[i][k]*matrix1[k][j];

				}
				
			}
		}
		System.out.println("multiplication result =");
		for(i=0;i<r;i++)
		{
			for(j=0;j<b;j++)
			{
				System.out.print(arr[i][j]+"\t");

			}
			System.out.println();

		}
	}
}