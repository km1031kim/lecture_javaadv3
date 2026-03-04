package lambda.lambda4;

public class RunnableMain {
    public static void main(String[] args) {
        Runnable thread1 = () -> System.out.println(Thread.currentThread() + ": runnable");
   //     thread1.run();

        Thread t1 = new Thread(thread1);
        t1.start();

    }
}
