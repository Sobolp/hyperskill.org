import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program, which inputs the rectangular matrix from a sequence of lines, ending with a line,
 * containing the only word "end" (without the quotation marks).
 * <p>
 * The program should output the matrix of the same size,
 * where each element in the position (i, j) is equal to the sum of the elements
 * from the first matrix on the positions (i-1, j)(i+1, j)(i, j-1), (i, j+1).
 * Boundary elements have neighbours on the opposite side of the matrix.
 * In the case of one row or column, the element itself may be its neighbour.
 * <p>
 * Sample Input 1:
 * 9 5 3
 * 0 7 -1
 * -5 2 9
 * end
 * Sample Output 1:
 * 3 21 22
 * 10 6 19
 * 20 16 -1
 * Sample Input 2:
 * 1
 * end
 * Sample Output 2:
 * 4
 */
public class SumOfNeighbours {
    public static void main(String[] args) {
        List<int[]> listArr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!"end".equals(line)) {

            listArr.add(getArr(line.split(" ")));
            line = scanner.nextLine();

        }
//        for (int[] i:listArr) {
//            for (int j:i) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        for (int x = 0; x < listArr.size(); x++) {
            for (int y = 0; y < listArr.get(x).length; y++) {
                int sum = listArr.get(getInd(x-1,listArr.size()))[getInd(y,listArr.get(x).length)]
                        +listArr.get(getInd(x+1,listArr.size()))[getInd(y,listArr.get(x).length)]
                        +listArr.get(getInd(x,listArr.size()))[getInd(y-1,listArr.get(x).length)]
                        +listArr.get(getInd(x,listArr.size()))[getInd(y+1,listArr.get(x).length)];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    private static int[] getArr(String[] str) {
        int[] result = new int[str.length];
        int i = 0;
        for (String s : str) {
            result[i] = Integer.valueOf(s);
            i++;
        }
        return result;
    }

    private static int getInd(int i, int leng) {
        if (i < 0) {
            i = leng + i;
        } else if (i >= leng) {
            i = i - leng;
        }
        return i;
    }
}
