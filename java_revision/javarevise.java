class Base1 {
    public int x;
    

    public Base1() {
        System.out.println("I am a constructor ");
    }
    public Base1(int x) {
        System.out.println("I am an overloaded constructor with valua of " + x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
}
class Derived1 extends Base1{
    public int y;
    

    public Derived1() {
        // super(0);
        System.out.println("I am Derived1 class constructor");
    }
public Derived1(int x, int y){
    super(x);
    System.out.println("I am an overloaded constructor of Derived1 with valua of y" + y);
}

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
class ChildOfDerived extends Derived1{
     ChildOfDerived(){
         System.out.println("I am a child of derived constructor");
    }
     ChildOfDerived(int x, int y, int z){
        super(x, y);
         System.out.println("I am a child of derived constructor with value of z as:"+ z);
    }

}
public class javarevise {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14,9);
         ChildOfDerived D = new ChildOfDerived(14,9,16);
        
    }
}
