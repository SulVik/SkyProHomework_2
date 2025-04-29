import java.util.*;
import java.util.function.*;
import java.util.stream.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //Анонимный предикат
        Predicate<Integer> predicateaAnonim = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(predicateaAnonim.test(-1));
        System.out.println(predicateaAnonim.test(1));

        //Ляибда-предикат
        Predicate<Integer> predicateLambda = x -> x > 0;
        System.out.println(predicateLambda.test(-1));
        System.out.println(predicateLambda.test(1));


        //Анонимный консьюмер
        Consumer<String> consumerAnonim = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Приветствую тебя " + s);
            }
        };

        //Лямбда консьюмер
        Consumer<String> consumerLambda = s -> System.out.println("Приветствую тебя " + s);

        consumerAnonim.accept("Vika");
        consumerLambda.accept("Vitya");

        //Анонимный function
        Function<Double, Long> functionAnonim = new Function<Double, Long>() {
            @Override
            public Long apply(Double doubleNum) {
                return Math.round(doubleNum);
            }
        };

        //Лямбда function
        Function<Double, Long> functionLambda = x -> Math.round(x);

        System.out.println(functionAnonim.apply(2.5));
        System.out.println(functionLambda.apply(-2.5));

        //Анонимный supplier
        Supplier<Integer> supplierAnonim = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return ((int) Math.round(Math.random() * 100));
            }
        };

        //Лямбда supplier
        Supplier<Integer> supplierLambda = () -> ((int) Math.round(Math.random() * 100));

        System.out.println(supplierAnonim.get());
        System.out.println(supplierLambda.get());

        System.out.println();

        System.out.println("-----------------Stream and Optional HW---------------------");


        //ДЗ по Stream

        List<TestObject> testObjects = new ArrayList<>(List.of(new TestObject("F", 183), new TestObject("X", 176),
                new TestObject("A", 192)));

        Comparator<TestObject> comparator = Comparator.comparing(TestObject::getHeight);

        BiConsumer<TestObject, TestObject> biConsumer = (o1, o2) -> {
            System.out.println("Минимальный челик: " + o1);
            System.out.println("Максимальный челик: " + o2);
        };

        MinMaxMethod.findMinMax(testObjects.stream(), comparator, biConsumer);

        List<Integer> numverslist = List.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        EvenNumbersMethod.toReturnEvenNumbers(numverslist);

        List<Integer> emptyList = new ArrayList<>();
        EvenNumbersMethod.toReturnEvenNumbers(emptyList);

    }


}