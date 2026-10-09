abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    public int changeNib(int nib){
        System.out.println("changing the nib.....");
        return nib;
    }
     void write(){
        System.out.println("start write from here... ");
    }
     void refill(){
        System.out.println("it's empty refill it ");
    }
}
class Monkey{
    void jump(){
        System.out.println("jumoing from the tree ");
    }
    void Bite(){
        System.out.println("someone got bite from the monkey ");
    }

}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal {
    void speak (){
        System.out.println("Hello Sir..");
    }
    public void eat (){
        System.out.println("Eating an banana");
    }
    public void sleep(){
        System.out.println("Monkey is sleeping write now....");
    }


}
 abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends TelePhone{
    public void ring(){
       System.out.println("ringing...");
    }
    public void lift(){
        System.out.println( "taking call...");
    }
    public void disconnect(){
        System.out.println("call end...");
    }
    void addcall(){
        System.out.println("choose contact ");
    }

}
interface TvRemote{
    void switchon();
    void switchoff();
}
interface SmartTvRemote extends TvRemote{
    void channelButton();
    void VolumeButton();

}
class Tv implements TvRemote{
     public void switchon(){
        System.out.println("switching on the TV");
    }
    public void switchoff(){
        System.out.println("Switching Off the TV");
    }


}
public class practice_57prac_set {
    public static void main(String[] args) {
        // Problem no.1 and 2
        fountainPen p= new fountainPen();
        p.write();
        System.out.println(p.changeNib(2));

        //Problem no.3
        Human h = new Human();
        h.Bite();
        h.jump();
        h.eat();
        h.sleep();
        h.speak();

        //Problem no.4
        //using polymorphism by creating diff refrence from obj..
        Monkey m = new Human();
        m.Bite();
        m.jump();

        //Problem no.5
        TelePhone T = new SmartTelephone();
        // // T.addcall(); // throws error cause it's refrence is parent class                  
        // //only use parent class methods cause its polymorphism..
        T.ring();
        T.lift();
        T.disconnect();
        
        // Problem no.6 and 7
        Tv t = new Tv();
        t.switchon();
        t.switchoff();
        
        
    }
}
