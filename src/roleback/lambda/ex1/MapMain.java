package roleback.lambda.ex1;

import lambda.MyFunction;

import java.util.ArrayList;
import java.util.List;

public class MapMain {
    public static void main(String[] args) {

        List<String> inputList = List.of("hello", "java", "lambda");
        StringFunction func = s -> s.toUpperCase();

        List<String> map = map(inputList, func);
        System.out.println("map = " + map);


        StringFunction star = s -> "***" + s + "***";
        List<String> map1 = map(inputList, star);
        System.out.println("map1 = " + map1);
    }


    static List<String> map(List<String> list, StringFunction func) {
        List<String> result = new ArrayList<>();

        for (String s : list) {
            result.add(func.apply(s));
        }
        return result;
    }


    @FunctionalInterface
    interface StringFunction {
        String apply(String s);
    }
}
