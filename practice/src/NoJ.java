import java.util.*;

/**
 * Implement a method that does the following algorithm:
 * <p>
 * creates List<String> from a given array of strings;
 * using ListIterator, removes all items not starting with "J" ;
 * removes "J" from items beginning with "J" (e.g., JFrame -> Frame);
 * prints all the remaining elements in the reverse order.
 * <p>
 * Sample Input 1:
 * ImageButton JTextField JTextArea CheckBox JMenu
 * Sample Output 1:
 * Menu
 * TextArea
 * TextField
 */
public class NoJ {
    public static void processIterator(String[] array) {
        // write your code here
        List<String> list = new ArrayList<>(List.of(array));
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String current = listIterator.next();
            if (current.charAt(0) != 'J') {
                listIterator.remove();
            } else {
                listIterator.set(current.substring(1));
            }
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}
