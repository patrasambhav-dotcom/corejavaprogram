class A
{
	  void show()
    {
    	System.out.println("show nonstatic  method");
    	disp();
    	A obj=new A();
    	obj.disp();
    	//A.disp();  error by classname
    }
    void disp()
    {
            System.out.println("disp nonstatic  method");
    }
}

class Test
{
   
	public static void main(String arg[])
	{
	     A t1=new A();
	     t1.show();
	}

}