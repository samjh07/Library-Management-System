package main;

import java.util.Scanner;

import model.Book;
import service.LibraryService;
import util.ConsoleUtil;
import util.InputValidator;

public class Menu {

    private LibraryService library;
    private Scanner sc;

    public Menu() {
        library = new LibraryService();
        sc = new Scanner(System.in);
    }

    public void start() {

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println(" LIBRARY MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.print("\nEnter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    updateBook();
                    break;

                case 5:
                    deleteBook();
                    break;

                case 6:
                    issueBook();
                    break;

                case 7:
                    returnBook();
                    break;

                case 8:
                    library.saveData();
                    System.out.println("\nData Saved Successfully.");
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("\nInvalid Choice.");

            }

        } while (choice != 8);

        sc.close();
    }

    // ===========================
    // Add Book
    // ===========================

    private void addBook() {

        System.out.print("Enter Title : ");
        String title = sc.nextLine();

        if (!InputValidator.isValidText(title)) {
            ConsoleUtil.error("Title cannot be empty.");
            return;
        }

        System.out.print("Enter Author : ");
        String author = sc.nextLine();

        if (!InputValidator.isValidText(author)) {
            ConsoleUtil.error("Author cannot be empty.");
            return;
        }

        System.out.print("Enter Category : ");
        String category = sc.nextLine();

        if (!InputValidator.isValidText(category)) {
            ConsoleUtil.error("Category cannot be empty.");
            return;
        }

        library.addBook(title, author, category);
    }

    // ===========================
    // Search
    // ===========================

    private void searchBook() {

        System.out.print("Enter Book ID : ");
        String id = sc.nextLine();

        Book book = library.searchBook(id);

        if (book == null)
            System.out.println("Book Not Found.");
        else
            System.out.println(book);
    }

    // ===========================
    // Update
    // ===========================

    private void updateBook() {

        System.out.print("Enter Book ID : ");
        String id = sc.nextLine();

        System.out.print("New Title : ");
        String title = sc.nextLine();

        System.out.print("New Author : ");
        String author = sc.nextLine();

        System.out.print("New Category : ");
        String category = sc.nextLine();

        library.updateBook(id, title, author, category);
    }

    // ===========================
    // Delete
    // ===========================

    private void deleteBook() {

        System.out.print("Enter Book ID : ");
        String id = sc.nextLine();

        library.deleteBook(id);
    }

    // ===========================
    // Issue
    // ===========================

    private void issueBook() {

        System.out.print("Enter Book ID : ");
        String id = sc.nextLine();

        System.out.print("Member Name : ");
        String member = sc.nextLine();

        library.issueBook(id, member);
    }

    // ===========================
    // Return
    // ===========================

    private void returnBook() {

        System.out.print("Enter Book ID : ");
        String id = sc.nextLine();

        library.returnBook(id);
    }
}