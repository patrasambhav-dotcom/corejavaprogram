class X
 {
    static  int a; 
     int b; 

 }

 class Staticvariable2
{
    
        public static void main(String arg[])
        {
            
          X ob=new X();
          X ob1=new X();
         ob.a=5;
         ob.b=7;
         ob1.a=10;
         ob1.b=20;
         System.out.println(ob.a+" "+ob.b); 
         System.out.println(ob1.a+" "+ob1.b);
           

        }
}