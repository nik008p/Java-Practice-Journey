 class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
    System.out.println("my id is "+ id);
    System.out.println("my name is "+ name);
    }

public int  getSalary(){
    
return salary;
}
}

public class practice_38_custume_class {
   
    public static void main(String[] args) {
        System.out.println("This is our custume class");
        Employee nikhil = new Employee();
        Employee arpit = new Employee();
        nikhil.id = 20;
        nikhil.name = "Nikhil Malviya";
      //  nikhil.salary = 45;
        arpit.id = 19;
        arpit.name = "Arpit Prajapati";
        arpit.salary = 40;
        // System.out.println(nikhil.id);
        // System.out.println(nikhil.name);
        nikhil.printDetails();
        arpit.printDetails();
        int salary = arpit.getSalary();
        System.out.println(salary);

       //OOP's is Started !!!!....... BOOM!!..
    }
}
