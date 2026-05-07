package loopingprogram;

public class LoopingSITA 
{

	public static void main(String[] args) 
	{
		int i,j;
		String str="SITA";
		for(i=0;i<=3;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(str.charAt(j)+"\t");
				
			}
			System.out.println();
		}
		

	}

}
