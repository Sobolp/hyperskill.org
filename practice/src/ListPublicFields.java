import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implement the getPublicFields method that returns String array with
 * names of public fields declared in the class object belongs to.
 * Fields inherited from parent classes should be omitted.
 */
public class ListPublicFields {
    public static void main(String[] args) {
        Arrays.stream(new FieldGetter().getPublicFields(new String())).forEach(s -> System.out.println(s));
//        FieldGetter fieldGetter = new FieldGetter();
//        for (String s : fieldGetter.getPublicFields(new String())) {
//            System.out.println(s);
//        }
    }
}
/**
 Get list of public fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

//    public String[] getPublicFields(Object object) {
        // Add implementation here
//        List<String> result = new ArrayList<>();
//        for (Field field : object.getClass().getDeclaredFields()) {
//            if (Modifier.isPublic(field.getModifiers())) {
//                result.add(field.getName());
//            }
//        }
//        return result.toArray(new String[0]);
//    }

    public String[] getPublicFields(Object object) {
        // Add implementation here
        return Arrays.stream(object.getClass().getDeclaredFields())
                .filter(x -> Modifier.isPublic(x.getModifiers()))
                .map(Field::getName).toArray(String[]::new);
    }
}