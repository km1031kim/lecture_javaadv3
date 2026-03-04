package lambda.ex2_re;

import java.util.ArrayList;
import java.util.List;

public class MyMap {
    static List<String> map(List<String> list, MyFunction func) {

        List<String> result = new ArrayList<>();
        for (String val : list) {
            result.add(func.apply(val));
        }
        return result;
    }

    public static void main(String[] args) {

        List<String> original = List.of("hello", "java", "lambda");

        List<String> uppers = map(original, (s) -> s.toUpperCase());
        List<String> withStars = map(original, (s) -> "***" + s + "***");

        System.out.println("uppers = " + uppers);
        System.out.println("withStars = " + withStars);
        }
    }

