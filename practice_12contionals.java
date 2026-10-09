import java.util.Scanner;

public class practice_12contionals {
    public static void main(String[] args) {
        int age = 20;
        if(age>18){
            System.out.println("you can do thing  according to law");
        }
        else{
            System.out.println("if not you can not");
        }

        //type 2;
        float age2 = 18.1f;
        boolean cond = (age2==18.1f);
        if (cond) {
            System.out.println("you can do things like adults do ");
        }
        else{
            System.out.println("you can't youre are under age");
        }
        
    }
}
