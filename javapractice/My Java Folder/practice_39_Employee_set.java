// Problem no. 1 class defined

class Employee{
    int salary;
    String name;


public int getSalary(){
    return salary;
}
public String getName(){
    return name;
}
public void setName(String n){
    name = n;
}
}
// Problem no. 2 class defined
class cellphone{
    public void Ringing(){
        System.out.println("Ringing..");
    }
    public void vibrating(){
        System.out.println("vibrating");
    }
    public void callfriend(){
        System.out.println("Call friend..");
    }
}
class Square{
  int side;
  public int area(){
    return side*side;
  }
  public int perimeter(){
    return 4*side;
  }
}
class Rectangle{
    int lenght;
    int breadth;
    public int area(){
        return lenght*breadth;
    }
    public int perimeter(){
        return 2*(lenght+breadth);
    }
}
class rockstargames{
   public void hit(){
    System.out.println("hitting..");

   }
   public void run(){
    System.out.println("Running from the banda");

   }
   public void fire(){
    System.out.println(" Firring on the squad..");

   }
}
class circle {
    float pi;
    int radius;
    
    public float area(){
        return pi*radius*radius;
    }
    public float perimeter(){
      return 2*(pi*radius);
    }
}
    


public class practice_39_Employee_set {
    public static void main(String[] args) {
// //Problem no.1

//         Employee nikhil = new Employee();
//         nikhil.setName("Nikhil Malviya");
//         nikhil.salary = 300;
//         System.out.println(nikhil.getSalary());
//         System.out.println(nikhil.getName());
// //Problem no.2

//         cellphone realme = new cellphone();
//         realme.callfriend();
//         realme.Ringing();
//         realme.vibrating();

//Problem no.3
        //Square sq = new Square();
        //  sq.side = 6;
        // // sq.area();
        //  System.out.println(sq.side);
        //  System.out.println(sq.area());
        //  System.out.println(sq.perimeter());

//Problem no.4
            // Rectangle rec = new Rectangle();
            // rec.lenght = 2;
            // rec. breadth = 4;
            // System.out.println(rec.area());
            // System.out.println(rec.perimeter());

//Problem no.5
        //   rockstargames tommy = new rockstargames();    
        //   tommy.fire();
        //   tommy.hit();
        //   tommy.run();

//Problem no.6
            circle cir = new circle();
            cir.radius = 4;
            cir.pi = 3.14f;
            System.out.println(cir.area());
            System.out.println(cir.perimeter());
                    
              
    }
}
