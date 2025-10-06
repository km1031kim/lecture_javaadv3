package lambda.ex2;


import java.util.ArrayList;
import java.util.List;

public class MapExample {

    public static List<String> map(List<String> list, StringFunction func) {
        // 코드 작성
        ArrayList<String> result = new ArrayList<>();

        for (String var : list) {
            result.add(func.apply(var));
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트 : " + words);

        // 1. 대문자 변환
        List<String> uppers = map(words, String::toUpperCase);
        System.out.println("uppers = " + uppers);


        // 2.앞뒤에 *** 붙이기
        List<String> stars = map(words, (String s) -> "***" + s + "***");
        System.out.println("stars = " + stars);


    }
}
