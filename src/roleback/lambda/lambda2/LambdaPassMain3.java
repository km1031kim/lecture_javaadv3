package roleback.lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain3 {

    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        int result = add.apply(1, 2);
        System.out.println("result = " + result);
    }

    // 함수형 인터페이스의 인스턴스를 주고받는 함수 -> 고차 함수다...
    // 람다를 반환하는 메서드
    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }
}
