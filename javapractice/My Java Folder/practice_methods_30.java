public class practice_methods_30 {
   
    static int logic(int x, int y){
        int z;
        if (x>y) {
            z = x+y;
            
        }else{
            z = (x+ y ) * 5;
        }
        return z;
    }
    
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = logic(a,b);
        // Method inocation using Object       // type foe calling operation seperately for the function 
    //    practice_methods_30 obj = new practice_methods_30();
    //      c = obj.logic(a,b);
        // int c2= logic(a, b);
        System.out.println(c);
        int a1 = 6;
        int b1 = 2;
        int c1 = logic(a1, b1);
        System.out.println(c1);

       


    }
    
}
