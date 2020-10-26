import java.util.function.Supplier;

/**
 * Create a supplier that returns integer values from 0 to infinity.
 *
 * After first get() invocation a supplier must return 0.
 * After the second one, it must return 1, the next one returns 2, 3, etc.
 *
 * So this code should print "0 1 2 3 4 ":
 *
 * Supplier<Integer> sup = getInfiniteRange();
 * for(int i = 0; i < 5; i++) {
 *     System.out.print(sup.get() + " ");
 * }
 * Also, it should be possible to use separate suppliers simultaneously.
 *
 * For example, this code should print "0 0 1 1 2 2 3 3 4 4 ":
 *
 * Supplier<Integer> sup1 = getInfiniteRange();
 * Supplier<Integer> sup2 = getInfiniteRange();
 *
 * for(int i = 0; i < 5; i++) {
 *     System.out.print(sup1.get() + " " + sup2.get() + " ");
 * }
 * Hint: Anonymous class can be helpful here.
 */

public class AnInfiniteNumbersSupplier {
    public static Supplier<Integer> getInfiniteRange() {
        return new Supplier<Integer>() {
            int i = 0;
            @Override
            public Integer get() {
                return i++;
            }
        };
    }

    public static void main(String[] args) {
        Supplier<Integer> sup1 = getInfiniteRange();
        Supplier<Integer> sup2 = getInfiniteRange();

        for(int i = 0; i < 5; i++) {
            System.out.print(sup1.get() + " " + sup2.get() + " ");
        }
    }

}
