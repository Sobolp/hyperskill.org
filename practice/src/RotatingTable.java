import java.util.*;
import java.util.stream.Collectors;

/**
 * You have a table of integer numbers. You should rotate rows of the table by the specified distance.
 * Try to use collections and standard methods for them.
 *
 * Input data format
 *
 * The first line contains two numbers: a number of rows and a number of columns of the table.
 *
 * The following lines describe rows of the table. In each row, all elements are separated by spaces.
 *
 * The last line consists of one number, which is the distance for rotating.
 *
 * Output data format
 *
 * Output the resulting table. Separate numbers by a single space in the output.
 *
 *  Report a typo
 * Sample Input 1:
 * 3 3
 * 1 1 1
 * 2 2 2
 * 3 3 3
 * 1
 * Sample Output 1:
 * 3 3 3
 * 1 1 1
 * 2 2 2
 */
public class RotatingTable {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        scanner.nextLine();
        List<String> matrix = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            matrix.add(scanner.nextLine());
        }
        final int steps = scanner.nextInt();
        Collections.rotate(matrix, steps);
        for (String s: matrix) {
            System.out.println(s);
        }
    }
}
