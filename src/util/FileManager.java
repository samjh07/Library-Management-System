package util;

import model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private static final String FILE_NAME = "data/books.dat";

    // Save Books
    public static void saveBooks(List<Book> books) {

        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            out.writeObject(books);

            System.out.println("\nBooks Saved Successfully.");

        } catch (IOException e) {

            System.out.println("Error Saving File.");

        }

    }

    // Load Books
    @SuppressWarnings("unchecked")
    public static List<Book> loadBooks() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            return (List<Book>) in.readObject();

        } catch (Exception e) {

            return new ArrayList<>();
        }

    }

}