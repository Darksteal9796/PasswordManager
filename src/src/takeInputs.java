import java.util.Scanner;

public class takeInputs {

    public static String takeInput() {
        Scanner scanner = new Scanner(System.in);
        String appName;
        System.out.print("Please enter the website name = ");
        appName = scanner.nextLine();

        System.out.print("Please enter your password = ");
        String password = scanner.nextLine();

        return appName + "," + password;
    }
}