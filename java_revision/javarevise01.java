public class javarevise01 {

    public static void main(String[] args) {
        // System.out.println("hello world");
        // Variables
        String name = "Aman";
        int age = 30;
        String neighbour = "Akku";

        String friend = neighbour;
        //  java types
        //  1 primitive type
        // byte - 1 [-128 to 127]
        // short - 2
        // int - 4
        // long - 8
        // float - 4 3.14
        // double - 8
        // char - 2 a,b,c,d
        // boolean - 1 true/false

        // Examples
         byte age2 = 30;
         int phone = 1234567890;
         long phone2 = 12345678900l;
         float pi  = 3.14F;
         char letter = '@';
         boolean isadult = true;

        //  Non-primitive types
        // Strings
        String name2 = "Aman";
        System.out.println(name.length());

        // concatenate
        String name1 = "Aman";
        String name3 = "Akku";
        String name4 = name1+" and "+name3;
        System.out.println(name4);
        // charAt
        String name5 = "Aman";
        System.out.println(name.charAt(1));
        System.out.println(name.length());
         String name6 = name.replace('a', 'b');
         System.out.println(name6);
         System.out.println(name5);

        //  substring
        String name7 = "Aman and akku";
        System.out.println(name.substring(0,4));


    }
}
