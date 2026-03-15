package lambda.lambda4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Operator {
    public static void main(String[] args) {
        //UnaryOperator
        Function<Integer, Integer> square = s -> s * s;
        UnaryOperator<Integer> square2 = x -> x * x;
        square.apply(5);
        square2.apply(1);

        // 의도 + 코드 감소
        BiFunction<Integer, Integer, Integer> addition1 = (a, b) -> a + b;
        BinaryOperator<Integer> addition2 = (a, b) -> a + b;

        System.out.println(addition1.apply(1, 2));
        System.out.println(addition2.apply(1, 2));
    }
}
