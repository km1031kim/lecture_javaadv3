package lambda.lambda4;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        // 입력x 반환만
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(10);
            }
        };
        Integer integer = supplier.get();
        System.out.println("integer = " + integer);

        // 람다
        Supplier<Integer> supplier2 = () -> new Random().nextInt(10);
    }
}
