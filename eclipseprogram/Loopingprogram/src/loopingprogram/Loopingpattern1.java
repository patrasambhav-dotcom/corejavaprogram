package loopingprogram;

public class Loopingpattern1 
{

	public static void main(String[] args) 
	{
		int i,j;
		for(i=4;i>=1;i--)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
