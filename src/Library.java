public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int capacity){
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(String title, String author){
        if (bookCount < bookCount){
            Book newBook = new Book(title, author);
            books[bookCount] = newBook;
            bookCount++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("The library is full. cannot add more books.");
        }
    }

    public void listBooks(){
        if (bookCount == 0){
            System.out.println("No books available in the library.");
        } else {
            for (int i = 0; i < bookCount; i++){
                books[i].displayInfo();
            }
        }
    }

    public void borrowBook(String title){
        for (int i = 0; i < bookCount; i++){
            if (books[i].getTitle().equalsIgnoreCase(title)){
                if (!books[i].isAvailable()){
                    books[i].setAvailable(false);
                    System.out.println("Book borrowed successfully: " + title);
                } else {
                    System.out.println("The book is not available at the moment.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title){
        for (int i = 0; i < bookCount; i++){
            if (books[i].getTitle().equalsIgnoreCase(title)){
                if (!books[i].isAvailable()){
                    books[i].setAvailable(true);
                    System.out.println("Book returned successfully: " + title);
                } else {
                    System.out.println("This book is already available.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

