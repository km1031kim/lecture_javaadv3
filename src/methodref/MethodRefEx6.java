package methodref;

import java.util.List;
import java.util.function.BiFunction;


// 매개변수 추가
public class MethodRefEx6 {
    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("KIm"), new Person("Park"), new Person("Lee"));

        //4.임의 객체의 메서드 인스턴스 참조(특정 타입의)
        Person person = new Person("Kim");
        BiFunction<Person, Integer, String> fun1 = (Person p, Integer number) -> p.introduceWithNumber(number);

        System.out.println(fun1.apply(person, 11));

        // 메서드 참조, 타입이 첫 번째 매개변수가 됨, 그리고 첫 번째 매개변수의 메서드를 호출
        // 나머지는 순서대로 매개변수에 전달
        BiFunction<Person, Integer, String> fun2 = Person::introduceWithNumber;
        System.out.println(fun2.apply(person, 12));


    }
}
