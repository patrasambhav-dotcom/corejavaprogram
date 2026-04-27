import java.util.*;
class Methodevenoddtruefalse
{
	static void evenodd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an interger");
		int no=sc.nextInt();
		if(no<0)
		{
			no=-no;
		}
        System.out.println("is the integer even ? write true or false");
        boolean j=sc.nextBoolean();
        

	}
	public static void main(String arg[])
	{
		evenodd();
	}
}