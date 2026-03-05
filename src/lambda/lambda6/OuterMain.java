package lambda.lambda6;

public class OuterMain {
    private String message = "외부 클래스";

    public void execute() {
        Runnable anonymous = new Runnable() {
            private String message = "익명 클래스";

            @Override
            public void run() {
                // 익명 클래스에서의 this는 익명 클래스의 인스턴스를 가리킴
                System.out.println("익명 클래스 this = " + this);
                System.out.println("익명 클래스 this.class = " + this.getClass());
                System.out.println("익명 클래스 this.message = " + this.message);
            }
        };


        Runnable lambda = () -> {
            // 람다에서의 this 는 람다가 선언된 클래스의 인스턴스(즉 외부 클래스)를 가리킴
            // 람다는 필드를 선언할 수 없음. 함수 바디임.
            System.out.println("람다 this = " + this);
            System.out.println("람다 클래스 this.class = " + this.getClass());
            System.out.println("람다 클래스 this.message = " + this.message);
        };

        anonymous.run();
        lambda.run();
    }

    public static void main(String[] args) {
        OuterMain outerMain = new OuterMain();
        System.out.println("외부 클래스 : " + outerMain);
        outerMain.execute();
    }
}
