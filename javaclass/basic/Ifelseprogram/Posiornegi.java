import java.util.*;
class Posiornegi
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=sc.nextInt();
        String msg;
        msg=no>=0?"+ve no":"-ve no";
        System.out.println(msg);
    }
}