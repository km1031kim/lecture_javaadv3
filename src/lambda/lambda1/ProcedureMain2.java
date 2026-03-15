package lambda.lambda1;

import lambda.start.Procedure;

public class ProcedureMain2 {
    public static void main(String[] args) {

        // 매개변수 -> body
        Procedure procedure =  () -> {
            System.out.println("hello java");
        };

        procedure.run();
    }
}
