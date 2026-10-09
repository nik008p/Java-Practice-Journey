class phone{
    public void Showtime(){
        System.out.println("06:05 P.M");
    }
    public void on(){
        System.out.println("Turnning on phone");

    }
}
class Smartphone extends phone{
    public void Music(){
        System.out.println("playing music....Hona tha pyaar...");
    }
    @Override
      public void on(){
        System.out.println("Turning on SmartPhone");

    }

}
public class practice_49_Dynamicmethod_Dispatch {
    public static void main(String[] args) {
        // phone p = new phone();
        // Smartphone smart = new Smartphone();
        // p.name();
        phone obj = new Smartphone();
        obj.Showtime();
        obj.on();
        //obj.music();  // not allowed make new obj for smarthphone class
       // Smartphone obj2 = new phone();//Also not allowed sub to super class
       Smartphone sp = new Smartphone();
       sp.Music();
    }
}
