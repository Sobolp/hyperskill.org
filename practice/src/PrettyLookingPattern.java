import java.util.Scanner;

/**
 * In some design style, a 4x4 matrix pattern is considered looking pretty if it doesn't consist of a 2x2 matrix of the same color.
 * Your task is to write the program that outputs "YES" if the 4x4 matrix is looking pretty, otherwise output "NO".
 *
 * Input contains 4 lines, each line contains 4 symbols,
 * different symbols represent different colors: W stands for white color, B - black, R - red, G - green, Y - yellow.
 *
 * Sample Input 1:
 * WWWW
 * BBBB
 * WWWW
 * YYYY
 * Sample Output 1:
 * YES
 * Sample Input 2:
 * BBBB
 * BWWB
 * BWWB
 * BBBB
 * Sample Output 2:
 * NO
 */
public class PrettyLookingPattern {


    public static void main(String[] args) {
        int demLength = 4;
        char[][] charsArr = new char[demLength][demLength];
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("");
        for (int i = 0; i < demLength; i++){
            String tmp = scanner.nextLine();
            int j = 0;
            for (String str:tmp.split("")) {
                charsArr[i][j] = str.charAt(0);
                j++;
            }
        }
        for (int i = 0; i < demLength; i++){
            for (int j = 0; j < demLength;j++){
                System.out.print(charsArr[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < demLength-1; i++){
            char[][] tmp = new char[2][2];
            for (int j = 0; j < demLength-1;j++){
                tmp[0][0] = charsArr[i][j];
                tmp[0][1] = charsArr[i][j+1];
                tmp[1][0] = charsArr[i+1][j];
                tmp[1] [1] = charsArr[i+1][j+1];
                if (isPretty(tmp)){
                    System.out.print("NO");
                    return;
                }
            }
        }
        System.out.println("YES");


    }
    private static boolean isPretty(char[][] arr){
        char prev = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if (arr[i][j] != prev){
                    return false;
                }
                prev = arr[i][j];
            }
        }
        return true;
    }
}
