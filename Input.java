import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    static String readString() {
        String string = scanner.nextLine();

        return string;
    }

    static int readInt() {
        String string = readString();
        int integer = Integer.parseInt(string);

        return integer;
    }

    static void close() {
        scanner.close();
    }
}
