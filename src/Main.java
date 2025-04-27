import java.util.function.*;

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
    }
}