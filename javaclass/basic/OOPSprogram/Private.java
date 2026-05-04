class Student
{

	private String name;
	private int roll;
	 private double mark;
}
class Private
{
	public static void main(String arg[])
	{
	 Student s=new Student();  //object create 
	 s.name="muna"; // private not acess outside class
	 s.roll=1;  // error
	 s.mark=90.50; // error
	 System.out.println("my name="+s.name);  // private not acess outside class
	  System.out.println("my roll="+s.roll);  
	   System.out.println("my mark="+s.mark);
	
	  
	}
	}
}