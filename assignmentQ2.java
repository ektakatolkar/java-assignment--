import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }

    void display() {
        System.out.println(title + " " + author + " " + isbn);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<Book>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                books.remove(b);
                break;
            }
        }
    }

    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        Library l = new Library();

        Book b1 = new Book("Java", "James", "101");
        Book b2 = new Book("Python", "Guido", "102");

        l.addBook(b1);
        l.addBook(b2);

        l.displayBooks();

        l.removeBook("101");

        l.displayBooks();
    }
}