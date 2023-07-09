import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Taski {
//    Задача 1: Подсчет количества уникальных четных и нечетных чисел
//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
public static void main(String[] args) {
    List<Integer> numbers3 = Arrays.asList(2, 3, 4, 5, 67, 8, 9, 10, 11, 12, 13, 14, 15);
    System.out.println(simple(numbers3));

//    Задача 6: Получение уникальных символов из списка строк
    List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
    System.out.println(
            words.stream()
            .map(s-> Arrays.stream(s.split("")))
            .flatMap(x-> x)
            .distinct()
            .collect(Collectors.joining(", "))
    );

//    Задача 7: Разделение строк на отдельные слова и удаление повторений
    List<String> sentences = Arrays.asList("Hello world", "Java is awesome", "Stream API is powerful");
    System.out.println(
            sentences.stream()
                    .map(s->Arrays.stream(s.split(" ")))
                    .flatMap(x-> x)
                    .distinct()
                    .toList()
    );
//
//    Задача 8: Фильтрация и преобразование строк toUpperCase
    List<String> words3 = Arrays.asList("apple", "banana", "cherry", "date");
    System.out.println(
            words3.stream()
                    .map(s-> s.toUpperCase())
                    .toList()
    );
//
//    Задача 9: Получение среднего значения чисел
    List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    System.out.println(
            numbers4.stream()
                    .mapToInt(s-> s)
                    .average()
                    .getAsDouble()
    );
//
//    Задача 10: Получение списка квадратов чисел
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
    System.out.println(
            numbers5.stream()
                    .map(s-> s*s)
                    .toList()
    );
//    Задача 11: Группировка строк по длине
    List<String> words4 = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
    System.out.println(
            words4.stream()
                    .collect(Collectors.groupingBy(s-> s.length()))
    );
//
//    Задача 12: Проверка, содержатся ли строки в списке
    List<String> words5 =Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
    List<String> searchWords = Arrays.asList("banana", "fig", "date");
    System.out.println(searchWords.stream()
            .flatMap(s -> words5.stream()
            .filter(x-> x.equals(s)))
            .toList()
    );
//    Задача 13: Поиск первой строки, удовлетворяющей условию
    List<String> words6 = Arrays.asList("apple", "banana", "cherry", "date");
    System.out.println(extracted(words6, "cherry"));
//
//    Задача 14: Сокращение списка до указанного размера
    List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println(reduceList(numbers6,4));
    numbers6 = reduceList(numbers6,4);
    System.out.println(numbers6);

//    Задача 15: Объединение двух списков в один
    List<Integer> list1 = Arrays.asList(1, 2, 3);
    List<Integer> list2 = Arrays.asList(4, 5, 6);
    System.out.println(Stream.concat(list1.stream(),list2.stream()).toList());
}

    private static List<Integer> reduceList(List<Integer> list, int num) {
        return list.stream()
                .limit(num).toList();
    }
    private static boolean extracted(List<String> words6, String str) {
        return words6.stream()
                        .dropWhile(s-> !s.equals(str))
                        .findFirst()
                        .isPresent();
    }

    public static Map<Boolean,List<Integer>> simple(List<Integer> list)  {
        return list.stream()
                .collect(Collectors.partitioningBy(n-> isPrime(n)));
    }



        private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
//    Задача 5: Разделение чисел на простые и составные
//    List<Integer> numbers3 = Arrays.asList(2, 3, 4, 5, 67, 8, 9, 10, 11, 12, 13, 14, 15);
//
//    private static boolean isPrime(int n) {
//        if (n < 2) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }


//    public static void uniqueNum(List<Integer> numbers) {
//        Map<Boolean, Long> objectStream = numbers.stream()
//                .distinct()
//                .collect(Collectors.partitioningBy(el -> el % 2 == 0, Collectors.counting()));
//        System.out.println(objectStream);
//        // collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.counting()))
//    }
//
//    // 2. Задача 2: Группировка строк по первым буквам и вывод первых двух из каждой группы
//    public static void uniqueWord(List<String> words) {
//        Map<String, List<String>> objectStream = words.stream()
//                .limit(2)
//                .collect(Collectors.groupingBy(el -> String.valueOf(el.substring(0, 1))));
//        System.out.println(objectStream);
//    }
}
