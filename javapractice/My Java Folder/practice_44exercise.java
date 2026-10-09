

class Cylinder{
    private int radius,height;
    private float pi;

    public Cylinder(int radius,int height){
        this.height = 12;
        this.radius = 4;

    }
    public int  getradius(){
        return radius;
    }
    public void setradius(int radius){
         this.radius = radius;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int height){
         this.height = height;
    }
    public float getpi(){
        return pi;
    }
    public void setpi(float pi){
        this.pi = pi; 
    }
    public float getSurfaceArea(){
        return 2*pi*radius *(radius + height);
    }
    public float getSurfaceVolume(){
        return pi*radius*radius*height;
    }
}
class Rectangle{
   private int lenght;
   private int breadth;

   public Rectangle(int lenght,int breadth) {
    this.lenght = lenght;
    this.breadth = breadth;
   }

   public int getLenght() {
    return lenght;
   }

   public int getBreadth() {
    return breadth;
   }
}
   class mysph{
    private int radius;
    private float pi;
    public mysph(int radius,float pi) {
        this.radius = radius;
        this.pi = pi;
    }

    public int getRadius() {
        return radius;
    }
    public float getSurfaceArea(){
        return 4*pi*radius*radius;
    }
     public float getSurfaceVolume(){
        return (4.0f/3)*pi*radius*radius*radius;
    }
    
   
   
   
}
public class practice_44exercise {
   public static void main(String[] args) {
//Problem no.1    
    //    Cylinder cln = new Cylinder();
    //    cln.setradius(5);
    //    cln.setheight(12);
    //   System.out.println(cln.getheight());
    //    System.out.println(cln.getradius());
 
//Problem no.2
    // Cylinder cln = new Cylinder();
    //    cln.setradius(5);
    //    cln.setheight(12);
    //   cln.setpi(3.14f);
    //   System.out.println(cln.getSurfaceArea());
    //   System.out.println(cln.getSurfaceVolume());

//Problem no.3
    //    Cylinder cln = new Cylinder(12,4);
    //     cln.setpi(3.14f);
    //   System.out.println(cln.getSurfaceArea());
    //   System.out.println(cln.getSurfaceVolume());

//Problem no.4
        // Rectangle rec = new Rectangle(12, 56);
        // System.out.println(rec.getBreadth());
        // System.out.println(rec.getLenght());

//Problem no.5
           mysph sp = new mysph(4, 3.142f);
           System.out.println(sp.getSurfaceArea());
           System.out.println(sp.getSurfaceVolume());
}
    
}
