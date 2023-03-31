package inputuser;

import outputmessage.OutputMessage;

import java.util.Scanner;

public class InputUser {
    private static Scanner scanner = new Scanner(System.in);

    private InputUser() {
    }

    public static int getInputInt() {
        int result = -1;
        scanner.nextInt();
        try {
            result = scanner.nextInt();
        } catch (Exception ex) {
            System.out.println(OutputMessage.ERRORE_INPUT + ex.getMessage());
        }
        return result;
    }

    public static String getInputLine() {
        String result = "";
        scanner.nextInt();
        try {
            result = scanner.nextLine();
        } catch (Exception ex) {
            System.out.println(OutputMessage.ERRORE_INPUT + ex.getMessage());
        }
        return result;
    }
}
