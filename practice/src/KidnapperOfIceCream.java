import java.util.*;

/**
 * Imagine now you are an outlaw in the Sherlock Holmes times.
 * You are in need of money and you want to demand some by blackmailing.
 * Obviously, you have to write a letter completely anonymously because you do not want to be busted.
 * <p>
 * So you decide to compose a letter by cutting the required words from a newspaper.
 * <p>
 * In this problem, you get two lines: 1) available words you have in a newspaper, 2) your note.
 * <p>
 * Find out and print if you can write a note from available words ("You get money") or you will be busted ("You are busted").
 * <p>
 * Remember: your note is case-sensitive
 * <p>
 * Report a typo
 * Sample Input 1:
 * batman batman batman i i I need am and and money
 * I am batman and i need money
 * Sample Output 1:
 * You get money
 */
public class KidnapperOfIceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> source = new ArrayList<>();
        source.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));
        final List<String> message = Arrays.asList(scanner.nextLine().split("\\s+"));
        String result = "You get money";
        for (String s : message) {
            if (!source.remove(s)) {
                result = "You are busted";
                break;
            }
        }
        System.out.println(result);
    }
}
