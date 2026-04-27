import java.util.*;
class Forpyramid1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number of rows");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((i+j+1)%2);

			}
			System.out.println();

		}
	}
}