package lambda.ex1_re;

import lambda.start.Procedure;

import java.util.Arrays;

public class M3Before {

    public static void measure(Procedure procedure) {
        long startNs = System.nanoTime();
        procedure.run();
        long endNs = System.nanoTime();

        System.out.println("실행 시간 : " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {
        measure(() -> {
                // 1. 익명 클래스로 1부터 N 까지의 합 구하기
                int N = 100;
                long sum = 0;

                for (int i = 0; i <= N; i++) {
                    sum+= i;
                }
                System.out.println("1부터 " + N + " 까지의 합 : " + sum);
        });

        measure(() ->  {
                int[] arr = {4, 3, 2, 1};
                System.out.println("원본 배열 : " + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("배열 정렬 : " + Arrays.toString(arr));
        });
    }
}
