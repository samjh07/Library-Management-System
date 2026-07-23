package service;

import util.FileManager;
import util.InputValidator;

import java.util.Collections;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import util.BookIdGenerator;
import util.ConsoleUtil;

public class LibraryService {

    private List<Book> books;

    public LibraryService() {
        books = FileManager.loadBooks();
    }

    // =============================
    // Add Book
    // =============================
    public void addBook(String title, String author, String category) {

        if (!InputValidator.isValidText(title)) {
            ConsoleUtil.error("Title cannot be empty.");
            return;
        }

        if (!InputValidator.isValidText(author)) {
            ConsoleUtil.error("Author cannot be empty.");
            return;
        }

        if (!InputValidator.isValidText(category)) {
            ConsoleUtil.error("Category cannot be empty.");
            return;
        }

        if (bookExists(title, author)) {
            ConsoleUtil.error("Book already exists.");
            return;
        }

        String bookId = BookIdGenerator.generateBookId();

        Book book = new Book(bookId, title, author, category);

        books.add(book);

        ConsoleUtil.success("Book Added Successfully.");
        System.out.println("Book ID : " + bookId);
    }

    // =============================
    // Display All Books
    // =============================
    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("\nNo Books Available.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    // =============================
    // Search Book
    // =============================
    public Book searchBook(String bookId) {

        for (Book book : books) {

            if (book.getBookId().equalsIgnoreCase(bookId)) {
                return book;
            }

        }   

        return null;
    }

    // =============================
    // Update Book
    // =============================
    public void updateBook(String bookId,
                           String title,
                           String author,
                           String category) {

        Book book = searchBook(bookId);

        if (book == null) {

            System.out.println("\nBook Not Found.");

            return;
        }

        book.setTitle(title);
        book.setAuthor(author);
        book.setCategory(category);

        System.out.println("\nBook Updated Successfully.");
    }

    // =============================
    // Delete Book
    // =============================
    public void deleteBook(String bookId) {

        Book book = searchBook(bookId);

        if (book == null) {

            System.out.println("\nBook Not Found.");

            return;
        }

        books.remove(book);

        System.out.println("\nBook Deleted Successfully.");
    }
    
    // =============================
    // Issue Book
    // =============================
    public void issueBook(String bookId, String memberName) {

        Book book = searchBook(bookId);

        if (book == null) {
            System.out.println("\nBook Not Found.");
            return;
        }

        if (book.isIssued()) {
            System.out.println("\nBook is already issued.");
            return;
        }

        book.setIssued(true);
        book.setIssuedTo(memberName);

        System.out.println("\nBook Issued Successfully.");
    }

    // =============================
    // Return Book
    // =============================
    public void returnBook(String bookId) {

        Book book = searchBook(bookId);

        if (book == null) {
            System.out.println("\nBook Not Found.");
            return;
        }

        if (!book.isIssued()) {
            System.out.println("\nBook is already available.");
            return;
        }

        book.setIssued(false);
        book.setIssuedTo("");

        System.out.println("\nBook Returned Successfully.");
    }

    // =========================
    // Save Data
    // =========================

    public void saveData() {

        FileManager.saveBooks(books);

    }

    // =============================
    // Search Book by Title
    // =============================
    public void searchBookByTitle(String title) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                System.out.println(book);
                found = true;

            }

        }

        if (!found) {
            System.out.println("\nNo Book Found.");
        }

    }

    // =============================
    // Search Book by Author
    // =============================
    public void searchBookByAuthor(String author) {

        boolean found = false;

        for (Book book : books) {

            if (book.getAuthor().equalsIgnoreCase(author)) {

                System.out.println(book);
                found = true;

            }

        }

        if (!found) {
            System.out.println("\nNo Book Found.");
        }

    }

    // =============================
    // Search Book by Category
    // =============================
    public void searchBookByCategory(String category) {

        boolean found = false;

        for (Book book : books) {

            if (book.getCategory().equalsIgnoreCase(category)) {

                System.out.println(book);
                found = true;

            }

        }

        if (!found) {
            System.out.println("\nNo Book Found.");
        }

    }

    // =============================
    // Library Statistics
    // =============================
    public void showStatistics() {

        int available = 0;
        int issued = 0;

        for (Book book : books) {

            if (book.isIssued())
                issued++;
            else
                available++;

        }

        System.out.println("\n========== LIBRARY STATISTICS ==========");
        System.out.println("Total Books      : " + books.size());
        System.out.println("Available Books  : " + available);
        System.out.println("Issued Books     : " + issued);
    }

    // =============================
    // Sort Books by Title
    // =============================
    public void sortBooksByTitle() {

        Collections.sort(books, Comparator.comparing(Book::getTitle));

        System.out.println("\nBooks Sorted by Title.");

        displayBooks();

    }

    // =============================
    // Check Duplicate Book
    // =============================
    private boolean bookExists(String title, String author) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {

                return true;
            }

        }

        return false;
    }
}