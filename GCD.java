import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int input1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int input2 = sc.nextInt();

        int a = input1;
        int b = input2;

        // Euclidean algorithm to find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);

        sc.close();
    }
}