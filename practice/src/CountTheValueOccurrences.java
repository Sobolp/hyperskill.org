import java.util.List;

/**
 * Implement a method that takes an integer value and two lists of numbers.
 * It must check if the value occurs the same number of times in both sequences.
 *
 * In the following input example, the first line contains the value,
 * the second line is the first list, the third line is another list.
 *
 * All numbers are separated by whitespaces.
 *
 *  Report a typo
 * Sample Input 1:
 * 3
 * 8 8 3 3 2
 * 1 3 3 2
 * Sample Output 1:
 * true
 * Sample Input 2:
 * 3
 * 9 8 4 3 2
 * 1 3 3 3
 * Sample Output 2:
 * false
 */
public class CountTheValueOccurrences {
    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .filter(e -> e.equals(elem))
                .count() == list2.stream()
                .filter(e -> e.equals(elem))
                .count();
    }
}

