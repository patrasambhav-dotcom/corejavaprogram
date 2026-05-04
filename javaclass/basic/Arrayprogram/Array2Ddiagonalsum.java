import java.util.*;
class Array2Ddiagonalsum
{

	public static void main(String arg[])

	{

		int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
		int i,j;
		int s=0;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				if(j==i)
				{
					System.out.print(arr[i][j]+"\t");
					s=s+arr[i][j];

				}
				else 
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		

		

		System.out.println("sum of diagonal elements = "+s);
	}
}