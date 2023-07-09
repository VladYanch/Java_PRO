import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Taski {
//    Задача 1: Подсчет количества уникальных четных и нечетных чисел
//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
public static void main(String[] args) {
    List<Integer> numbers3 = Arrays.asList(2, 3, 4, 5, 67, 8, 9, 10, 11, 12, 13, 14, 15);
    System.out.println(simple(numbers3));
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
