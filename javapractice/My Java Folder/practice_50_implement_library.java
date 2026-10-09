import javax.swing.Box;

class Library{

    public void issueBook(){
        System.out.println("this is the list of the book ");
    
        
    }
   public String availableBook(String Books ){
    System.out.println("These books are only available");
    return Books;

   }
   public void returnBook(String name){
    System.out.println("Fill the Entry of returning the book");
   } 
   public String[] selectBook(){
     String [] books = new String[5];
        books[0] = " harry potter";
        books[1] = " myterious island";
        books[2] = " murder case";
        books[3] = " unsolved";
        books[4] = " animations";
        return books;
   } 
   public void printarray(){
    String [] books = selectBook();
    for (String string : books) {
        System.out.println(books);
        
    }
   } 
   
}



public class practice_50_implement_library {
    public static void main(String[] args) {
       Library l = new Library();
        l.printarray();
       }
    


        
    }

