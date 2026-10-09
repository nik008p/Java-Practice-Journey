public class practice_33var_args {
 
    // static int sum(int a,int b){
    //     return a+b;
    // }
    //  static int sum(int a,int b,int c){
    //     return a+b+c;
    //  }
    static int sum(int ...arr){
      int result = 0;
      for (int i : arr) {
        result += i;
        
      }
      return result;
    }
        public static void main(String[] args) {
          System.out.println(sum(12,23,23,34,54));
    
  
  
        
    }
  }


