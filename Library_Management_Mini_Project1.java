// Mini Project: Library Management System (OOP)
class Book {
    String bookName;
    boolean isAvailable = true;
}

class User {
    String userName;
}

class Library {
    Book book = new Book();

    void addBook(String name) {
        book.bookName = name;
        System.out.println("Book Added: " + name);
    }

    void borrowBook() {
        if (book.isAvailable) {
            book.isAvailable = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Book Not Available");
        }
    }

    void returnBook() {
        book.isAvailable = true;
        System.out.println("Book Returned");
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Java Basics");
        lib.borrowBook();
        lib.returnBook();
    }
}
