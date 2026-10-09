class A{
    public int a;
    public int nikhil(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method two of the class A");
    }
}
class B extends A{
    @Override
     public void meth2(){
        System.out.println("I am method two of the class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of the class B");
    }
}
public class practice_48_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
