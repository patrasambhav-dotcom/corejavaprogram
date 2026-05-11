package constructor;

public class Thisconstructor 
{
	String name;
	int rollno;
	double marks;
	public Thisconstructor(String name,int rollno,double marks)
	{
		this(name,rollno);
		this.marks=marks;
	}
	public Thisconstructor(String name,int rollno)
	{
		this(rollno);
		this.name=name;
		
	}
	public Thisconstructor(int rollno)
	{
		this();
		this.rollno=rollno;
	}
	public Thisconstructor()
	{
		
	}
    void show()
    {
    	System.out.println(name+" "+rollno+" "+marks);
    }
    
    
    public static void main(String arg[])
    {
		Thisconstructor t=new Thisconstructor("sam",4,40);
		t.show();
   	 
    }
}


	
	

     
