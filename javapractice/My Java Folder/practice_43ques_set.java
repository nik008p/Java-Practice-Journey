import java.util.Random;
import java.util.Scanner;
class game {
    private int numbertoguess;
    public game(){
        Random ra = new Random();
        int numbertoguess = ra.nextInt(1,100);
    }
    public boolean checkguess(int userguess){
        return userguess == numbertoguess;
    }
    public int getnumbertoguess(){
        return numbertoguess;
    }
    
   
}  


public class practice_43ques_set {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        game player = new game();

        System.out.println("guess the the no. between 1 to 100");
       int userguess = sc.nextInt();

       if (player.checkguess(userguess)) {
        System.out.println("you won the number is correct");
        
       }else{
          System.out.println("it not the correct guess");
       }
       
    
    }
}

