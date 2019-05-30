import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.min;

/**
 * Read the integer
 * N
 * N (
 * 1
 * ≤
 * N
 * ≤
 * 40
 * 1≤N≤40) from the standard input and list all the decompositions of NN into a sum of positive integers.
 * The addends should go in non-ascending order within each decomposition.
 * <p>
 * Output all decompositions in the lexicographical order.
 * <p>
 * Please, use a recursive method to write your solution.
 * <p>
 * Sample Input 1:
 * 5
 * Sample Output 1:
 * 1 1 1 1 1
 * 2 1 1 1
 * 2 2 1
 * 3 1 1
 * 3 2
 * 4 1
 * 5
 */


public class NumberOfDecompositions {

    private static void f(int x, int k, String s){
        if (x == 0){
            System.out.println(s);
        }else {
            for (int i = 1; i <= min(k,x); i++){
                f(x-i, i, s + " " + i);
            }
        }
    }


    public static void main(String[] args) {
        // put your code here

        f(5,5,"");
    }
}
