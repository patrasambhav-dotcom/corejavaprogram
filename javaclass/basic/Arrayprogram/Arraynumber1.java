import java.util.*;
class Arraynumber1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[];
        System.out.println("enter number of elements");
        int size=sc.nextInt();
		arr=new int[size];
		int i;
		System.out.println("enter "+size+" numbers"); 
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("the elements are");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}