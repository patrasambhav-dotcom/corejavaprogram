class Arraybignumber
{
	public static void main(String arg[])
	{
		int arr[]={5,6,7,9,10};
		int i;
		int big=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(big<arr[i])
			{
				big=arr[i];
			}
		}
		System.out.println(big+"  is the biggest number");
	}
}