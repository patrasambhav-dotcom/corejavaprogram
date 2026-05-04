class Array2Dtranspose
{
	public static void main(String arg[])
	{
		int arr[][]={{10,20,30},{40,50,60}};
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		int arr1[][]=new int[arr[0].length][arr.length];
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr1[j][i]=arr[i][j];
			}
		}
		System.out.println(" its transpose matrix is");
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();

		}
	}
}