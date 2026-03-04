package lambda.lambda3;

import java.util.function.Function;

public class TargetType2 {

    public static void main(String[] args) {

        // 자바가 기본으로 제공하는 Function 사용
        Function<String, String> upperCase = String::toUpperCase;
        String result1 = upperCase.apply("hello");

        Function<Integer, Integer> square = n -> n * n;
        Integer result2 = square.apply(3);
        System.out.println("result2 = " + result2);

    }
}
