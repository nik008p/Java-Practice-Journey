interface  Camera {
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
    interface  wifi {
     String[] getNetwork();
     void connectTONetwork(String network);
}
class MycelPhone{
    void callNumber( int phoneNumber){
        System.out.println("Calling"+ phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting...");
    }
    // void takesnap(){
    //     System.out.println("Taking snap");
    // }
}
class Mysmartphone extends MycelPhone implements wifi,Camera{
    public void takeSnap(){
        System.out.println("taking the snap...");
    }
    public void recordVideo(){
        System.out.println("recording the snap");
    }
    //  public void record4kVideo(){
    //     System.out.println("taking snap and recording the 4k video...");
    // }
    public String[] getNetwork(){
        System.out.println("Getting the list of the network");
        String[] networklist = {"data nahi milega", "kya re bhik maangyea","realme five G","oneplus"};
        return networklist;
    }
    public void connectTONetwork(String network){
        System.out.println("Connecting to "+ network);
    }
}
public class practice_54_DefaultMethods_interfaces {
    public static void main(String[] args) {
        Mysmartphone ph = new Mysmartphone();
        ph.record4kVideo();
      //  ph.greet(); ==> throw error
        String[] ar = ph.getNetwork();
        for (String element : ar) {
            System.out.println(element);   
        }  
    }
}
