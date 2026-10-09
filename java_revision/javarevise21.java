class MyEmployee{
   private int id;
   private String name;
   
   public int getId() {
    return id;
   }

   public void setId(int id) {
    this.id = id;
   }

   public String getName() {
    return name;
   }

   public void setName(String name) {
    this.name = name;
   }
}
public class javarevise21 {
    public static void main(String[] args) {
        MyEmployee nikhil = new MyEmployee();
        // nikhil.id = 45;
        // nikhil.name = "NIKHIL";
        nikhil.setName("NIKHIL MALVIYA");
        System.out.println(nikhil.getName());
        nikhil.setId(91);
        System.out.println(nikhil.getId());
        nikhil.setName("Harshit ");
        System.out.println(nikhil.getName());
        nikhil.setId(92);
        System.out.println(nikhil.getId());
    }
}
