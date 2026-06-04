class Parent
{
     Void  marry() throws Exception
	{
		System.out.println("rita");
				
	}
}
class Child extends Parent
{
	
  	Void  marry()
	{
		System.out.println("gita");
		
		
	}
}

class VariExcep
{
	public static void main(String arg[]) throws Exception
	{
	    Parent p=new Child(); 
	    p.marry(); 
	}
}