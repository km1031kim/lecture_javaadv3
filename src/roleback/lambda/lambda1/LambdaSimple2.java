package roleback.lambda.lambda1;

import lambda.start.Procedure;

public class LambdaSimple2 {

    public static void main(String[] args) {

        // 단일 표현식은 중괄호 생략 가능
        Procedure procedure = () ->
                System.out.println("hello lambda");

        procedure.run();
    }

}
