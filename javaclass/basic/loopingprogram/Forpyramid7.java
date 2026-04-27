import java.util.*;
class Forpyramid7
{
	public static void main(String arg[])
	{
		String s="sita";
		int i,j;
		for(i=0;i<s.length();i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j)+"\t");

			}
			System.out.println();

		}
	}
}