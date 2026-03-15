package roleback.lambda.sample;

import lambda.MyFunction;
import lambda.start.Procedure;

import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        MyFunction asd = getOperation("asd");
        System.out.println("asd.apply(1, 2) = " + asd.apply(1, 2));

    }

    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            default:
                return (a, b) -> 0;
        }
    }

}
