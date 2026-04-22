import java.util.*;
class Rangearmstrongnumber
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        int no = start;

        while (no <= end) 
        {
            	int temp = no;
               int p = 0, arm = 0, r;
		    	temp=no;
				while (temp!=0)
				{
					p=p+1;
					temp=temp/10;
				}
				temp=no;
				arm=0;
				while(temp!=0)
				{
					r=temp%10;
					arm=arm+(int)Math.pow(r,p);
					temp=temp/10;
				}
				if(no==arm)
				{
					System.out.println(no);

				}
				no++;
			}

	}
}