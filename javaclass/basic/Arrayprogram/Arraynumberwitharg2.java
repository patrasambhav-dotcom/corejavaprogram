import java.util.*;
class Arraynumberwitharg2
{
	static void show(int arr[])
	{
		int i;
		for(i=arr.length-1;i>=0;i--)
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