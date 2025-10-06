package lambda.lambda1;

public class LambdaSimple4 {

    public static void main(String[] args) {
        MyCall call1 = (int value) -> value * 2;
        MyCall call2 = (value) -> value * 2; // 타입 추론
        MyCall call3 = value -> value * 2; // 괄호 생략. 매개변수 1개일때

        int call = call3.call(4);
        System.out.println("call = " + call);

    }

    @FunctionalInterface
    interface MyCall {
        int call(int value);
    }
}
