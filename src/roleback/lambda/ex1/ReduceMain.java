package roleback.lambda.ex1;

import java.util.List;

public class ReduceMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        int sumResult = reduce(list, 0, (a, b) -> a + b);
        int multiResult = reduce(list, 1, (a, b) -> a * b);
        System.out.println("sumResult = " + sumResult);
        System.out.println("multiResult = " + multiResult);
    }

    static int reduce(List<Integer> list, int initial, MyReducer reducer) {
        // 초기값이 있고
        int tmp = initial;
        for (Integer i : list) {
            tmp = reducer.reduce(tmp, i);
        }
        return tmp;
    }
}
