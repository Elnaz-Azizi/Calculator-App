package se.lexicon;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static int operation; // Declare operation outside main method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;

        do {
            displayMenu();
            System.out.println("Choose an operation:");
            int operation = scanner.nextInt();
            if (operation == 1) {
                int result = addition();
                System.out.println("result = " + result);
            } else if (operation == 2) {
                int result = subtraction();
                System.out.println("result: =" + result);
            } else if (operation == 3) {
                int result = multiplication();
                System.out.println("result: =" + result);
            } else if (operation == 4) {
                int result = division();
                System.out.println("result: =" + result);
            } else if (operation == 5) {
                System.out.println("Application closed");
                isContinue = false;
            } else {
                System.out.println("Invalid Operation Number");

            }
            if (isContinue) {
                System.out.println("Enter 1 to perform another calculation or any other number to exit:");
                operation = scanner.nextInt();
                if (operation != 1) {
                    System.out.println("Calculator closed.");
                    scanner.close();
                }
            }

        } while (isContinue);


    }


    public static void displayMenu() {
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. Exit ");
    }

    public static int addition() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n1 = scanner.nextInt();
        System.out.println("Enter a number:");
        int n2 = scanner.nextInt();
        int result = n1 + n2;
        //System.out.println("result = (" + n1 + " + " + n2 + "): " + result);
        return result;
    }

    public static int subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n1 = scanner.nextInt();
        System.out.println("Enter a number:");
        int n2 = scanner.nextInt();
        int result = n1 - n2;
        return result;
    }

    public static int multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = scanner.nextInt();
        System.out.println("Enter a number");
        int n2 = scanner.nextInt();
        int result = n1 * n2;
        return result;
    }

    public static int division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = scanner.nextInt();
        System.out.println("Enter a number");
        int n2 = scanner.nextInt();
        int result = n1 / n2;
        return result;
    }
}
