package methodref;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRefEx5 {
    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("KIm"), new Person("Park"), new Person("Lee"));


        List<String> result1 = MyStreamV3.of(personList)
                .map(Person::introduce)
                .map(String::toUpperCase)
                .toList();

        List<String> result2 = MyStreamV3.of(personList)
                .map(Person::introduce)
                .map(String::toUpperCase)
                .toList();
    }

    static List<String> mapPersonToString(List<Person> personList, Function<Person, String> fun) {
        List<String> result = new ArrayList<>();
        for (Person p : personList) {
            result.add(fun.apply(p));
        }
        return result;
    }

    static List<String> mapStringToString(List<String> strings, Function<String, String> fun) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            result.add(fun.apply(s));
        }
        return result;
    }
}
