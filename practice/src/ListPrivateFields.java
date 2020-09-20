import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Implement getPrivateFields method to list the names of private fields declared in the class the object belongs to.
 * Fields inherited from parent classes should be omitted. Field names should be sorted in lexical order.
 *
 * Here we use List<String> since it's more appropriate for the task.
 * Check out the docs if you're not familiar with it.
 */
public class ListPrivateFields {
    public static void main(String[] args) {
          new FieldGetter1().getPrivateFields(new String()).forEach(s -> System.out.println(s));
//        FieldGetter fieldGetter = new FieldGetter();
//        for (String s : fieldGetter.getPublicFields(new String())) {
//            System.out.println(s);
//        }
    }
}

/**
 Get sorted list of private fields the object declares (inherited fields should be skipped).
 */
class FieldGetter1 {

    public List<String> getPrivateFields(Object object) {
        // Add implementation here
        return Arrays.stream(object.getClass().getDeclaredFields())
                .filter(x -> Modifier.isPrivate(x.getModifiers()))
                .sorted(Comparator.comparing(Field::getName, String::compareToIgnoreCase))
                .map(Field::getName)
                .collect(Collectors.toList());
//        List<String> result = new ArrayList<>();
//        for (Field field : object.getClass().getDeclaredFields()) {
//            if (Modifier.isPrivate(field.getModifiers())) {
//                result.add(field.getName());
//            }
//        }
//        Collections.sort(result, String.CASE_INSENSITIVE_ORDER);
//        return result;
    }

}
