package stream.operation;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {
    public static void main(String[] args) {
        // 기본형 특화 스트림 생성(IntStream, LongStream, DoubleStream)

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        intStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 범위 생성 메서드 (IntStream, LongStream)
        IntStream range1 = IntStream.range(1, 6);// 1,2,3,4,5
        IntStream range2 = IntStream.rangeClosed(1, 5);// 1,2,3,4,5
        range1.forEach(i -> System.out.print(i + " "));
        range2.forEach(i -> System.out.print(i + " "));

        // 통계 관련 메서드(sum, average, max, min, count)
        int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);

        // average() 평균 값 계신
        double avg = IntStream.range(1, 6)
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);

        // summaryStatistics() : 모든 통계 정보
        IntSummaryStatistics stats = IntStream.range(1, 6)
                .summaryStatistics();
        System.out.println("합계 : " + stats.getSum());
        System.out.println("평균 : " + stats.getAverage());
        System.out.println("최대값 : " +stats.getMax());
        System.out.println("최솟값 : " + stats.getMin());
        System.out.println("stats.getCount() = " + stats.getCount());

        // 2. 타입 변환 메서드
        LongStream longStream = IntStream.range(1, 5).asLongStream();
        DoubleStream doubleStream = IntStream.range(1, 5).asDoubleStream();

        // IntStream -> Stream<Integer>
        Stream<Integer> boxedStream = IntStream.range(1, 5).boxed();

        // 3. 기본형 특화 맵핑
        // int -> long 변환
        LongStream mappedToLong = IntStream.range(1, 5)
                .mapToLong(i -> i * 100);// map 결과를 long으로 반환

        DoubleStream mappedDouble = IntStream.range(1, 5)
                .mapToDouble(i -> i * 100);

        // int -> 객체 변환
        Stream<String> mappedObj = IntStream.range(1, 5)
                .mapToObj(i -> "Number: " + i);

        // 4. 객체 스트림 -> 기본형 특화 스트림으로 매핑
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
//        integerStream.sum() // 없음
        int sum1 = integerStream.mapToInt(i -> i).sum();
        
        
        // 5. 객체 스트림 -> 기본형 특화 스트림으로 맵핑 활요
        int sum2 = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(i -> i)
                .sum();
        System.out.println("sum2 = " + sum2);
    }
}
