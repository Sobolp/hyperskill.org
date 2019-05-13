import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Temp {
    public static void main(String args[]) {

            System.out.print(method(127));
    }
    public static long method(long n) {
        if (n == 1) {
            return 0;
        }
        return method(n / 2) + 1;
    }
    public static String prepareFullName(String firstName, String lastName) {
        // write your code here
        return firstName + ((lastName !=null)?" "+lastName:"");
    }
    public static String concatStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
        StringBuilder sb = new StringBuilder();
        for(String s: strings){
            sb.append(s);
        }
        for(int i = sb.length(); i>0;i--){
            if(Character.isDigit(sb.charAt(i))){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }

    public static <T> void multiply(List<T> listIO, int n) {
        // Add implementation here
        List<T> tmpList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tmpList.addAll(listIO);
        }
        listIO.clear();
        listIO.addAll(tmpList);
    }

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int result = 0;
        if (a >= b) {
            result = 1;
        } else if (b >= c) {
            result = 2;
        }
        if (c > a && result != 2) {
            result = 3;
        }
        return result;
    }
}
