import java.util.function.UnaryOperator;

/**
 * Write a lambda expression that adds PREFIX (before) and SUFFIX (after) to its single string argument;
 * PREFIX and SUFFIX are final variables. They are available in the code template.
 *
 * All whitespaces on the both ends of the argument must be removed.
 * Do not trim prefix, suffix and the result string.
 */
public class CreatingAClosure {
    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = s -> PREFIX + s.trim() + SUFFIX;
}
