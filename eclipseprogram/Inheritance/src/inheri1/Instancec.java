package inheri1;
class Rain 
{
	
}
class Cloud extends Rain
{
	
}
class Strom extends Cloud 
{
	
}
public class Instancec 
{
	public static void main (String arg[])
	{
		Rain ob=new Cloud();

		System.out.println(ob instanceof Rain);
		System.out.println(ob instanceof Cloud);
		System.out.println(ob instanceof Object);
		System.out.println(ob instanceof Strom);		
	}
	

}
