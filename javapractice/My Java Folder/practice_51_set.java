class circle {
   public int radius;

  
   circle(int r){
    System.out.println("I am cirlce parameterized character ");
   this.radius = r;
   }
    public double area(){
        return Math.PI*radius*radius;
    }

}
class Cylinder extends circle{
    public int height;
    Cylinder(int r,int h){
      super(r);
      this.height = h;  
      System.out.println("i am cylinder parameterized constructor"); 

    }
    
    public double Volume(){
        return Math.PI*radius*radius*height;


    }
}
class Rectangle{
  public int lenght;
  public int breadth;

  
  
  Rectangle(int l){
    this.lenght = l;
  }
  public int area(){
    return lenght*breadth;
  }
  public int perimeter(){
    return 2*(lenght + breadth);
  }
  public int getLenght() {
    return lenght;
  }
  public void setLenght(int lenght) {
    this.lenght = lenght;
  }
  public int getBreadth() {
    return breadth;
  }
  public void setBreadth(int breadth) {
    this.breadth = breadth;
  }
}
class Cuboid extends Rectangle{
    public int height;
    Cuboid(int l,int h){
        super(l);
        this.height = h;
    }

    public int areaTSA(){
        return 2*(lenght*breadth +breadth*height + lenght*height);
    }
    public int volume(){
        return lenght*breadth*height;
    }
}
public class practice_51_set {
    public static void main(String[] args) {
        //Problem no.1
    //     circle obj1 = new circle(12);
    //    Cylinder obj = new Cylinder(12,2);
    //    obj.area();
    //    System.out.println(obj.area());
    //    System.out.println(obj.Volume());

    //Problem no.2
       Cuboid obj = new Cuboid(6, 8);
       obj.setBreadth(4);
       System.out.println(obj.getBreadth());
       System.out.println(obj.area());
       System.out.println(obj.areaTSA());
       System.out.println(obj.perimeter());
       System.out.println(obj.volume());


        
    }
}
