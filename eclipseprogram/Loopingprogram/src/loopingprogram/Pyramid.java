package loopingprogram;

public class Pyramid 
{

	public static void main(String[] args) 
	{
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			for( k = 1; k <= (2 * i - 2) * 2; k++)
            {
                System.out.print(" ");
            }
			for(j=i;j<=4;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

}
