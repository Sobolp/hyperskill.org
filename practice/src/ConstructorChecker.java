import java.util.Arrays;
/**
 * Implement checkPublicParameterlessConstructor that returns true if the provided class
 * declares public parameterless constructor and false otherwise.
 */

/**
 Check whether the class declares public parameterless constructor
 */
class ConstructorChecker {

    public boolean checkPublicParameterlessConstructor(Class<?> clazz) {
        // Add implementation here
        return Arrays.stream(clazz.getConstructors())
                .anyMatch(x -> x.getParameterCount() == 0);
    }

}