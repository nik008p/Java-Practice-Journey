public class javarevise03 {
    public static void main(String[] args) {
        // casting
        double price = 100.00;
        double finalprice = price + 18;

        System.out.println(finalprice);

        int p = 100;
        int fp = p + (int) 18.0;
        System.out.println(fp);

        // constants
        int age = 30;
        age = 31;
        age = 32;

        final float PI = 3.14F;

        // operators
        double a = 5;
        double b = 3;
        double modulo = a % b;
        System.out.println(modulo);


        int numb = 1;
        
        System.out.println(numb++);
        System.out.println(numb);
        System.out.println(++numb);
        System.out.println(numb);
        System.out.println(--numb);
        System.out.println(numb--);
        System.out.println(numb);


        // Maths
        // 5, 6
        System.out.println(Math.max(5, 6));
        System.out.println(Math.min(5, 6));
        System.out.println((int)(Math.random()*100));




    }
}
