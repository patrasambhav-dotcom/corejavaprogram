package constructor;

class Cons1
{
	String name; //instance variable
	int rollno;
	double mark;
	Cons1(String name,int rollno,double mark) //formal variable 
	{
	    this.name=name;
	    this.rollno=rollno; 
	    this.mark=mark;
	}
	Cons1()
	{
	     name=null;
	     rollno=0;
	     mark=0.0;
	}
	Cons1(String nm,int r)
	{
	     name=nm;
	     rollno=r;
	}
	Cons1(int r,double m)
	{
	     rollno=r;
	     mark=m;
	}
    void disp()
    {
       System.out.println(name+" "+rollno+" "+mark);
    }

}
class Test
{
	public static void main(String arg[])
	{

	   Cons1 s=new Cons1("muna",1,90.50);
	   s.disp();
	   Cons1 s1=new Cons1();
	   s1.disp();
	   Cons1 s2=new Cons1("kuna",2);
	   s2.disp();
	   Cons1 s3=new Cons1(3,80);
	   s3.disp();
	}
}
