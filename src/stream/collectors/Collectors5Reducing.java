package stream.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class Collectors5Reducing {
    public static void main(String[] args) {
        List<String> naems = List.of("a", "b", "c", "d");

        // 컬렉션의 리듀싱은 주로 다운 스트림에 활용
        // 모든 주석을 하나의 문자열로 이어 붙이기
        String joined1 = naems.stream()
                .collect(Collectors.reducing(
                        (s1, s2) -> s1 + ", " + s2
                )).get(); // a, b 하고, 하나씩 다음다음씩

        String joined2 = naems.stream()
                .reduce((s1, s2) -> s1 + "," + s2).get();
        System.out.println("joined2 = " + joined2);

        // 문자열 전용 기능. joining 근데 안씀.
        String joined3 = naems.stream()
                .collect(Collectors.joining(","));
        System.out.println("joined3 = " + joined3);

        //
        String join = String.join(",", "b", "c", "d");
        System.out.println("join = " + join);


    }
}
