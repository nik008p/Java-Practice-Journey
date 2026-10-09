class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}
class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Aapka swagat hai!");
    }
    @Override
    public void name(){
        System.out.println("My name is java in class two");
    }
}
public class javarevise28 {
    public static void main(String[] args) {
        Phone obj = new Phone();
        obj.name();
        obj.greet();
        SmartPhone obj1 = new SmartPhone();
        obj1.swagat();
        obj.name();


    }
}
