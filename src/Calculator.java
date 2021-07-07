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
                System.out.println("Enter two doubles:");
                // Instantiate variables
                double mult1;
                double mult2;
                // Nested if to check if input is of type int. If not, break out of case statement.
                if (input.hasNextDouble()) {
                    mult1 = input.nextDouble();
                    if (input.hasNextDouble()) {
                        mult2 = input.nextDouble();
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
                double multResult = mult1 * mult2;
                System.out.printf("Answer: %.2f\n",multResult);
                break;

            case "divide":
                System.out.println("Enter two doubles:");
                // Instantiate variables
                double div1;
                double div2;
                // Nested if to check if input is of type int. If not, break out of case statement.
                if (input.hasNextDouble()) {
                    div1 = input.nextDouble();
                    if (input.hasNextDouble()) {
                        div2 = input.nextDouble();
                        if (div2 == 0) {
                            System.out.println("Invalid input entered. Terminating...");
                            break;
                        }

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
                double divResult = div1 / div2;
                System.out.printf("Answer: %.2f\n",divResult);
                break;

            case "alphabetize":
                System.out.println("Enter two words:");
                // Instantiate variables
                String word1;
                String word2;
                // Nested if to check if input is of type int. If not, break out of case statement.
                if (input.hasNext()) {
                    word1 = input.next();
                    if (input.hasNext()) {
                        word2 = input.next();
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
                // Make comparison
                int wordComp = word1.toLowerCase().compareTo(word2.toLowerCase());
                if (wordComp < 0) {
                    System.out.println("Answer: " + word1 + " comes before " + word2 + " alphabetically.");
                }
                else if (wordComp > 0) {
                    System.out.println("Answer: " + word2 + " comes before " + word1 + " alphabetically.");
                }
                else {
                    System.out.println("Answer: Chicken or Egg.");
                }
                break;

            default:
                System.out.println("Invalid input entered. Terminating...");
                break;
        }

    }
}
