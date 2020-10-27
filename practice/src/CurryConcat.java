import java.util.Scanner;
import java.util.function.Function;

/**
 * Write a curried function (using lambdas) that accepts four string arguments and concatenated all in one string following the rules:
 *
 * String cases: in the result string, first and second arguments must be in lower cases and third and fourth in upper cases.
 * Order of arguments concatenation: first, third, second, fourth.
 * Solution format. You may write the result in any valid formats but with ; on the end.
 *
 * An example of a curried function: x -> y -> ...;
 *
 *  Report a typo
 * Sample Input 1:
 * aa bb cc dd
 * Sample Output 1:
 * aaCCbbDD
 * Sample Input 2:
 * AAA bbb CCC ddd
 * Sample Output 2:
 * aaaCCCbbbDDD
 */
class CurryConcat {

    public static String calc(String str1, String str2, String str3, String str4) {

        Function<String, Function<String, Function<String, Function<String, String>>>> stringFun =
                f1 -> f2 -> f3 -> f4 -> f1.toLowerCase().concat(f3.toUpperCase()).concat(f2.toLowerCase()).concat(f4.toUpperCase());

        return stringFun.apply(str1).apply(str2).apply(str3).apply(str4);
    }

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        System.out.println(calc(values[0], values[1], values[2], values[3]));
    }
}