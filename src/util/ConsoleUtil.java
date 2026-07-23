package util;

public class ConsoleUtil {

    private ConsoleUtil() {

    }

    public static void printLine() {
        System.out.println("==========================================");
    }

    public static void printHeading(String heading) {
        printLine();
        System.out.println("        " + heading.toUpperCase());
        printLine();
    }

    public static void success(String message) {
        System.out.println("[SUCCESS] " + message);
    }

    public static void error(String message) {
        System.out.println("[ERROR] " + message);
    }
}