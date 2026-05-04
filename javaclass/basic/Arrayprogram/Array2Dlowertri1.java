import java.util.*;
class Array2Dlowertri1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter order of matrix ");
		int no=sc.nextInt();

		int arr[][]=new int[no][no];
		System.out.println("enter "+no*no+" integers ");
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
				arr[i][j]=sc.nextInt();
		}

		System.out.println("the lower triangle matrix is");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				if(j<=i)
				{
					System.out.print(arr[i][j]+"\t");

				}
				else 
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}