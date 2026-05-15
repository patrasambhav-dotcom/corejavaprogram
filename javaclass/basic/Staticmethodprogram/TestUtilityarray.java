class A
{
	private A()
	{

	}
	static void disp(int arr[])
	{
		int i;
		for( i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static int sum(int arr[])
	{
		int s=0;
		for(int i=0;i<arr.length;i++)
		{
			s=s+arr[i];
		}	
		return s;
	}


}
class TestUtilityarray
{
	public static void main(String arg[])
	{
		int arr[]={10,20,30,40,50};
		A.disp(arr);
		int total= A.sum(arr);
		System.out.println("Sum = "+total);

	}
}