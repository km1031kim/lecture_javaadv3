package methodref;

import java.util.function.Supplier;

public class MethodRefEx1 {

    public static void main(String[] args) {

        // 1. 정적 메서드 참조
        Supplier<String> staticMethod1 = Person::greeting;
        System.out.println("staticMethod1 = " + staticMethod1.get());

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("kim");
        Supplier<String> instanceMethod1 = person::introduce;
        String result1 = instanceMethod1.get();
        System.out.println("result1 = " + result1);

        // 3. 생성자 참조
        Supplier<Person> newPerson1 = Person::new;
        Person person1 = newPerson1.get();


    }
}
