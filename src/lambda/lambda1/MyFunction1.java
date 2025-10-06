package lambda.lambda1;

import lambda.MyFunction;

public class MyFunction1 {

    public static void main(String[] args) {
        MyFunction myFunction = new MyFunction(){

            @Override
            public int apply(int a, int b) {
                return 0;
            }
        };


        int apply = myFunction.apply(1, 2);
        System.out.println("apply = " + apply);

    }
}
