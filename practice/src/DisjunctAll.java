import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

/**
 * It is time to learn how to perform operations on predicates, just like in mathematical logic!
 * <p>
 * Write the disjunctAll method that accepts a list of IntPredicate objects and returns a single IntPredicate.
 * The result predicate is a disjunction of all input predicates.
 * <p>
 * Disjunction means that if any of the predicates would return true, the composed predicate should return true as well.
 * <p>
 * If the input list is empty, the resulted predicate must return false for any integer value (always false predicate).
 */
public class DisjunctAll {
    /**
     * The method represents a disjunct operator for a list of predicates.
     * For an empty list it returns the always false predicate.
     */
//    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
//        IntPredicate acc = n -> false;
//        for (IntPredicate predicate : predicates) {
//            acc = acc.or(predicate);
//        }
//        return acc;
//    }
    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        return predicates.stream().reduce(i -> false, IntPredicate::or);
    }

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        List<Boolean> values = Arrays.stream(strings)
                .map(Boolean::parseBoolean)
                .collect(Collectors.toList());

        List<IntPredicate> predicates = new ArrayList<>();
        values.forEach(v -> predicates.add(x -> v));

        System.out.println(disjunctAll(predicates).test(0));
    }
}
