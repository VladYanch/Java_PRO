import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Ivan", 22),
                new Person("Anna", 16),
                new Person("Kolya", 19),
                new Person("Nina", 14),
                new Person("Vasya", 14)
        );
        list.stream().filter(p -> p.getAge() >= 18)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        System.out.println("-".repeat(50));

        list.stream()
                .collect(Collectors.groupingBy(Person::getAge))
                .entrySet().forEach(System.out::println);
        System.out.println("-".repeat(50));
//17    Дан список чисел. Необходимо найти первое четное число.
        List<Integer> listInt = List.of( 3, 7, 9, 4, 2);

        int num = listInt.stream().filter(n-> n % 2 == 0).findFirst().get();
        System.out.println(num);

        System.out.println("-".repeat(50));
        listInt.stream().filter(n-> n % 2 == 0).limit(1).forEach(System.out::println);

        // Дан список строк. Необходимо объединить их в одну строку, разделенную запятой. //Collectors.joining()

        List<String> list1 = List.of("A", "B", "C", "D");

        String res = list1.stream().reduce((a, b) -> a + "," + b).get();
        System.out.println(res);

        res = list1.stream().collect(Collectors.joining(","));
        System.out.println(res);

        //Дан список слов. Необходимо найти самое длинное слово.
        List<String> stringList = List.of("a", "abc", "ab", "abcde", "abcd");

        String longest = stringList.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .findFirst()
                .get();
        System.out.println(longest);
    }
}


//    Дан список объектов Person. Необходимо сгруппировать их по возрасту и вывести результат.
//    Дан список объектов Person. Необходимо отфильтровать только совершеннолетних людей, отсортировать по имени и вывести результат.
@Getter
@ToString
@AllArgsConstructor
class Person {
        String name;
        int age;
}