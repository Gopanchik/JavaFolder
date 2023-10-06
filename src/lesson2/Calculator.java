package lesson2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        calculater();
    }

    public static void calculater() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first num: ");
            double a = scanner.nextDouble();

            System.out.print("Enter the second num: ");
            double b = scanner.nextDouble();

            System.out.print("Choose the operator (+ - * /:) [or enter 'q' for exit]   ");
            String operator = scanner.next();

            if (operator.equals("q")) {
                System.out.println("The app is closed.");
                break;
            }

            double result = 0;

            switch (operator) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error! You can't divide by zero");
                        System.out.println("Do you want to change numbers? \n ('y' for 'yes' / 'n' for 'no')");
                        String yn = scanner.next();

                        if (yn.equalsIgnoreCase("y")) {
                            continue;
                        } else if (yn.equalsIgnoreCase("n")) {
                            System.exit(0);
                        }
                    }
                    break;
                default:
                    System.out.println("Error: wrong operator");
            }

            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}
