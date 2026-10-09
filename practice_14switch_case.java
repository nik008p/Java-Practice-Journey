import java.util.Scanner;

public class practice_14switch_case {
    public static void main(String[] args) { 
       String var = "Nikhil" ;


       switch (var) {
        case "anshul" :
            System.out.println("you are to become an adult");
            break;
            case "piyush": 
            System.out.println("you are going to find a job");
            break;
            case "arpit":
            System.out.println("you've done enough.\n Take some rest");
       
        default:
        System.out.println("enjoy your life");
            
       }
       System.out.println("Thanks for everything you've done");




/*
      int age = 56;
       System.out.println("Enter your age");
       Scanner sc = new Scanner(System.in);
       age = sc.nextInt();

 
       if (age>56) {
        System.out.println("So,\n How's your's journey ");
        
       }
       else if (age>46 ) {
        System.out.println("So , are in the mid what's next");
        
       }
       else{
        System.out.println("you are just about to start,\n good luck ");
       }
       if (age>2) {
        System.out.println("you are not a baby");
        
     }
       */
      
       
    }
}
