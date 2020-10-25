/**
 * Write a lambda expression that accepts a list of strings and returns new list of distinct strings (without repeating).
 * The order of elements in the result list may be any (elements will be sorted by the testing system).
 *
 * If the input list doesn't contain any strings then the result list should be empty.
 *
 * Hints: it is possible to use sets, maps, lists and so on for helping.
 *
 * Solution format. Submit your lambda expression in any valid format with ; on the end.
 *
 * Examples: x -> x; (x) -> { return x; };
 *
 *  Report a typo
 * Sample Input 1:
 * java scala java clojure clojure
 * Sample Output 1:
 * clojure java scala
 * Sample Input 2:
 * the three the three the three an an a
 * Sample Output 2:
 * a an the three
 */

import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

public class GettingDistinctStrings {
}
class Operator {

    public static UnaryOperator<List<String>> unaryOperator = l -> List.copyOf(Set.copyOf(l));
}
