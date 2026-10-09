public class javarevise05 {
    public static void main(String[] args) {
        // Comparison Operators
        // a == b 
        // a != b
        // a < b
        // a > b
        // a <= b
        // a >= b

        // Conditionals stt
        boolean isSunUp = false;
        if(isSunUp == true)
        System.out.println("day");
    else 
        System.out.println("Night");

    int age = 3;
    if(age > 18)
        System.out.println("can vote");
    else
        System.out.println("can't vote");

    // logical operators 
    // &&
    int a = 30;
    int b = 400;

    if(a < 50 && b <50)
        System.out.println("both less than 50");
    else 
        System.out.println("error");

    // logical or
    if( a > 50 || b > 50)
        System.out.println("atleast one less than 50");

    boolean isAAdult = false;
    if(!isAAdult)
        System.out.println("is adult");
    else
        System.out.println("not adult");

    }
}
