import java.util.*;

public class EvenNumbersMethod {
    public static void toReturnEvenNumbers(List<Integer> numbersList) {
        numbersList.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println);
    }
}
