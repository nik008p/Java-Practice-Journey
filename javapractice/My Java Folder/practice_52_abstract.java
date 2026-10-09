
 abstract class Parent{
    public Parent(){
        System.out.println("Iam Base class constructor");
    }
    public void sayhello(){
       System.out.println("Hello"); 
    }
    abstract public void greet();
    abstract public void noongreeting();
}
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning !...");
    }
    public void noongreeting(){
    System.out.println(" good afternoon!!...");
    }
}
 class Child2 extends Parent{
     @Override
    public void greet(){
        System.out.println("Good Morning !...");
    }
      public void noongreeting(){
    System.out.println(" good afternoon!!...");
    }

}

public class practice_52_abstract {
    public static void main(String[] args) {
        Parent p = new Child();
        
    }
}
