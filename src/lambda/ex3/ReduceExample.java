package lambda.ex3;


import java.util.List;

public class ReduceExample {

    // 함수를 인자로 받아, 리스트 요소를 하나로 축약하는 고차 함수.
    public static int reduce(List<Integer> list, int initial, MyReducer reducer) {


        for (Integer i : list) {
            initial =  reducer.reduce(i, initial);
        }

        return initial;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4);

        // 1. 합 구하기
        int add = reduce(numbers, 0, Integer::sum);
        System.out.println("add = " + add);


        // 2. 곱 구하기
        int multiply = reduce(numbers, 1,  (a,  b) -> a * b);

        System.out.println("multiply = " + multiply);


    }
}
