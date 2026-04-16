import java.util.*;
class Trueorfalse
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno");
		int q=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String n=sc.nextLine();
		System.out.println("enter marks");
		double e=sc.nextDouble();
		System.out.println("enter gender");
		String m=sc.next();
		System.out.print ("did student pass true or false");
		boolean j=sc.nextBoolean();
		System.out.println( "did student qualify for next class y or n");
		char g=sc.next().charAt(0);

		System.out.println("my name is "+n+",roll no is "+q+" and marks is  "+e+"");
		System.out.println("my gender is "+m+"");
		System.out.println("did student pass exam "+j+" ");
		System.out.println("did student qualify for next class "+g+"");
			
		}

	}
