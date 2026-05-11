class B
{
	  void show()
    {
    	System.out.println("show nonstatic  method");
    	disp();//directly
    	B.disp();  // by classname
    	B obj=new B();
    	obj.disp(); //by object
    	
    }
    static void disp()
    {
            System.out.println("disp static  method");
    }
}

class Test1
{
   
	public static void main(String[] args)
	{
	     B t1=new B();
	     t1.show();
	}

}