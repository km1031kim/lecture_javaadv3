package roleback.lambda.ex1;

import lambda.ex2.StringFunction;

public class Ex4Main {
    public static void main(String[] args) {
        StringFunction abc = buildGreeter("hello");
        String result = abc.apply("aaa");
        System.out.println("result = " + result);

    }

    public static StringFunction buildGreeter(String greeting) {
        return s -> s + greeting;
    }
}
