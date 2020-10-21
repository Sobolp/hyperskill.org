import java.util.*;
import java.util.stream.Collectors;

/**
 * The simplest spell checker is the one based on a list of known words.
 * Every word in the text is being searched for in this list and, if such word was not found, it is marked as erroneous.
 *
 * Write such a spell checker.
 *
 * The first line of the input contains
 * d – number of records in the list of known words.
 * Next go d lines containing one known word per line, next — the number l of lines of the text,
 * after which — l lines of the text.
 *
 * Write a program that outputs those words from the text that are not found in the dictionary (i.e. erroneous).
 * Your spell checker should be case insensitive. The words are entered in an arbitrary order.
 * Words, which are not found in the dictionary, should not be duplicated in the output.
 *
 *  Report a typo
 * Sample Input 1:
 * 3
 * a
 * bb
 * cCc
 * 2
 * a bb aab aba ccc
 * c bb aaa
 * Sample Output 1:
 * c
 * aab
 * aaa
 * aba
 */
public class SpellChecker {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Set<String> dictionary = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dictionary.add(scanner.nextLine().toLowerCase());
        }
        n = scanner.nextInt();
        scanner.nextLine();
        Set<String> result = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<String> row = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .map(s -> s.toLowerCase())
                    .collect(Collectors.toSet());
            row.removeAll(dictionary);
            result.addAll(row);
        }
        result.forEach(s -> System.out.println(s));
    }
}
