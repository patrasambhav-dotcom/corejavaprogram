class Studentcopy
{
	int id;
	String name;
	Studentcopy(int i,String n)
	{
		id=i;
		name=n;
	}
	 Studentcopy(Studentcopy s)
	 {
	 	id=s.id;
	 	name=s.name;
	 }
	 void disp()
	 {
	 	System.out.println(id+" "+name);
	 }
	 public static void main(String arg[])
	 {
	 	Studentcopy s1=new Studentcopy(111,"Sam");
	 	Studentcopy s2=new Studentcopy(s1);
	 	s1.disp();
	 	s2.disp();
	 }
}