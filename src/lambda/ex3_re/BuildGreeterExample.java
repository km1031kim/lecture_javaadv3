package lambda.ex3_re;

public class BuildGreeterExample {

    static StringFunction buildGreeter(String greeting) {

        return new StringFunction() {
            @Override
            public String apply(String s) {
                return greeting + ", " + s;
            }
        };
    }

    public static void main(String[] args) {

        StringFunction hello = buildGreeter("Hello");
        String aa = hello.apply("aa");
        System.out.println("aa = " + aa);
    }
}
