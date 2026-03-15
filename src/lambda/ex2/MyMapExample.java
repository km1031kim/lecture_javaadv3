package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MyMapExample {

    public static List<Integer> filter(List<Integer> list, MyPredTwo myPredicate) {

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer val : list) {

            if (myPredicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(-2, -1, 1, 2, 3);
        System.out.println("numbers = " + numbers);

        // 음수만
        filter(numbers, value -> value < 0);


        // 양수만
        filter(numbers, value -> value > 0);


    }
}
