package lambda.ex3;

@FunctionalInterface
public interface MyReducer {
    // 누적
    int reduce(int a, int b);
}
