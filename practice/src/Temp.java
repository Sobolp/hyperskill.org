import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        multiply(list,2);
        System.out.println(list);
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
}
