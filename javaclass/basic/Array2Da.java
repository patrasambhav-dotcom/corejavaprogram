import java.util.*;
class Array2Da
{
	
		public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
            int arr[][];
            arr=new int[2][3];
            System.out.println("enter 6 elements ");
            int i,j;

            for(i=0;i<2;i++)
            {
	          for(j=0;j<3;j++)
	            {
	          arr[i][j]=sc.nextInt();
	            }
	
            }
            System.out.println("elements are ");
            for(i=0;i<2;i++)
            {
	          for(j=0;j<3;j++)
	        {
	          System.out.print(arr[i][j]+"\t");
	        }
	          System.out.println();
            }
		}

	
}



