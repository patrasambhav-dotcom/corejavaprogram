class Array2Dtransposemutli
{
	public static void main(String arg[])
	{
		int a[][]={{10,20,30},{40,50,60}};
		int i,j,k;
		System.out.println("first matrix =");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		int b[][]={{10,20},{30,40},{50,60}};
		System.out.println("second matrix =");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		int c[][]=new int[2][3];
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<2;j++)
			{
				c[i][j]=0;
				for(k=0;k<3;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("multiplication result =");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}