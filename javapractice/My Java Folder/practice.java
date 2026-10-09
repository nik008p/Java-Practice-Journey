import java.util.Scanner;;

public class practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int r = sc.nextInt();
        int L = sc.nextInt();

        if (t==r ||  r==L||L==t ) {
            System.out.println("euilateral");
            
        }else if (t<r && r<L && L>t) {
            System.out.println("scalene triangel"); 
        }else {
            System.out.println("not a scalnene triangle");
        }
        
        
    }
}
