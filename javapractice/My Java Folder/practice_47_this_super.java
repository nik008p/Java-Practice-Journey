class Ekclass{
    int a;
     
      

    public Ekclass(int v) {
        this.a = v;
    }



    public int returnone() {
       return 1;
    }



    public int getA() {
        return a;
    }
    
}
class Doclass{
    Doclass(int x){
        super();
        System.out.println("Iam a constructor");
    
    }
}

public class practice_47_this_super {
    public static void main(String[] args) {
        Ekclass ek = new Ekclass(5);
        Doclass d = new Doclass(54);
        System.out.println(ek.getA());
    }
}
