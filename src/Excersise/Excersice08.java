package Excersise;

public class Excersice08 {
    public static void main(String[] args) {
        String originalString = "   Hello, world!   ";
        String trimmedString = trimmedSpaces(originalString);
        System.out.println("Original String: \"" + originalString + "\"");
        System.out.println("Trimmed String: \"" + trimmedString + "\"");
    }

    public static String trimmedSpaces(String input) {
        if (input == null) {
            return null;
        }
        return input.trim();
    }
}
