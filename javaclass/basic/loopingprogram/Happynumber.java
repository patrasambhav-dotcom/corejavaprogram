import java.util.Scanner;

class Happynumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int temp=num;
        int sum=0;

        while (temp!= 1 && temp!= 4)
        {
            sum=0;

            while (temp>0)
            {
                int r=temp%10;
                sum=sum+(r*r);
                temp=temp/10;
            }

            temp=sum;
        }

        if (temp == 1)
            System.out.println(num + " is a Happy Number");
        else
            System.out.println(num + " is Not a Happy Number");
    }
}