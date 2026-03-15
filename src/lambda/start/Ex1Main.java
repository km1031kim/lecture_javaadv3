package lambda.start;

import java.util.Random;

public class Ex1Main {
    public static void helloDice(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run();

        long endNs = System.nanoTime();
        System.out.println("실행 시간 : " + (endNs - startNs) + " ns");

    }

    public static void helloSum(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run();
        // 코드 조각 종료
        long endNs = System.nanoTime();
        System.out.println("실행 시간 : " + (endNs - startNs) + " ns");
    }



    public static void main(String[] args) {
        helloDice(new Procedure() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });

        helloSum(new Procedure() {
            @Override
            public void run() {
                for (int i = 0; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}
