public class javarevise14 {
    static void foo(){
        System.out.println("Good morning bro");
    }
     static void foo(int a){
        System.out.println("Good morning " + a + "bro!");
    }
    

    // static void change(int a){
    //     a = 98;
    // }
    //  static void change2(int[] arr){
    //     arr[0] = 98;
    // }
    // static void telljoke(){
    //      System.out.println(" I invented a new word!\n" +
    //      "playgarism!");
    // }
    public static void main(String[] args) {
        // telljoke(); 
        // case 1 changing tthe integer
        //     int x = 45;
        //     change(x);
        //     System.out.println("The value of x after running change is - " x);
        // case 2 changing the array
        // int [] marks = {52, 56, 67, 87, 94, 60};
        // change2(marks);
        // System.out.println("The value of x after running change is -  " + marks[0]);

        //  method overloading
        foo();
        foo(3000);

    }
    
}
