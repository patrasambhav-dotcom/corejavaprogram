class Student {
    String name;  // instance variable

    void setName(String n)          //instance method
     {
        name = n;
    }

    void show()                            //instance method
    {
        System.out.println("Name: " + name);
    }
}

class AccessingVariables {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Amit");
        s1.show();  // Output: Name: Amit
    }
}
