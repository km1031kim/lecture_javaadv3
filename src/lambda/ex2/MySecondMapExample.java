package lambda.ex2;


import java.util.ArrayList;
import java.util.List;

public class MySecondMapExample {

    public static List<String> map(List<String> list, StringFunction func) {
        List<String> result = new ArrayList<>();

        for (String var : list) {
            result.add(func.apply(var));
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");


        // 1. 대문자 반환
        List<String> toUpper = map(words, String::toUpperCase);

        // 2. 앞뒤에 *** 붙이기
        List<String> stars = map(words, s -> "***" + s + "***");


    }
}
