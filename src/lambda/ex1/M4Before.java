package lambda.ex1;

import lambda.MyFunction;

import java.io.IOException;

public class M4Before {

    public static void main(String[] args) throws IOException {

        MyFunction add = getOperation("add");
        System.out.println(add.apply(1, 2));

        MyFunction sub = getOperation("sub");
        System.out.println(sub.apply(3, 2));
    }

    public static MyFunction getOperation(String operator) throws IOException {

        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }
}
