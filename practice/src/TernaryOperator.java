import java.util.function.*;

/**
 * Let's create our own function using several standard functional interfaces.
 *
 * Implement a ternaryOperator method that accepts a predicate condition,
 * and two functions ifTrue and ifFalse and returns a function.
 * The returning function takes an argument, checks if condition predicate is true for this argument,
 * and if it is — applies ifTrue function to the argument, otherwise, it applies ifFalse function.
 *
 * Here is an example:
 *
 * Predicate<Object> condition = Objects::isNull;
 * Function<Object, Integer> ifTrue = obj -> 0;
 * Function<CharSequence, Integer> ifFalse = CharSequence::length;
 * Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
 * In the example above, the resulting function returns the length of a string if the reference to the string is not null,
 * otherwise, it returns 0.
 */

public class TernaryOperator {
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return  t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);

    }
}
