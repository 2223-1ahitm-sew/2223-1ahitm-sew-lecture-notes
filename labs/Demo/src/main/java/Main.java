import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String text = foo();
        System.out.println("-> " + text);

    }

    static String foo() {
        System.out.print("Text: ");
        return in.nextLine();
    }
}
