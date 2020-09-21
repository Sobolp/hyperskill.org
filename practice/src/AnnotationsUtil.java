import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
/**
 * Implement the getFieldsContainingAnnotations method that lists the names of the fields declared in the object.
 * The list should include all the fields containing at least one annotation.
 * Fields inherited from parent classes should be omitted.
 */

/**
 Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */
class AnnotationsUtil {

    public static String[] getFieldsContainingAnnotations(Object object) {
        // Add implementation here
//        List<String> result = new ArrayList<>();
//        for (Field field : object.getClass().getDeclaredFields()) {
//            Annotation[] annotations =  field.getDeclaredAnnotations();
//            if (annotations.length != 0) {
//                result.add(field.getName());
//            }
//        }
//        return result.toArray(new String[0]);
        return Arrays.stream(object.getClass().getDeclaredFields())
                .filter(x -> x.getDeclaredAnnotations().length > 0)
                .map(Field::getName).collect(Collectors.toList())
                .toArray(String[]::new);
    }

}