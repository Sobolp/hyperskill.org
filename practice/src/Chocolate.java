import java.util.Scanner;

/**
 * Imagine a chocolate bar. Remember how it is usually split into smaller bits by a special grid?
 * <p>
 * Now think of chocolate as an N x M rectangle divided into little segments: N segments in length and M in width.
 * Each segment is 1x1 and unbreakable.
 * Find out whether it is possible to break off exactly K segments
 * from the chocolate with a single straight line: vertical or horizontal.
 * <p>
 * Input data format
 * <p>
 * The program gets an input of three integers: N, M, K.
 * <p>
 * Output data format
 * <p>
 * The program must output one of the two words: YES or NO.
 * <p>
 * <p>
 * Report a typo
 * Sample Input 1:
 * 4
 * 2
 * 6
 * Sample Output 1:
 * YES
 * Sample Input 2:
 * 2
 * 10
 * 7
 * Sample Output 2:
 * NO
 * Sample Input 3:
 * 7
 * 4
 * 21
 * Sample Output 3:
 * YES
 */

public class Chocolate {
    public static boolean checkArray(int dem1, int dem2, int subArr) {
        return subArr % dem2 == 0 || subArr % dem1 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int varN = scanner.nextInt();
        int varM = scanner.nextInt();
        int varK = scanner.nextInt();
        System.out.println(varK <= varM * varN && (varK % varN == 0 || varK % varM == 0) ? "YES" : "NO");
    }
}
