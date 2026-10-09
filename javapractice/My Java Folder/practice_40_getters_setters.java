class myEmployee{
   private int id;
   private String name;

   public String getName( ){
    return name;
   }
   public void setName(String n){
    name = n;
   }
   public void setId(int i ){
     id = i;
   }
    public int getId(){
    return id;

}
}
  class Circle{
  private int radius;
  private float pi;
  public void setpi(float pi){
    this.pi = pi;
  }
  public float getpi(){
    return this.pi;
  }
  public void setradius(int radius){
    this.radius = radius;

  }
  public int getradius(){
    return this.radius;
  }
  public float  getarea(){
    return pi*radius*radius;
  }
  public float getperimater(){
    return 2*pi*radius;
  }

 }

public class practice_40_getters_setters {

    public static void main(String[] args) {
    //   myEmployee nikhil = new myEmployee();
    //    nikhil.id = 540;
    //    nikhil.name = " Nikhil Malviya ";
    //    System.out.println(nikhil.id);
    //    System.out.println(nikhil.name);
        //   nikhil.setName("Nikhil Malviya");
        //   System.out.println(nikhil.getName());
          Circle cir = new Circle();
          cir.setradius(5);
          cir.setpi(3.14f);
          System.out.println(cir.getarea());
          System.out.println(cir.getperimater());
        
    }
}