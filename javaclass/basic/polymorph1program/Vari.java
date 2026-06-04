class Parent
{
     Object  marry()
	{
		System.out.println("rita");
		return null;
	}
}
class Child extends Parent
{
	
  	String   marry()
	{
		System.out.println("gita");
		return null;
	}
}

class Vari
{
	public static void main(String arg[])
	{
	    Parent p=new Child(); //upcasting
	    p.marry(); 
	}
}