package lambda.lambda3;

public class GenericMain3 {

    public static void main(String[] args) {

        ObjectFunction objectFunction = new ObjectFunction() {
            @Override
            public Object apply(Object s) {
                return ((String) s).toUpperCase();
            }
        };
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }
}
