package roleback.lambda.ex1;

import lambda.ex3_re.MyTransformer;

public class Ex5Main {
    public static void main(String[] args) {
        MyTransformer toUpper = s -> s.toUpperCase();
        MyTransformer addDeco = s -> "***" + s + "***";

        MyTransformer compose = compose(toUpper, addDeco);
        String hello = compose.transform("hello");
        System.out.println(hello);
    }

    public static MyTransformer compose(MyTransformer f1, MyTransformer f2) {
        return (s) -> f2.transform(f1.transform(s));
    }
}
