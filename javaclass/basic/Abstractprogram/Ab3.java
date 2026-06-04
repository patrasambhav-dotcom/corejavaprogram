abstract class A
{
   int x=10;
   static int y=20;
   A()
   {
   	  System.out.println("A constrcutor ");
   }
   void show()
   {
   	 System.out.println("show maethod ");
   }
   abstract void look();
} 
 class B extends A
{
    B() 
    {
       System.out.println("B constrcutor ");	
    }
    void look()
    {
    	System.out.println("look method ");
    }
    
}

class Ab3
{
	public static void main(String arg[])
	{
		A ob=new B();
		ob.show();
		ob.look();

	}
}