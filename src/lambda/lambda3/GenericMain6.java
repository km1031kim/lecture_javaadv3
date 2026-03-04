package lambda.lambda3;

public class GenericMain6 {

    public static void main(String[] args) {
        GenericFunction<String, String> toUpperCase = String::toUpperCase;
        GenericFunction<String, Integer> stringLength = String::length;
        GenericFunction<Integer, Integer> square = x -> x * x;
        GenericFunction<Integer, Boolean> isEven = num -> num % 2 == 0;
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T t);
    }
}
