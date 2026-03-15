package lambda.ex1;

import lambda.start.Procedure;

import java.util.Arrays;

public class M3Before {

    public static void main(String[] args) {


        measure(() -> Arrays.sort(new int[]{1, 2, 3, 4, 5, 6}));


        measure(() -> {
                int result = 0;
                for (int i = 0; i < 100; i++) {
                    result += i;
                }});


    }

    public static void measure(Procedure procedure) {
        long startTime = System.nanoTime();
        procedure.run();
        long endTime = System.nanoTime();

        System.out.println("수행 시간 : " + (endTime - startTime));

    }
}
