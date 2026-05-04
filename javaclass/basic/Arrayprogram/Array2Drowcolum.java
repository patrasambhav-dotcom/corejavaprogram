import java.util.*;
class Array2Drowcolum
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=sc.nextInt();
		System.out.println("enter number of columns");
		int col=sc.nextInt();
		int numbers[][]=new int [row][col];
		System.out.println("enter "+(row*col)+" numbers");
		int i,j;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				numbers[i][j]=sc.nextInt();
		}
		System.out.println("result");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
		}
		

	}
}