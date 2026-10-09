interface  MyCamera {
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        greet();
        System.out.println("recording in 4k..");   
    }
    private void greet(){
        System.out.println("Good morning");
    }

}
    interface  Mywifi {
     String[] getNetwork();
     void connectTONetwork(String network);
}
class MycelPhone2{
    void callNumber( int phoneNumber){
        System.out.println("Calling"+ phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting...");
    }
    void takesnap(){
        System.out.println("Taking snap");
    }
   
}
class Mysmartphone extends MycelPhone2 implements Mywifi,MyCamera{
    public void takeSnap(){
        System.out.println("taking the snap...");
    }
    public void recordVideo(){
        System.out.println("recording the snap");
    }
     public String[] getNetwork(){
        System.out.println("Getting the list of the network");
        String[] networklist = {"data nahi milega", "kya re bhik maangyea","realme five G","oneplus"};
        return networklist;
    }
    public void connectTONetwork(String network){
        System.out.println("Connecting to "+ network);
    }
}
public class practice_56_PolymorphismIn_inheritance {

    public static void main(String[] args) {
       MyCamera cam = new Mysmartphone();
       cam.record4kVideo();
       cam.recordVideo();
       cam.takeSnap();
      // cam.getNetwork(); // not allowed in interface u can only use of which refrence u make but in inheritance you can because sub has all method of parent class
    }
}