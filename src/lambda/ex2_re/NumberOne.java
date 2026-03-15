package lambda.ex2_re;

import java.util.ArrayList;
import java.util.List;

public class NumberOne {

    static List<Integer> filter(List<Integer> list, MyPredicate predicate) {

        List<Integer> result = new ArrayList<>();
        for (int val : list) {
            if(predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, -2, 3, 5, -10, 7, 44, 20, 16);

        List<Integer> negative = filter(numbers, (value) -> value < 0);

        List<Integer> evens = filter(numbers, (value)  -> value % 2 == 0);

        System.out.println(negative);
        System.out.println(evens);
    }
}
