class Base1{
    Base1(){
        System.out.println("Iam a constructor ");
    }
    Base1 (int x){
        System.out.println("Iam an overloaded constructor with value x:"+x);
    }
    
}
class Derived1 extends Base1{
    Derived1(){
       // super(0);
        System.out.println("I am an  Derived1 constructor");
    }
    Derived1(int x,int y ) {
        super(x);
       System.out.println("Iam an overloaded constructor of Derived1 with vlaue of y as:"+y); 

    }
  
}
class ChildOfDerived1 extends Derived1{
    ChildOfDerived1(int x, int y , int z){
        super(x, y);
        System.out.println("Iam an overloaded constructor child of Derived1 with vlaue of z as:"+z);

    }
}
public class practice_46_constructorin_inheritance {
    public static void main(String[] args) {
      // Base1  b = new Base1();
       // Derived1 d = new Derived1(20,23);
        ChildOfDerived1 ch = new ChildOfDerived1(20, 25, 45);
    }
}
