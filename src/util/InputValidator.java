package util;

public class InputValidator {

    private InputValidator() {

    }

    public static boolean isValidText(String text) {
        return text != null && !text.trim().isEmpty();
    }

    public static boolean isValidBookId(String id) {
        return id.matches("BOOK\\d+");
    }
}