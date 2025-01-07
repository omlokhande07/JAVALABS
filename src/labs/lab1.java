package labs;

import java.util.Scanner;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            // Display menu
            System.out.println("Menu");
            System.out.println("1. Calculator");
            System.out.println("2. Factorial");
            System.out.println("3. Fibonacci");
            System.out.println("4. Root");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    calculator(sc);
                    break;
                case 2:
                    factorial(sc);
                    break;
                case 3:
                    fibonacci(sc);
                    break;
                case 4:
                    root(sc);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    public static void calculator(Scanner sc) {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        System.out.println("Result: " + result);
    }

    public static void factorial(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }

    public static void fibonacci(Scanner sc) {
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void root(Scanner sc) {
        System.out.print("Enter number: ");
        double num = sc.nextDouble();
        System.out.print("Enter root (e.g., 2 for square root): ");
        double root = sc.nextDouble();

        if (root != 0) {
            double result = Math.pow(num, 1.0 / root);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Root cannot be zero.");
        }
    }
}
