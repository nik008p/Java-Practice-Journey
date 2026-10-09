public class javarevise18 {
//     static void multiplication(int n){
//         for (int i = 1; i <= 10; i++) {
//             System.out.format("%d X %d = %d\n",n, i, n*i);
//         }
//     }
// static void pattern1(int n){
//     for (int i = 0; i<n; i++) {
//         for (int j = 0; j <i+1; j++) {
            
//             System.out.print("*");
//         }
//         System.out.println();
        
//     }
// }
// static int sumRect(int n ){
//     if (n==1){
//         return 1;
//     }
//     return n + sumRect(n-1);
// }
// static void pattern2(int n){
//     for (int i = 0; i<n; i++) {
//         for (int j = 0; j <n-i; j++) {
            
//             System.out.print("*");
//         }
//         System.out.println();
        
//     }
// }
// static int  fib(int n ){
//     // if(n==1){
//     //     return 0;
//     // }
//     // else if (n==2) {
//     //     return 1;
//     // }
//     if( n==1 || n==2){
//         return n-1;
//     }

//     else {
//         return fib(n-1) + fib(n-2);
//     }
// }
static int sum(int ...arr){
    int result =0;
    for (int a : arr) {
        result += a;
    }
     return result/arr.length;
}
//  double average = result / arr.length;
static void pattern_rec(int n ){
    if (n > 0) {
        pattern_rec(n-1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
static void pattern2_rec(int n ){
     if (n > 0) {
         for (int i = 0; i < n; i++) {
             System.out.print("*");
            }
            System.out.println();
            pattern2_rec(n-1);
    }
}

    
    public static void main(String[] args) {
        // pr blem 1
        // multiplication(7);

        // Problem no 2
        // pattern1(4);

        // problem no. 3
        // int c = sumRect(3); 
        // System.out.println(c);

        // problem no. 4
        // pattern2(4);

        // Problem no. 5
        // fibonaaci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        //    int result = fib(5);
        //    System.out.println(result);

        // Problem no. 6
        // System.out.println(sum(4, 5, 6, 3, 9));

        // Problem no. 7
        // pattern_rec(2);

        // problem no, 8
        pattern2_rec(5);
        
    }
}

