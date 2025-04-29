import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MinMaxMethod <T> {

    public static <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T> minMaxCosumer) {
        List<T> list = stream.collect(Collectors.toList());
        minMaxCosumer.accept(list.stream().min(order).orElse(null), list.stream().max(order).orElse(null));
    }
}
