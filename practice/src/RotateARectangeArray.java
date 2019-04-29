import java.util.*;

/**
 * Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by recording the result into the new array m×n in size.
 * <p>
 * Input data format
 * <p>
 * Input the two numbers n and m, not exceeding 100, and then an array n×m in size.
 * <p>
 * Output data format
 * <p>
 * Output the resulting array. Separate numbers by a single space in the output.
 * <p>
 * Sample Input 1:
 * 3 4
 * 11 12 13 14
 * 21 22 23 24
 * 31 32 33 34
 * Sample Output 1:
 * 31 21 11
 * 32 22 12
 * 33 23 13
 * 34 24 14
 */
public class RotateARectangeArray {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                arr[x][y] = sc.nextInt();
            }
        }

        for (int y = 0; y < m; y++) {
            for (int x = n-1; x >= 0; x--) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }
}
