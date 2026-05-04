class Array2Dtransposemulti
{
	public static void main(String arg[])
	{
		int a[][]={{10,20,30},{40,50,60}};
		int i,j,k;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		int b[][]=new int[a[0].length][a.length];
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		System.out.println(" its transpose matrix is");
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