package lesson2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        System.out.println("Enter the num: ");

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();

        System.out.println("Enter the second num: ");
        double b = scanner.nextInt();

        System.out.println("Choose the operator + - * /: ");
        String g = scanner.next();

        System.out.println("The result of addition these numbers");
        switch (g) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
        }

        scanner.close();
    }

}
