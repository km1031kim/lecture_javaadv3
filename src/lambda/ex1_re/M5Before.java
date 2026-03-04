package lambda.ex1_re;

import lambda.MyFunction;

public class M5Before {

    static MyFunction getOperation(String operator) {

        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }
    public static void main(String[] args) {


        MyFunction add = getOperation("add");
        MyFunction sub = getOperation("sub");
        MyFunction xxx = getOperation("xxx");

        int apply = add.apply(1, 2);
        int apply1 = sub.apply(1, 3);
        int apply2 = xxx.apply(3, 2);

        System.out.println(apply);
        System.out.println(apply1);
        System.out.println(apply2);

    }
}
