import java.lang.reflect.Method;

/**
 * Implement a method that will find the class of the provided method by its name.
 * This method accepts two arguments, the name of the method and an array of fully-qualified class names, where:
 *
 * methodName is the name of the method that needs to be found;
 *
 * classNames contains one class that has the method with the given name.
 *
 * It should return the fully-qualified name of the class that has the method with the given name.
 *
 * For example, the method name is abs and possible classes are java.lang.String, java.lang.StringBuffer and java.lang.Math.
 *
 * String and StringBuffer have no method with the name abs. So they are not the class we are looking for.
 * Math class has a method with the name abs. The method should return the fully-qualified name of Math class, java.lang.Math in this case.
 */

public class FindTheMethod {
    public static void main(String[] args) {
        System.out.println(MethodFinder.findMethod("abs", new String[]{"java.lang.Math"}));
    }
}
class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) {
        String result = "";
        for (String className : classNames) {
            try {
                for (Method method : Class.forName(className).getMethods()) {
                    if (methodName.equals(method.getName())) {
                        result = className;
                        break;
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}