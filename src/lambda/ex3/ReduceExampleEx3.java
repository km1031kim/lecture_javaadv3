package lambda.ex3;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceExampleEx3 {

    static int reduce(List<Integer> list, int initial, BinaryOperator<Integer> reducer) {

        for (Integer val : list) {
            initial = reducer.apply(initial, val);
        }
        return initial;
    }

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4);
        int sum = reduce(list, 0, (a, b) -> a + b);
        int mul = reduce(list, 1, (a, b) -> a * b);

        System.out.println("sum = " + sum);
        System.out.println("mul = " + mul);
    }
}
