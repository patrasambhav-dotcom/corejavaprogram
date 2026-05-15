class Studentcopy1
{
	int id;
	String name;
	Studentcopy1(int i,String n)
	{
		id=i;
		name=n;
	}
	Studentcopy1()
	{
		
	}
	 
	 void disp()
	 {
	 	System.out.println(id+" "+name);
	 }
	 public static void main(String arg[])
	 {
	 	Studentcopy1 s1=new Studentcopy1(111,"Sam");
	 	Studentcopy1 s2=new Studentcopy1();
	 	s2.id=s1.id;
	 	s2.name=s1.name;
	 	s1.disp();
	 	s2.disp();
	 }
}