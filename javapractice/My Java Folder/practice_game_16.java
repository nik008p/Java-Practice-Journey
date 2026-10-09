import java.util.Random;
import java.util.Scanner;

public class practice_game_16 {

    public static void main(String[] args) {

        System.out.println("Enter the numer 1 to 3");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Your's number"+number);

        switch (number) {
            case 1 -> System.out.println("Rock");
            case 2 -> System.out.println("Paper");
            case 3 -> System.out.println("Scissor");
            
        }

        Random ran = new Random();
        int system = ran.nextInt(1,3);
        System.out.println("system's number"+system);

        switch (system) {
            case 1 -> System.out.println("Rock");
            case 2 -> System.out.println("Paper");
            case 3 -> System.out.println("Scissor");
            
        }

        if (number == 1 && system == 1 || number == 2 && system == 2 || number == 3 && system == 3) {
            System.out.println("TIE");  
        }
        else if (number == 1 && system == 2) {
            System.out.println("system win's");
            
        }
        else if (number == 1 && system == 3) {
            System.out.println("You win's");
        
        }
        else if (number == 2 && system == 1) {
            System.out.println("You win's");
        }
        else if (number == 2 && system == 3) {
            System.out.println("system win's");
        }
        else if (number == 3 && system == 1) {
            System.out.println("system win's");
        }
        else if (number == 3 && system == 2) {
            System.out.println("You win's");
        }

    }

}