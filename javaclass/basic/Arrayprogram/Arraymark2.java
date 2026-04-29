import java.util.*;
class Arraymark2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int mark[];
		System.out.println("enter number of subjects");
		int size=sc.nextInt();
		mark=new int[size];
		System.out.println("enter marks of "+size+"subjects out of 100");
		int i;
		for(i=0;i<mark.length;i++)
		{
			System.out.println("enter mark for subject "+(i+1));
			mark[i]=sc.nextInt();
		}
		System.out.println("mark1\tmark2\tmark3\tmark4\tmark5\ttotal\tavg");
		int s=0;
		for(i=0;i<mark.length;i++)
		{
			System.out.print(mark[i]+"\t");
			s=s+mark[i];
		}
		
		double av=s/(size);
		{
			System.out.println(s+"\t"+av);
		
		}
		System.out.println();
	}
}