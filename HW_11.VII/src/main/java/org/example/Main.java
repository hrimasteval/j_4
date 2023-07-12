package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter equation: ");
        String input = scanner.nextLine();

        String[] tokens = input.replaceAll("\\s", "").toLowerCase().split("(?<=[+\\-*/])|(?=[+\\-*/])");

        if (tokens.length != 3) {
            System.out.println("nuh uh");
        } else {
            try {
                int operand1 = Integer.parseInt(tokens[0]);
                int operand2 = Integer.parseInt(tokens[2]);
                int result = 0;

                switch (tokens[1]) {
                    case "+":
                    case "plus":
                        result = operand1 + operand2;                                   // addition
                        break;
                    case "-":
                    case "minus":
                        result = operand1 - operand2;                                   // subtraction
                        break;
                    case "*":
                    case "multiply":
                    case "times":
                        result = operand1 * operand2;                                   // multiplication
                        break;
                    case "/":
                    case "divide":
                        if (operand2 == 0) {
                            System.out.println("nuh uh");                               // cannot divide by 0
                            scanner.close();
                            return;
                        }
                        result = operand1 / operand2;                                   // division
                        break;
                    default:
                        System.out.println("nuh uh");
                        scanner.close();
                        return;
                }
                System.out.println("= " + result);
            } catch (NumberFormatException e) {
                System.out.println("nuh uh");
            }
        }
    }
}