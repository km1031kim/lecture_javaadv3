package lambda.start;

import java.util.Random;

public class Dice implements Procedure {
    @Override
    public void run() {
        // 코드 조각 시작
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 = " + randomValue);
        // 코드 조각 종료
    }
}
