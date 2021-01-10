import java.util.*;
import java.util.stream.Collectors;

/**
 * Write a collector that partitions all words in a stream into two groups: palindromes (true) and usual words (false).
 * The collector should return Map<Boolean, List<String>>. All input words will be in the same case (lower).
 *
 * Let's remind, a palindrome is a word or phrase which reads the same backward or forward, such as noon or level.
 * In our case, a palindrome is always a word. For details, see https://en.wikipedia.org/wiki/Palindrome
 *
 * Hint: the method reverse() of StringBuilder may help you.
 *
 * Important. You should write only the collector in any valid formats but without ; on the end.
 * It will be passed as an argument to the collect() method of a stream as shown below.
 *
 * String[] words = ...
 * Map<Boolean, List<String>> palindromeOrNoMap =
 *         Arrays.stream(words)
 *               .collect(...your_collector_will_be_passed_here...);
 *
 * Examples of the valid solution formats: Collectors.reducing(...) or reducing(...)
 *
 * Sample Input 1:
 * aaaa aaa a aa
 * Sample Output 1:
 * {false=[], true=[aaaa, aaa, a, aa]}
 * Sample Input 2:
 * level bbaa ac
 * Sample Output 2:
 * {false=[bbaa, ac], true=[level]}
 */
public class PalindromeOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<Boolean, List<String>> palindromeOrNo = Arrays.stream(words)
                .collect(
                        Collectors.partitioningBy(s -> new StringBuilder(s).reverse().toString().equals(s)
/*                        {
                            StringBuilder r = new StringBuilder();
                            r.append(s);
                            r.reverse();
                            return r.toString().equals(s);
                        }*/
                        )
                );

        palindromeOrNo = new LinkedHashMap<>(palindromeOrNo);

        System.out.println(palindromeOrNo);
    }
}
