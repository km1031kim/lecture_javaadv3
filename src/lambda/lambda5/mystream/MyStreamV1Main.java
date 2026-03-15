package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV1Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 짝수만남기고 남은 값의 2배를 반환

        returnValue(numbers);
        methodChain(numbers);
    }

    private static void methodChain(List<Integer> numbers) {
        List<Integer> result = new MyStreamV1(numbers)
                .filter(n1 -> n1 % 2 == 0)
                .map(n -> n * 2)
                .toList();

    }

    private static void returnValue(List<Integer> numbers) {
        List<Integer> result = new MyStreamV1(numbers).filter(n1 -> n1 % 2 == 0).map(n -> n * 2).toList();
    }
}
