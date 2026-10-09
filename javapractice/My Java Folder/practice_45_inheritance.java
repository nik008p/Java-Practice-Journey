import java.util.Scanner;
class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("setting constructor for the x and y");
        this.x = x;
    }
public void PrintMw(){
    System.out.println("i am a constructor");
}
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
class animal{
    String allanimals;

    public String getAllanimals() {
        return allanimals;
    }

    public void setAllanimals(String allanimals) {
        this.allanimals = allanimals;
    }
   
    public int wildanimals(String wild){
        System.out.println("They can attack anytime and you cant control them  ");
        return wildanimals(wild);
    }
}
class tiger extends animal{
    String roarTiger;

    public String getRoarTiger() {
        return roarTiger;
    }

    public void setRoarTiger(String roarTiger) {
        System.out.println("Tiger's roar can be able to hear from miles away");
        this.roarTiger = roarTiger;
    }
    
}

public class practice_45_inheritance {
    public static void main(String[] args) {

        // Derived d = new Derived();
        // d.setX(1);
        // d.setY(10);
        // System.out.println(d.getX());
        // System.out.println(d.getY());
        // d.PrintMw();
        // Base b = new Base();
      
        tiger t = new tiger();
        t.setAllanimals("dogs,cat,fox,wolf etc..."); 
        System.out.println(t.getAllanimals());
        t.setRoarTiger(" it's very loud");
        System.out.println(t.getRoarTiger());
    }
}
