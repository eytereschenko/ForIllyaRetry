package exceptions;

public class PosibilitiException extends Exception {
    public PosibilitiException(String incorrect_values_detected) {
        System.out.println(incorrect_values_detected);
    }
}
