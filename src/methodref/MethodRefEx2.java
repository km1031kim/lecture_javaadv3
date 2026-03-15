package methodref;

import lambda.lambda5.mystream.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefEx2 {

    public static void main(String[] args) {
        // 1. 정적 메서드 참조
        Function<String, String> staticMethod1 = Person::greetingWithName;
        String kim = staticMethod1.apply("kim");
        System.out.println("kim = " + kim);

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("kim");
        Function<Integer, String> instanceMethod1 = person::introduceWithNumber;
        String result1 = instanceMethod1.apply(123);
        System.out.println("result1 = " + result1);

        // 3. 생성자 참조
        Function<String, Person> newPerson1 = Person::new;
        Person person1 = newPerson1.apply("back");
        System.out.println("person1 = " + person1);


    }
}
