class Array4
{
	public static void main(String arg[])
	{
		int arr[]={10,20};
        int arr1[]=arr;
        System.out.println(arr[0]+" "+arr[1]);//10 20
        System.out.println(arr1[0]+" "+arr1[1]);// 10 20
        arr[0]=30;
        arr[1]=40;
        System.out.println(arr[0]+" "+arr[1]);//30 40
        System.out.println(arr1[0]+" "+arr1[1]);// 30 40
	}
}

