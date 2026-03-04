package roleback.lambda.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, -2, 3, -10, 7);
        System.out.println("numbers = " + numbers);

        filter(numbers, (value) -> value < 0);
        filter(numbers, (value) -> (value % 2 == 0));

    }

    private static void filter(List<Integer> list, MyPredicate predicate) {
        List<Integer> tmp = new ArrayList<>();

        for (Integer i : list) {
            if (predicate.test(i)) {
                tmp.add(i);
            }
        }

        System.out.println(tmp);
    }
}
