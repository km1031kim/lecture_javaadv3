package lambda.ex3;

import lambda.MyFunction;

import java.util.Arrays;

public class ComposeExample {

    // 고차 함수. f1, f2 라는 두 함수를 인자로 받아, f1을 먼저 적용, f2를 그 결과에 적용하는 새 함수 반환
    public static MyTransfer compose(MyTransfer f1, MyTransfer f2) {
        return  s ->  f2.transform(f1.transform(s));
    }

    public static void main(String[] args) {

        String a = ";alskjdflkja";

        char[] charArray = a.toCharArray();


        for (char c : charArray) {
            String.valueOf(c).toLowerCase();
        }

        System.out.println("charArray = " + Arrays.toString(charArray));

        // f1, 대문자로 변환
        MyTransfer f1 = String::toUpperCase;

        // f2, 앞뒤에 ** 붙이기
        MyTransfer f2 = s -> "**" + s + "**";

        // 합성, f1 -> f2 순서대로 적용하는 함수
        MyTransfer composeFunc = compose(f1, f2);

        // 실행
        String result = composeFunc.transform("hello");
        System.out.println("result = " + result);
    }
}
