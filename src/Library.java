public class Library {
    private Book[] books;
    private String[] authors;
    private int bookCount;

    public Library(int capacity) { //100 - 101
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Kitab elave ugurla olundu...");
        } else {
            System.out.println("Kitabxana doludur , kitab elave ede bilmersiniz");
        }
    }

    public void bookList() {
        if (bookCount == 0)
            System.out.println("Kitab yoxdur...");
        else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i].toString());
            }
        }
    }

    public Book findById(int bookId) {
        for (int i = 0; i < bookCount; i++) {

            Book book = books[i];

            if (bookId == book.getId())
                return book;
        }
        return null;
    }

    public Book findByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {

            Book book = books[i];

            if (title.equalsIgnoreCase(book.getTitle()))
                return book;
        }
        return null;
    }

    public void updateBookStatus(int bookId, Boolean status) {
        Book foundBook =  findById(bookId);
        if (foundBook != null) {
            foundBook.setStatus(status); // true -> Active -- false -> DeActive
            System.out.println("Kitabin statusu yenilendi : " + foundBook.getStatus());
        } else {
            System.out.println(bookId + ": ID`li kitab tapilmadi...");
        }
    }

    // Ele metod yazin ki kitabxanadan kitab goturulsun ve statusu "Deactive" set olunsun...
    // kitabi silmek metodu olsun .... [10] -> primitive tipler ucun 0
    // non primitive -> null -> Integer , String , Book

    public void borrowBook(int bookId) {
       for (int i = 0; i < bookCount ;i++){
           Book book = findById(i);
           book.setStatus(false);
           System.out.println("bu kitab artiq goturulmusdur...");
       }



   }
// kitabi silmek metodu olsun
    public Book deleteBook(int bookId  ){
        Book findbook = findById(bookId);
        if (findbook != null) {
            findbook = null;
            System.out.println("kitab silindi...");
        }
        return findbook;
    }

    }

