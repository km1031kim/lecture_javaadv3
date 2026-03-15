package roleback.lambda.sample;

public class Example1 {
    public static void main(String[] args) {
        M1After method = (value) -> {
            System.out.println("==== 시작 ===");
            System.out.println(value);
            System.out.println("=== 끝 ====");
        };

        method.greet("굿모닝");
        method.greet("굿점심");
        method.greet("굿밤");

        M1After kgMethod = (value) -> {
            System.out.println(value + "kg");
        };

        kgMethod.greet("11");

    }
}
