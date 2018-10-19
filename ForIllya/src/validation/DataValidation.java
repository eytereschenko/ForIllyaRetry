package validation;

public class DataValidation {

    public static boolean validate(StringBuilder sb1, char charItem) {
        if (sb1 == null || sb1.toString().length() < 2) {
            return true;
        }

        String text = sb1.toString();

        if (text.charAt(text.length() - 1) != text.charAt(text.length() - 2) ||
                text.charAt(text.length() - 1) != charItem) {
            return true;
        }

        return false;
    }

    public static boolean validatePossibility(int a, int b) {

        if (a * 2 + 2 < b || b * 2 + 2 < a || a < 0 || b < 0) {
            return false;
        }

        return true;
    }

}
