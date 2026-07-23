package util;

public class BookIdGenerator {

    private static int currentId = 1000;

    private BookIdGenerator() {

    }

    public static String generateBookId() {
        currentId++;
        return "BOOK" + currentId;
    }

    public static void setCurrentId(int id) {
        if (id > currentId) {
            currentId = id;
        }
    }
}