package lambda.lambda4;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        };

        System.out.println("predicate1.test(10) = " + predicate1.test(10));

        Predicate<Integer> predicate2 = (value) -> value % 2 == 0;
        boolean test = predicate2.test(123);
        System.out.println("test = " + test);

        Function<Integer, Boolean> function = (value) -> value % 2 == 0;
        Boolean apply = function.apply(123);
        System.out.println("apply = " + apply);


    }
}
