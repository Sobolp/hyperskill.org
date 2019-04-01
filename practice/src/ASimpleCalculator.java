import java.util.Scanner;

public class ASimpleCalculator {
    /**
     * A simple calculator
     *
     * Write a simple calculator that reads the three values from the line: the first number, the operation, and the second number.
     *
     * The program should apply the operation to the numbers entered ("first number" "operation" "second number") and output the result to the screen.
     * Note that the numbers are long.
     *
     * The calculator should support:
     *
     * addition: "+"
     * subtraction: "-"
     * integer division: "/"
     * multiplication: "*"
     * If a user performs division and the second number is 0, it is necessary to output the line "Division by 0!".
     *
     * If the input operator is not one from the list, the program should output "Unknown operator".
     *
     * Note: it's recommended to use the switch statement in your solution.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        switch (input[1]) {
            case "+":
                System.out.println(Long.parseLong(input[0]) + Long.parseLong(input[2]));
                break;
            case "-":
                System.out.println(Long.parseLong(input[0]) - Long.parseLong(input[2]));
                break;
            case "*":
                System.out.println(Long.parseLong(input[0]) * Long.parseLong(input[2]));
                break;
            case "/":
                if (input[2].equals("0")) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(Long.parseLong(input[0]) / Long.parseLong(input[2]));
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;

        }

    }

}
