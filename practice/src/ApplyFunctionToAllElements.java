import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * You need to implement a method that applies given function to all elements of the given array.
 * You need to change the existing array, and not create a new array.
 */
public class ApplyFunctionToAllElements {
    public static <T> void applyFunction(T[] array, Function<T, T> func) {
        // write your code here
//        for (int i = 0; i < array.length; i++) {
//            array[i] = func.apply(array[i]);
//        }
        IntStream.range(0, array.length).forEach(i -> array[i] = func.apply(array[i]));
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String method = scanner.nextLine();
        String[] array = scanner.nextLine().split(" ");
        applyFunction(array,
                "lower".equals(method) ? String::toLowerCase :
                        "upper".equals(method) ? String::toUpperCase :
                                "new".equals(method) ? String::new :
                                        "trim".equals(method) ? String::trim : String::intern);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
