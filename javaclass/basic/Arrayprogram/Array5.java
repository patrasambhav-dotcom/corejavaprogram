class Array5
{
	public static void main(String arg[])
	{
		int arr[]=new int[3];
        System.out.println(arr); //assume arrray create 5000 location
        System.out.println(arr.length); // 3
        arr=new int[5];
        System.out.println(arr); //assume arrray create 6000 location
        System.out.println(arr.length); // 5
	}
}