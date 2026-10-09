class cylinder {
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surfacearea(){
        return 2* Math.PI* radius * radius*height + 2* Math.PI* radius*height;
    } 
    public double volume(){
        return  Math.PI* radius * radius*height;
    } 

}
class Rectangle{
    private int lenght;
    private int breadth;
    public Rectangle() {
        this.lenght = 4;
        this.breadth = 5;
    }
    

    public Rectangle(int lenght, int breadth) {
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
class Sphere {
    private int radius;
    

    public Sphere() {
        this.radius = 8;
    }

    public int getRadius() {
        return radius;
    }
    public double surfacearea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return 4/3 * Math.PI * radius*radius*radius;
    }

  
    

    
}

public class javarevise24 {
    public static void main(String[] args) {
        // problem no. 1
        
        cylinder mycylinder = new cylinder(4,8);
        // mycylinder.setHeight(4);
        System.out.println(mycylinder.getHeight());
        // mycylinder.setRadius(8);
        System.out.println(mycylinder.getRadius());
        // Problem no. 2
        System.out.println(mycylinder.surfacearea());
        System.out.println(mycylinder.volume());

        // Problem no. 4
          Rectangle r = new Rectangle();
           System.out.println(r.getBreadth());
           System.out.println(r.getLenght());

        //    Problem no. 5
        Sphere s = new Sphere();
         System.out.println(s.surfacearea()); 
         System.out.println(s.volume());       

    }
}
