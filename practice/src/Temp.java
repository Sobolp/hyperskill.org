
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.*;

public class Temp {

    public static int convert(Long val) {
        // write your code here
        if (val == null) {
            return 0;
        } else if (val >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (val <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return val.intValue();
        }
    }

    public static long solution(long[] numbers) {
        long maxVal;
        if (numbers != null) {
            maxVal = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (maxVal < numbers[i]) {
                    maxVal = numbers[i];
                }
            }
        } else {
            maxVal = 0;
        }
        return maxVal;
    }

    /* Do not change code below */
    public static void main(String[] args) {

//        String a = "Petya";
//        a = a.concat(" vasya");
//        System.out.println(a);
//            final Scanner scanner = new Scanner(System.in);
//            char[][] fild = new char[3][3];
//            String input = scanner.nextLine();
//            System.out.println("---------");
//            int index = 1;
//            for (int i = 0; i < 3; i++){
//                System.out.print("| ");
//                for (int j = 0; j < 3; j++){
//                    fild[i][j] = input.charAt(index++);
//                    System.out.print(fild[i][j]+" ");
//                }
//                System.out.println("|");
//            }
//
//
//            System.out.println("---------");
//            boolean a,b;
//            a = false;
//            b = false;
//            System.out.println(a&b);
//            System.out.println(a||b);
//            Scanner scanner = new Scanner(System.in);
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            scanner.nextLine();
//            int c = scanner.nextInt();
//            int n = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println(a+" "+b+" "+ c +" "+ n);
//        System.out.println(9 ^ 6);

    }
}

class ClassGetter {

    public String getObjectClassName(Object object) {
        // Add implementation here
        return object.getClass().getName();
    }

}
