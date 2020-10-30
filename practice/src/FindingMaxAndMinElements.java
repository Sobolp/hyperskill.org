import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Implement a method for finding min and max elements of a stream in accordance with a given comparator.
 *
 * The found elements pass to minMaxConsumer in the following way:
 *
 * minMaxConsumer.accept(min, max);
 * If the stream doesn't contain any elements, invoke:
 *
 * minMaxConsumer.accept(null, null);
 * Remember, that as soon as you call any terminal operation, the stream is closed and you can get IllegalStateException.
 */
public class FindingMaxAndMinElements {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        // your implementation here
        List<T> list = stream.sorted(order).collect(Collectors.toList());
        if (!list.isEmpty()) {
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }
}
