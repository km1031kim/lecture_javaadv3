package lambda.lambda3;

import java.util.function.Function;

public class TargetType3 {

    public static void main(String[] args) {
        // 자바가 기본으로 제공하는 Function 대입
        // 랃다 직접 대입
        Function<Integer, String> functionA = i -> "value = " + i;
        Function<Integer, String> functionB = i -> "value = " + i;

        Function<Integer, String> functionC = functionB;
        System.out.println("functionC.apply(\"20\") = " + functionC.apply(20));

    }
}
