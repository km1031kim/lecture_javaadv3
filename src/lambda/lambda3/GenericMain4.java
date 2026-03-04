package lambda.lambda3;

public class GenericMain4 {

    public static void main(String[] args) {

        GenericFunction<String, String> upperCase = String::toUpperCase;
        GenericFunction<Integer, Integer> square = (n) -> n * n;



    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T t);
    }
}
