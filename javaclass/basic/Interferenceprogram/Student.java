public class Student
{
	public final String name;
	public final int age;
	public Student()
	{
		this.name="Sam";
		this.age=19;
	}
    public void disp()
    {
	   System.out.println("student name is "+this.name);
	   System.out.println("student age is "+this.age);
    }
    public static void main(String arg[])
    {
    	new Student().disp();

    }
}