class Forloopbreak
{
	public static void main(String arg[])
	{
		int i;
        for(i=1;i<=5;i++)
        {
            System.out.println("A");
            if(i>=3)
           {
            break;
           }
            System.out.println("B");

        }
         System.out.println(i);
	}
}