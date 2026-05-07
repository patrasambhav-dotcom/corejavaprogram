package loopingprogram;

public class LoopingpatternABC1 
{

	public static void main(String[] args) 
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
