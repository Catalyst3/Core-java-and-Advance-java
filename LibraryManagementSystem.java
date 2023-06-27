package ExceptionHandlingExamples;

import java.util.Scanner;

class UnderAgeBorrowException extends Exception {
    public UnderAgeBorrowException(String msg) {
        super(msg);
    }
}

class BookUnavailableException extends Exception {
    public BookUnavailableException(String msg) {
        super(msg);
    }
}

class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private boolean isBorrowed;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book1 = new Book("Atomic Habits", "James Clear", 1999);
        Book book2 = new Book("How To Win Friends And Influence People", "Dale Carnegie", 1998);
        Book book3 = new Book("Science of Water", "Aditya Sawant", 2019);

        System.out.println("Enter your Name: ");
        String userName = sc.nextLine();

        System.out.println("Enter your Age: ");
        int userAge = sc.nextInt();

        try {
            borrowBook(book1, userAge);
            borrowBook(book2, userAge);
            borrowBook(book3, userAge);
        } catch (UnderAgeBorrowException | BookUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void borrowBook(Book book, int age) throws UnderAgeBorrowException, BookUnavailableException {
        if (age < 16) {
            throw new UnderAgeBorrowException("You are underage to borrow a book.");
        }

        if (book.isBorrowed()) {
            throw new BookUnavailableException(book.getTitle() + " is already borrowed.");
        }

        book.setBorrowed(true);
        System.out.println("Book " + book.getTitle() + " borrowed successfully.");
    }
}
