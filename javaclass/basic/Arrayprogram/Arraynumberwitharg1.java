import java.util.*;
class Arraynumberwitharg1
{
	static void show(int arr[])
	{
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String arg[])
	{
		int arr[]={10,20,30};
		show(arr);
	}
}