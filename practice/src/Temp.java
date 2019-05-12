import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//        multiply(list,2);
//        System.out.println(list);
        System.out.print(getNumberOfMaxParam(5,7,7));
    }
    public static <T> void multiply(List<T> listIO, int n) {
        // Add implementation here
        List<T> tmpList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            tmpList.addAll(listIO);
        }
        listIO.clear();
        listIO.addAll(tmpList);
    }
    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int result = 0;
        if (a >= b){
            result = 1;
        }else if (b >= c){
            result = 2;
        }
        if (c > a && result != 2){
            result = 3;
        }
        return result;
    }
}
