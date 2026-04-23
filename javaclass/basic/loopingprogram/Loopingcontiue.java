class Loopingcontiue
{
	public static void main(String arg[])
	{
	     int i;
          i=1;
        do
        {   
         i++;
         if(i==3)
        {
         continue;
        }
           System.out.println(i);
        }while(i<=5);
	}
}