import java.util.Scanner;

public class Demo {

    //static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int minimum = getMin(3,5);
        System.out.println(minimum);
    }

    static void printHeader() {
        System.out.println("***************");
        System.out.println("*    Hallo    *");
        System.out.println("***************");
    }

    static int getMin(int a, int b) {
        int min = a;
        if (b < a) {
            min = b;
        }
        return min;
    }

}
