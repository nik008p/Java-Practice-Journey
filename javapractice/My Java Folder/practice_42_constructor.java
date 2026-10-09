class myMainEmployee{
    private int id;
    private String name;

   public myMainEmployee(){
    id = 1001;
    name = "your-Name-Here";
   }
    public myMainEmployee(String myName, int myId){
    id =  myId;
    name = myName;
   }
    public String getName(){return name;}
    public void setName(String n){this.name =n;}
    public void setId(int i ){this.id = i;}
    public int getId( ){return id;}


}

public class practice_42_constructor {
    public static void main(String[] args) {
       // myMainEmployee nik = new myMainEmployee("nikhil malviya",45);
        myMainEmployee nik = new myMainEmployee();
        // nik.setId(1001);
        // nik.setName("Nikhil");
        System.out.println(nik.getId());
        System.out.println(nik.getName());
        
    }
}
