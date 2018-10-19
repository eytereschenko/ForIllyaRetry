package mainpackage;

import exceptions.PosibilitiException;
import java.util.Scanner;
import static validation.DataValidation.*;

public class StartButton {

    public static void main(String[] args) throws PosibilitiException {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter two ints:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (!validatePossibility(a, b)) {
                throw new PosibilitiException("incorrect values detected");
            } else {
                System.out.println("Result is :" + hardTask(a, b));
            }
        }

    }

    private static String hardTask(int a, int b) throws PosibilitiException {

        return hardTask(a, b, new StringBuilder());
    }

    private static String hardTask(int a, int b, StringBuilder sb1){

        if (a == 0 && b == 0) {
            return sb1.toString();
        }

        if (a > b) {
            if (validate(sb1, 'a')) {
                return hardTask(a - 1, b, sb1.append("a"));
            } else {
                return hardTask(a, b - 1, sb1.append("b"));
            }
        } else {
            if (validate(sb1, 'b')) {
                return hardTask(a, b - 1, sb1.append("b"));

            } else {
                return hardTask(a - 1, b, sb1.append("a"));
            }
        }

    }
}
