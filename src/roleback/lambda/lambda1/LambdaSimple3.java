package roleback.lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple3 {
    public static void main(String[] args) {
        MyFunction myFunction = (int a, int b) -> a + b;

        // 타입 추론. 랃마는 타입 생략 가능.. 어차피 메서드 하나니까
        MyFunction myFunction2 = (a, b) -> a + b;
        int apply = myFunction2.apply(2, 3);
    }
}
