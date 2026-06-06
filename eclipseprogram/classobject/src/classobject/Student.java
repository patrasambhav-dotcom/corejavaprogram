package classobject;
class Stu 
{
	String name;
	int rollno,age;
	
	

public Stu(String name, int rollno, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public int getRollno() {
	return rollno;
}




public void setRollno(int rollno) {
	this.rollno = rollno;
}




public int getAge() {
	return age;
}




public void setAge(int age) {
	this.age = age;
}
void disp()
{
	System.out.println("my name is "+name);
	System.out.println("my age is "+age);
	System.out.println("my roll no is "+rollno);
}




public class Student
{

	public static void main(String[] args) 
	{
		Stu ob=new Stu("Sam",19, 4); 
		ob.disp();

	}


} 
}
