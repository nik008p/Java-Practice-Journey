public class javarevise17 {
    static int factorial(int n ){
        // factorial(5) = 5*4*3*2*1;
        if( n==0 || n==1){
                return 1;
        }else{
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n ){
        // factorial(5) = 5*4*3*2*1;
        if( n==0 || n==1){
                return 1;
        }else{
          int product = 1;
          for (int i = 1; i <=n ; i++) {
            product *= i;
            
          }
        return product;
        }
        
    }
    public static void main(String[] args) {
        int x = 9;
        System.out.println("the value of the factorial n is " + factorial(x));
        System.out.println("the value of the factorial n is " + factorial_iterative(x));
        
    }
}
