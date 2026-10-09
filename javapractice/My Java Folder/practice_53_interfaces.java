 interface Bicycle {
    int a = 40;
     void applybreak(int decrement);     
     void speedup(int increment);
}
interface HornBicycle{
    int a = 45;
    void  songHorn();     
     void onlyHorn();
}
class avoncycle implements Bicycle,HornBicycle{
    void blowhorn(){
        System.out.println("jhaldi waha se hato!!!....");
    }
    public void applybreak(int decremnet){
        System.out.println("Applying break");
    }
    public void speedup(int increment){
        System.out.println("Applying speedup");
    }
    public void songHorn(){
        System.out.println("tujhe dekha toh yeh jaana sanam...");
    }
    public void onlyHorn(){
        System.out.println("poom poom......!!!");
    }

    }

public class practice_53_interfaces {
    public static void main(String[] args) {
        avoncycle cycle = new avoncycle();
        cycle.applybreak(12);
       // cycle.a = 45; // not allowed
       cycle.blowhorn();
       cycle.songHorn();
       cycle.onlyHorn();
        
        
    }
}
