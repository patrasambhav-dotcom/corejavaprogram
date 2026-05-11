class Staticobject
{
    static void show()
    {
    	System.out.println("show method");
    }
	public static void main(String arg[])
	{
	     show();//directly
	     Staticobject.show();//by classname
	     Staticobject t=null;
         t.show();//by object reference
	     new Staticobject().show(); //by object
	}

}