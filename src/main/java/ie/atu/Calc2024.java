package ie.atu;

import java.util.Scanner;

public class Calc2024 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered " + firstNum);
        System.out.println("Please enter a second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered " + secondNum);

        double sum = firstNum + secondNum;
        System.out.println("The sum is: " + sum);

        // Ask the user for the operation
        System.out.print("Choose an operation (add, subtract, multiply, divide): ");
        String operation = scan1.next();

        // Perform the operation
        boolean validOperation = true;
        switch (operation) {
            case "add":
                add(firstNum, secondNum);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }

    public static void add(double first, double second)
    {
        double result = first + second;
        System.out.println("The total is " + result);
    }


}
