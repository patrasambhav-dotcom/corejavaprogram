class Forpattern5
{
	public static void main(String arg[])
	{
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=4-i;j>=1;j--)
				{
					System.out.print(" ");
				}
			for(j=1;j<=i;j++)
			    {
					System.out.print(j);
				}
		    for(j=i-1;j>=1;j--)
		        {
		        	System.out.print(j);
		        }
            System.out.println();

		}
	    
	}
}