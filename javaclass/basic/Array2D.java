class Array2D
{
	public static void main(String arg[])
	{
		int arr[][]={{10,20,30},{40,50,60},{70,80,90},{100,110,120}};
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}