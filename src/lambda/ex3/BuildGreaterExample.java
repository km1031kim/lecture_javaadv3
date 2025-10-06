package lambda.ex3;

import lambda.ex2.StringFunction;

public class BuildGreaterExample {

    // 고차 함수, greeting 문자열을 받아 새로운 함수를 반환
    public static StringFunction builderGreater(String greeting) {
        // 코드 작성

        // greeting + , + greeting
        return s ->  greeting + "," + s;
    }

    public static void main(String[] args) {


        StringFunction hello = builderGreater("interface hello");
        String methodHello = hello.apply("method hello");
        System.out.println("methodHello = " + methodHello);
    }
}
