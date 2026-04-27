class Forpyramid4
{
	public static void main(String arg[])
	{
		int i,j,s;
		for(i=4;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			if(i==4)
			{
				for(j=i-1;j<=i;j++)
				{
					System.out.print(j);
				}
				System.out.println();
				continue;
			}
			for(s=1;s<=2*(4-i)-1;s++)
			{
				System.out.print(" ");

			}
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
