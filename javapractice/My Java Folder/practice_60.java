class MyThread extends Thread{
    public void run(){
       int i = 0;
        while (i<40) {
        System.out.println("My cooking Thread is running");
        System.out.println("i am Happy!");
        i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while (i<40){
        System.out.println(" Thread2 is chating with her ");
        System.out.println("i am Sad!");
        i++;
        }
    }
}
public class practice_60 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread2 t2 = new MyThread2();
        t.start();
        t2.start();

        
    }
}
