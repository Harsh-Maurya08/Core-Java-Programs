class Book {
    static int totalBooks;
    String title;
    String Author;
    String isbn;
    static {
        totalBooks = 0;
    }
    {//Object initialise
        totalBooks++;
    }
    Book(String title,String author, String isbn){
        this.title = title;
        this.Author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    static int totalNoOfBooks(){
        return totalBooks;
    }

    boolean isBorrowed;

    void borrowBook() {
        if(isBorrowed)
            System.out.println("Already borrowed by someone please wait for return");
        else {
            System.out.println("The book is in library.");
            System.out.println("Enjoy the book.");
            totalBooks--;
            this.isBorrowed = true;
        }
    }
    void returnBook() {
        if(isBorrowed) {
            System.out.println("Hope you enjoyed the book.");
            totalBooks++;
            this.isBorrowed = false;
        }
        else
            System.out.println("Book is already in library.");
    }

    public static void main(String[] args){
        Book book1 = new Book("Harry Potter","some women","1");
        Book book2 = new Book("MCU","Stanli","2");
        System.out.println(totalNoOfBooks());
        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book1.returnBook();
        book2.borrowBook();
        book2.borrowBook();
        book2.returnBook();
        book2.returnBook();
    }

}