import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Prompt user for input to select operation
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        Scanner input = new Scanner(System.in);  // Create scanner object
        System.out.println("Enter an operation:");
        String opSelect = input.nextLine().toLowerCase();     // Get user input as string. Convert to lower case.

        switch (opSelect) {

            case "add":
                System.out.println("Enter two integers:");
                // Instantiate variables
                int add1;
                int add2;
                // Nested if to check if input is of type int. If not, break out of case statement.
                if (input.hasNextInt()) {
                    add1 = input.nextInt();
                    if (input.hasNextInt()) {
                        add2 = input.nextInt();
                    }
                    else {
                        System.out.println("Invalid input entered. Terminating...");
                        break;
                    }
                }
                else {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                // Print result
                System.out.println("Answer: " + (add1 + add2));
                break;

            case "subtract":
                System.out.println("Enter two integers:");
                // Instantiate variables
                int sub1;
                int sub2;
                // Nested if to check if input is of type int. If not, break out of case statement.
                if (input.hasNextInt()) {
                    sub1 = input.nextInt();
                    if (input.hasNextInt()) {
                        sub2 = input.nextInt();
                    }
                    else {
                        System.out.println("Invalid input entered. Terminating...");
                        break;
                    }
                }
                else {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                // Print result
                System.out.println("Answer: " + (sub1 - sub2));
                break;

            case "multiply":
                System.out.println("You want to multiply.");
                break;
                
            case "divide":
                System.out.println("You want to divide.");
                break;
            case "alphabetize":
                System.out.println("You want to alphabetize.");
                break;
            default:
                System.out.println("Invalid input entered. Terminating...");
                break;
        }

    }
}
