import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int binary[] = new int[32];
        int i = 0;

        while (num > 0) {
            binary[i] = num % 2;  // Get remainder (0 or 1)
            num = num / 2;        // Divide number by 2
            i++;
        }

        System.out.print("Binary value: ");

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }

        sc.close();
    }
}