public class practice_methods_overloading_32 {
    static void fo(){
        System.out.println("Good morning Chote!");
    }


    static void fo(int a){
        System.out.println("Good morning "+a+" Chote!");
    }


    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
        }
     static void telljoke(){
        System.out.println("I invented a new world \n"+
       "Plagiarism" );
    }
    public static void main(String[] args) {
        // telljoke();
        // case 1 Changing the integer
        // int x = 100;
        // change(x); 
        // System.out.println(x);
          //case 2 Changing the array
       
    //   int []  marks = {34,45,67,45,35};   
    //   change2(marks);
    //   System.out.println(marks);

    //Method Overloading
    fo();
    fo(69);
    }
    
}
