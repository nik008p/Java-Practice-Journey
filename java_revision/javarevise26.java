class EkClass{
    int a;
    public int getA() {
        return a;
    }
    
    public EkClass(int a) {
        this.a = a;
    }
    

    public int return1(){
        return 1;
    }


}
class DoClass extends EkClass{


    public DoClass(int c) {
        super(c);
        System.out.println("I am a constructor");
    }
    
}
public class javarevise26 {
    public static void main(String[] args) {
        EkClass E = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(E.getA());
    }
}
