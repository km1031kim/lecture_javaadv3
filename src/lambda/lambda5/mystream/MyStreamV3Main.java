package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV3Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 90),
                new Student("Berry", 50),
                new Student("Tomato", 100)
        );

        List<String> result1 = ex1(students);

        // 점수가 80점 이상, 이름이 5글자인 학생의 이름
        List<String> result2 = ex2(students);
    }

    private static List<String> ex1(List<Student> students) {
        return MyStreamV3.of(students).filter(s -> s.getScore() % 2 == 0).map(s -> s.getName()).toList();
    }

    private static List<String> ex2(List<Student> students) {
        return MyStreamV3.of(students).filter(s -> s.getScore() >= 80)
                .filter(s -> s.getName().length() == 5)
                .map(s -> s.getName().toUpperCase())
                .toList();

    }

}

