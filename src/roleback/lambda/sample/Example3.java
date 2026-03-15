package roleback.lambda.sample;

import lambda.start.Procedure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Example3 {
    public static void main(String[] args) {

        measure(() -> {
            int sum1 = 0;
            for (int i = 1; i <= 100; i++) {
                sum1 += i;
            }
            System.out.println(sum1);
        });
        measure(() -> {
            int[] array = {1, 2, 3};
            Arrays.sort(array);
        });

    }

    static void measure(Procedure p) {
        long startTime = System.nanoTime();
        p.run();
        long endTime = System.nanoTime();
        System.out.println("실행 시간 : " + (endTime - startTime) + "ns");
    }
}
