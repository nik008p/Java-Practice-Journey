class Employee{
    int id;
    String name;
    int salary;
    public void printdetials(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name );
        System.out.println("My salary is"+ salary);
    }
}
public class javarevise19 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee nikhil = new Employee();
        Employee arpit = new Employee();

        nikhil.id =12;
        nikhil.name = "NIKHIL MALVIYA";
        nikhil.salary = 24000;
        nikhil.printdetials();
        arpit.id =1;
        arpit.salary = 25000;
        arpit.name = "ARPIT PRAJAPATI";
        arpit.printdetials();
    }
}
