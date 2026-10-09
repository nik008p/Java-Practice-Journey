import java.util.Scanner;

public class practice_15ques_set {
    public static void main(String[] args) {

        //  question no.1;

        // int a = 10;

        // if (a==10) {
        //     System.out.println(" i am 11");
            
        // }
        // else{
        //     System.out.println("i am not 11");
        // }

        //Question no.2;
/* 
        Scanner sc = new Scanner(System.in);
        System.out.println("maths");
        byte s1 = sc.nextByte();

        System.out.println("physics");
        byte s2 = sc.nextByte();

        System.out.println("chesmistry");
        byte s3 = sc.nextByte();

        float percentage = (s1+s2+s3)/3.0f;
        System.out.println("you total Prtecentage is "+percentage);

        if (percentage>=40 && s1>=33 && s2>=33 && s3 >=33 ) {
            System.out.println("Okay!,/nGreat you cract it nice");
        }
        else{
            System.out.println("that;s not it's not enough");
        }
*/

       //Question no.3;
              
              Scanner sc = new Scanner(System.in);
    
            //  System.out.println("Enter your Income ");
            //   float t1 =  0;
            //   long income = sc.nextLong();

            //  if (income>2.5f && income<=5f) {
            //     t1 = t1 + 0.05f *(income -2.5f );
                
            //  }
            //  else if (income<2.5f) {
            //     t1 = t1 + 0;
                
            //  }
            //  else if (income>5f && income<=10f) {
            //     t1 = t1 + 0.05f * (5f - 2.5f);
            //    t1 = t1 + 0.2f * (income - 5f);
                
            //  }
            //  else if (income>10f) {
            //     t1 = t1 + 0.05f * (5f - 2.5f);
            //     t1 = t1 + 0.2f * (10f - 2.5f);
            //     t1 = t1 + 0.3f * (income - 10f);
                
            //  }
            //  System.out.println("total tax payed by the employee = " +t1);                
             
               //Question No.4;
            //    Scanner sc = new Scanner(System.in);
            //    System.out.println("Enter the key");
            //    int d = sc.nextInt();
            //    switch (d) {
            //     case 1:
            //     System.out.println("monday");
                    
            //         break;
            //     case 2: 
            //     System.out.println("tuesday");

            //         break;
            //     case 3:
            //     System.out.println("wednesday");
                
            //         break;
            //     case 4:
            //     System.out.println("thursday");
                
            //         break;
            //     case 5:
            //         System.out.println("friday");
                    
            //          break;
            //     case 6:
            //     System.out.println("saturday");
                
            //         break;
            //     case 7:
            //         System.out.println("sunday");
                    
            //          break;        
               
            //     default:
            //         break;

                     //Same Question no.4 Different way;

                    //  Scanner sc = new Scanner(System.in);
                    //  System.out.println("Enter the day key number");
                    //  int day = sc.nextInt();

                    //  switch (day) {
                    //     case 1 -> System.out.println("Monday");
                    //     case 2 -> System.out.println("Tuesday");
                    //     case 3 -> System.out.println("Wednesday");
                    //     case 4 -> System.out.println("Thusrday");
                    //     case 5 -> System.out.println("Friday");
                    //     case 6 -> System.out.println("Saturday");
                    //     case 7 -> System.out.println("Subnday");
                    // }


                    //Question no. 5;
                // Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the year");
                int year = sc.nextInt();

                if (year%4==0) {
                     System.out.println("Leap Year");
                    
                 }
                else{
                     System.out.println("Not a leap year");
                 }


                //Question no.6;

                //Scanner sc = new Scanner(System.in);
                System.out.println("Enter your website address");
                String website = sc.next();

                if (website.endsWith(".org")) {
                    System.out.println("it's organized website");

                }
                else if (website.endsWith(".in")) {
                    System.out.println("it's indian website");
                    
                }
                else if (website.endsWith(".com")) {
                    System.out.println("it's a commercial website");
                    
                }
                    
                   
                    
                
        }

        
    }

