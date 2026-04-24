class Forlooppattern9
{
	public static void main(String arg[])
	{
		int i,j;
		for(i=65;i<=68;i++)
		{
			for(j=68;j>=i;j--)
			{
				System.out.print( (char)j+"\t");
				
			}
			System.out.println();
		}
	}
}