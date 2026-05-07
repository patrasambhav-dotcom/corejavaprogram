package project1;

public class Simpleint 
{
	private double prin;
	private double rate;
	private double time;

	public Simpleint(double p,double r,double t) 
	{
		prin=p;
		rate=r;
		time=t;
		
	}
	void simp()
	{
		
		System.out.println("Simple intrest = "+(prin*rate*time)/100 );
	}

	public static void main(String[] args) 
	{
		Simpleint s=new Simpleint(1000,4,5);
		s.simp();
		Simpleint s1=new Simpleint(2000,4,5);
		s1.simp();
		

	}

}
