class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 45;
        name = "Your-Name-Here"; 
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName; 
    }
    public String getName(){ return name;}
    public void setName(String n ){this.name = name;}
    public void setId(int i ){this.id = id;}
    public int getId(){return id;}
    
}
public class javarevise22 {
    public static void main(String[] args) {
         MyMainEmployee harshit = new MyMainEmployee("HARSHIT MALVIYA", 2010);
           MyMainEmployee nikhil = new MyMainEmployee();
         System.out.println(nikhil.getId());
         System.out.println(nikhil.getName());
         System.out.println(harshit.getId());
         System.out.println(harshit.getName());

    }
}
