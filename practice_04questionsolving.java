import java.util.Scanner;


public class practice_04questionsolving {
     
    public static void main(String[] args) {
        float total = 0;
        Scanner sc = new Scanner(System.in);
        int total_marks = sc.nextInt();
    
       System.out.println("sub 1");
        float subject1 = sc.nextInt();
        total = total + subject1;
       System.out.println("sub 2");
       float subject2 = sc.nextInt();
       total = total + subject2;
       System.out.println("sub 3");
       float subject3 = sc.nextInt();
       total = total + subject3;
       System.out.println("sub 4");
       float subject4 = sc.nextInt();
       total = total + subject4;
       System.out.println("sub 5");
       float subject5 = sc.nextInt();
       total = total + subject5;
       float grandtotal = total*100 / (total_marks*5);
      
       System.out.println("percentage="+grandtotal+"%");

        
    }
}
