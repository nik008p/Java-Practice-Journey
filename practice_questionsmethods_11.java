import java.util.Scanner;

public class practice_questionsmethods_11 {
    public static void main(String[] args) {
        String name = "TRIP TO LADDAK";


        //question no. 1;
        System.out.println(name.toLowerCase());

        //Question no.2;
        String dream = "travelling around the world";
        System.out.println(dream.replace( " " , "_"));

        //question no.3;
        String names = "Dear <|name|>,Thanks a lot";
        System.out.println(names.replace("<|name|>"," mountaines"));

        //Questions no. 4;
        String space = "nikhil";
        System.out.println(space.indexOf(" "));
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));

        //Question no. 5;
        String hiking = "Dear Piyush and Arpit ,\n\t This hiking is mind blowing i never enjoy this kind of things,\n \tThanks a lot brother!";
        System.out.println(hiking);



        
    }
}
