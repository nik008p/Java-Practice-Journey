public class practice_35ques_set {






    static void  multiplication(int n){
        for (int i = 1; i <=10; i++) {
            System.out.format("%d X %d = %d\n",n, i, n*i );
            
        }
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static int sumrect(int n ){
        if (n==1) {
            return 1;
            
        }
        return n + sumrect(n-1);
    }
    static void pattern2(int n ){
        for (int i = 0; i <n; i++) {
            for (int j = n; j >i+1; j--) {
                System.out.print("*");
                
           }
            System.out.println();
            
        }
    }
    static void Fibonacci(int n ){
        int n1 = 0, n2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(n1 + " ");

         int n3 = n1+n2;
         n1 = n2;
         n2 = n3;
        }
        System.out.println();
    }
   static int average(int ...arr){
    if (arr.length == 0) {
        return 0;
        
    }
    int result = 0;
    for (int i : arr) {
      result += i;
        
    }
    return result / arr.length;
   }
//    static void Pattern1_rec(int n){
   
//      if (n>0) {
//         Pattern1_rec(n-1);
//         for (int i = 0; i <n; i++) {
//             System.out.print("*");
            
//         }
//         System.out.println();
        
//      }
//    }
   static void Pattern2_rec(int n){
    if (n>0) {
        Pattern2_rec(n+1);
        for (int i = 0; i <n; i++) {
           System.out.println("*");
        }
    }
    System.out.println();
           
    }
    static void convertTofahrenheit(int n){
       int fahrenheit = (n * 9/5)+32;
       System.out.println(n + "'c = "+fahrenheit+"'F");
    
    }
    public static void main(String[] args) {
        //Problem no. 1
      //  multiplication(8);

        //Problem no. 2
       // pattern1(4);

       //Problem no. 3

        // int c = sumrect(3);
        // System.out.println(c);

         //Problem no. 4
         //pattern2(5);

         // Problem no. 5
        //   int N = 10; 
        //   Fibonacci(N);
         
        //Problem no. 6
        // System.out.println(average(78,98,91,70,81));

        //Problem no. 7
        //Pattern1_rec(7); 

        //Problem no. 8
       // Pattern2_rec(5);

       //Problem no. 9
       convertTofahrenheit(41);
       

   }
}
