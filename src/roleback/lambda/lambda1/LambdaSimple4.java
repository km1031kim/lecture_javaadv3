package roleback.lambda.lambda1;

public class LambdaSimple4 {

    public static void main(String[] args) {
        MyCall call1 = (int value) -> {
            return value * 2;
        };

        MyCall call2 = (value) -> value * 2;

        // 매개변수가 한개라면 매개변수 괄호 생략 가능.
        MyCall call3 = value -> value * 2;
    }

    interface MyCall {
        int call(int value);
    }
}
