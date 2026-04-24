class Forpattern1
{
	public static void main(String arg[])
	{
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
				{
					System.out.print(j);
				}
			for(j=i;j>=1;j--)
			    {
					System.out.print(j);
				}
            System.out.println();

		}
	    
	}
}