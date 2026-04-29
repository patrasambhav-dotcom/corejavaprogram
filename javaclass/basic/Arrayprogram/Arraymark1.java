import java.util.*;
class Arraymark1
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
		
		int s=0;
		for(i=0;i<mark.length;i++)
		{
			System.out.println("mark"+(i+1)+"= "+mark[i]);
			s=s+mark[i];
		}
		System.out.println("total marks = " +s);
		double av=s/(size);
		{
			System.out.println("Average marks = " +av);
		}
	}
}