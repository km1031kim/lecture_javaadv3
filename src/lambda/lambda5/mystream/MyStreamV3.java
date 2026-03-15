package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// static factory 추가
public class MyStreamV3<T> {

    private List<T> integerList;

    private MyStreamV3(List<T> integerList) {
        this.integerList = integerList;
    }

    public static <T> MyStreamV3<T> of(List<T> internalList) {
        return new MyStreamV3<>(internalList);
    }

    public MyStreamV3<T> filter(Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();

        for (T element : integerList) {
            if (predicate.test(element)) {
                filtered.add(element);
            }
        }
        return MyStreamV3.of(filtered);
    }

    public <R> MyStreamV3<R> map(Function<T, R> mapper) {
        List<R> mapped = new ArrayList<>();

        for (T element : integerList) {
            mapped.add(mapper.apply(element));
        }
        return MyStreamV3.of(mapped);
    }

    public List<T> toList() {
        return integerList;
    }

    // 추가
    public void forEach(Consumer<T> consumer) {
        for (T element : integerList) {
            consumer.accept(element);
        }
    }

    public T getFirst() {
        return integerList.getFirst();
    }

}
