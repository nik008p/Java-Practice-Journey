class Base{
    int x;
    
   
    public void printme (){
        System.out.println("I am a constructor ");
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in Base and setting x now ");
        this.x = x;
    }
}
class derived extends Base{
     public int y;

    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        System.out.println("I am in derived class and setting y now "); 
        this.y = y;
    }
    

}
public class javarevise25 {
    public static void main(String[] args) {
        // Creating an object of the Base class 
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        
        // Creating an objecto the derived class 
        derived d = new derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}
