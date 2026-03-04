package lambda.lambda4;

import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {
        // 익명 클래스
        Function<String, Integer> function1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println("function1.apply(\"alksjdlaksjd\") = " + function1.apply("alksjdlaksjd"));


        // 랃마
        Function<String, Integer> function2 = String::length;
        System.out.println("function2.apply(\"z,xmcnvzx\") = " + function2.apply("z,xmcnvzx"));

    }
}
