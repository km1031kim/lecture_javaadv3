package lambda.ex3_re;

public class ComposeExample {


    static MyTransformer compose(MyTransformer func1, MyTransformer func2) {
        return (s) -> func2.transform(func1.transform(s));
    }


    public static void main(String[] args) {
        MyTransformer toUpper = s -> s.toUpperCase();
        MyTransformer addDeco = s -> "**" + s + "**";

        MyTransformer composeFunc = compose(toUpper, addDeco);
        System.out.println(composeFunc.transform("hello"));

    }
}
