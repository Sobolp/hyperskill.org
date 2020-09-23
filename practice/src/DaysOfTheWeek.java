import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Your task is to implement the getDayOfWeekName method that converts
 * the number of the day of the week to its short name.
 * If the given number is incorrect, the method should throw IllegalArgumentException.
 * <p>
 * Let's assume that a week starts from Monday:
 * <p>
 * 1 → "Mon";
 * 2 → "Tue";
 * 3 → "Wed";
 * 4 → "Thu";
 * 5 → "Fri";
 * 6 → "Sat";
 * 7 → "Sun".
 * Report a typo
 * Sample Input 1:
 * 0
 * Sample Output 1:
 * java.lang.IllegalArgumentException
 * Sample Input 2:
 * 1
 * Sample Output 2:
 * Mon
 */
public class DaysOfTheWeek {
    public static String getDayOfWeekName(int number) {
        // write your code here
        Map<Integer, String> week = new HashMap<>();
        week.put(1, "Mon");
        week.put(2, "Tue");
        week.put(3, "Wed");
        week.put(4, "Thu");
        week.put(5, "Fri");
        week.put(6, "Sat");
        week.put(7, "Sun");

        if (number < 1 || number > 7) {
            throw new IllegalArgumentException();
        }
        return week.get(number);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }

}
