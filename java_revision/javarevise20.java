class Employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public void setsalary(int n){
        salary = n;
    }
}
class CellPhone{
    public void ring(){
        System.out.println("ringing..");
    }
    public void vibrate(){
        System.out.println("vibrating..");
    }
    public void calfriend(){
        System.out.println("calling.. unknown!");
    }

}
 class Square {
   int side;
   public int area(){
    return side*side;
   }  
   public int perimeter(){
    return 4*side;
   }  
}
 class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*length+breadth;
    }

    
}
class TommyVecitti {
    public void hit(){
        System.out.println("Hitting the Enemy ");
    }
    public void run(){
        System.out.println("Running from  the Enemy ");
    }
    public void fire(){
        System.out.println("firring the Enemy ");
    }

    
}
public class javarevise20 {
    public static void main(String[] args) {
        /* 
        // PROBLEM 1
        Employee nikhil = new Employee();
        nikhil.setname("Nihkil Malviya");
        System.out.println("My name is " +nikhil.getname());
        nikhil.setsalary(34000);
        System.out.println("My salary is "+ nikhil.getsalary());
        
        // PROBLEM 2
        CellPhone realme = new CellPhone();
        realme.ring();
        realme.vibrate();
        realme.calfriend();
        */
    //    PROBLEM 3
        //    Square details = new Square();
        //    details.side = 3;
        //    System.out.println(details.area());
        //    System.out.println(details.perimeter());
  
        //    Problem 4
        // Rectangle rec = new Rectangle();
        // rec.length = 12;
        // rec.breadth = 23;
        // System.out.println(rec.area());
        // System.out.println(rec.perimeter());

        // PROBLEM 5
        TommyVecitti TOMMY = new TommyVecitti();
        TOMMY.hit();
        TOMMY.run();
        TOMMY.fire();





    }
}
