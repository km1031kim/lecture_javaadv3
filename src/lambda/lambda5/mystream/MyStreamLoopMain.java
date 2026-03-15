package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamLoopMain {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 90),
                new Student("Berry", 50),
                new Student("Tomato", 100)
        );

        List<String> result = MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();

        // 외부 반복
        for (String s : result) {
            System.out.println("name : " + s);
        }

        // forEach Consumer 를 통한 내부 반복
        MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(Student::getName)
                .forEach(System.out::println);
    }
}

