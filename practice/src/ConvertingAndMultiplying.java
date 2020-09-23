import java.util.Scanner;

/**
 * Your task is to write a program that reads a sequence of strings and converts them to integer numbers,
 * multiplying by 10. Some input strings may have an invalid format, for instance: "abc".
 * The sequence’s length may be different. It’s ending is indicated by “0”.
 * Zero serves as a stop character and should not be included in the sequence.
 *
 * If a string can be converted to an integer number, output the number multiplied by 10.
 * Otherwise, output the string "Invalid user input: X" where X is the input string.
 * To better understand see examples below.
 *
 * To implement this logic, use the exception handling mechanism.
 *
 * Input data format:
 *
 * A sequence of integer numbers and other strings, each in a new line
 *
 * Output data format:
 *
 * A sequence of integer numbers and warnings, each in a new line
 *
 *  Report a typo
 * Sample Input 1:
 * 11
 * 12
 * 13
 * 0
 * Sample Output 1:
 * 110
 * 120
 * 130
 * Sample Input 2:
 * 11
 * abc
 * 13
 * 0
 * Sample Output 2:
 * 110
 * Invalid user input: abc
 * 130
 */
public class ConvertingAndMultiplying {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            try {
                int i = Integer.parseInt(s);
                if (i == 0) {
                    break;
                }
                System.out.println(i * 10);
            } catch (Exception e) {
                System.out.printf("Invalid user input: %s\n", s);
            }

        }
    }
}
