import java.util.*;
class Forpyramid
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lenght of rec");
		int n=sc.nextInt();
		System.out.println("enter breadth of rec");
		int m=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;j++)
			{
				if(i==1 || j==1 || i==n || j==m)
				{
					System.out.print("*");

				}
				else 
				{
					System.out.print(" ");
				}
				
			}
		System.out.println();
		}
		System.out.println("Here is the shape of a rectangle");
	}
}