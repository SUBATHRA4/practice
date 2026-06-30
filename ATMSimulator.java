import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int balance = 10000;

        System.out.print("Enter your 4 digit pin:- ");
        int pin = sc.nextInt();

        if (pin == correctPin) {

            System.out.println("Welcome");

            int choice;

            do {
                System.out.println("1.Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");

                System.out.print("Enter your choice (1/2/3/4): ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Your current balance is: " + balance);
                        break;

                    case 2:
                        System.out.print("Enter your withdraw amount:");
                        int withdraw = sc.nextInt();

                        if (withdraw <= balance) {
                            if (withdraw % 100 == 0) {
                                balance = balance - withdraw;
                                System.out.println("Withdraw successful");
                            } else {
                                System.out.println("Please enter valid amount");
                            }
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        break;

                    case 3:
                        System.out.print("Enter your Deposit amount:");
                        int deposit = sc.nextInt();

                        if (deposit % 100 == 0 && deposit < 40000) {
                            balance = balance + deposit;
                            System.out.println("Deposit successful");
                        } else {
                            System.out.println("Please enter valid amount");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Invalid Option");
                }

            } while (choice != 4);

        } else {
            System.out.println("Incorrect PIN. Access Denied");
        }

        sc.close();
    }
}