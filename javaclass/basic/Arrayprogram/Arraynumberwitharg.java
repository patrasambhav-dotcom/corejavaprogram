import java.util.*;
class Arraynumberwitharg
{
	static void show(int ele)
	{
		System.out.println(ele);

	}
	public static void main(String arg[])
	{
		int arr[]={10,20,30};
		int i;
		for(i=0;i<arr.length;i++)
		{
			show(arr[i]);
		}
	}
}