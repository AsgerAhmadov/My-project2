//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User("Esger","Novruzov",400.0);
        Library.checkBalance(5,user);
      Library library = new Library(); // max kitab tutumu 10 olacaq...

      library.addBoook(new Book(4,"Qirmizi-kitab","Esger",true,15.5));
       library.addBoookCheck(new Book(5,"Qirmizi-kib","Esr",true));


        // library.updateBookStatus(4,true);
        //library.deleteBook(4);
//        library.borrowBook();
       // library.showBook();
       // library.updatestatus(4);
//        library.findById(4);
        //library.findByTitle("qirmizi-kitab");

    }
}