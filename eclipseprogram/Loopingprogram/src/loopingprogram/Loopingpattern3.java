package loopingprogram;

public class Loopingpattern3 
{

	public static void main(String[] args)
	{
		int i,j;
		int no=1;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(no+"\t");
				no++;
			}
			System.out.println();
		}
		
		
	}

}
