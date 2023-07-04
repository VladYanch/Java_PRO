import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
// Задача 1: Фильтрация чисел больше 5 и вывод в порядке убывания
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result1 = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > 5) {
                result1.add(number);
            }
        }
        result1.sort(Comparator.reverseOrder());
        System.out.println(result1);

        // Задача 2: Преобразование строк в верхний регистр и удаление дубликатов
        List<String> words = Arrays.asList("apple", "banana", "cherry", "Apple", "Banana", "Cherry");
        List<String> result2 = words.stream()
                .map(String::toUpperCase)
                .distinct()
                .toList();
        System.out.println(result2);

        // Задача 3: Вывод квадратов чисел, удовлетворяющих условию четности
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .forEach(System.out::println);

        // Задача 4: Подсчет суммы четных чисел
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = values.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        List<String> words2 = Arrays.asList("apple", "banana", "cherry", "Apple", "Banana", "Cherry");
        System.out.println(findA(words2));

        // Задача 13: Преобразование чисел в квадрат и сортировка в обратном порядке
        List<Integer> numbers13 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> res13 = numbers13.stream()
                .map(el-> el*el)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(res13);

        // Задача 14: Преобразование чисел в двоичный формат и объединение в строку
        List<Integer> numbers14 = Arrays.asList(1, 2, 3, 4, 5);
        String res14 = numbers14.stream()
                .map(el -> Integer.toBinaryString(el))
                .collect(Collectors.joining(" "));
        System.out.println(res14);

        // Задача 15: Фильтрация чисел, кратных 3, и преобразование их в строки
        List<Integer> numbers15 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List <String> res15 = numbers15.stream()
                .filter(el -> el %3 == 0)
                .map(el -> String.valueOf(el))
                .collect(Collectors.toList());
        System.out.println(res15);

        //Задание 16: Преобразование списка строк в список чисел
        List<String> strings16 = Arrays.asList("1", "Inna", "2", "Ann", "3", "4", "5", "6");
        List<Integer> list16 = strings16.stream()
                .filter(s-> s.matches("\\d+"))
                .map(Integer::valueOf)
                .toList();
        System.out.println(list16);

    }


//Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту
//new Person("John", 25)
    //Напишите метод, который принимает список строк и возвращает список строк, содержащих
    // только уникальные символы (т.е. символы, которые не повторяются в строке).
//    Дан список строк. Необходимо найти количество строк, которые содержат заданное подстроку.


    // Задача 5: Преобразование чисел в строки и объединение их с разделителем

    public static String getString(List<Integer> integers) {
        return integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    // Задача 6: Поиск первого четного числа
    public static Integer getFirstPositive(List<Integer> integers) {
        return integers.stream()
                .filter(integer -> integer % 2 == 0)
                .findFirst()
                .orElse(null);
    }

    // Задача 7: Проверка, все ли строки начинаются с буквы "A"
    public static boolean isStartsWithA(List<String> strings) {
        return strings.stream()
                .allMatch(s -> s.toUpperCase().startsWith("A"));
    }

    // Задача 8: Пропуск первых 3 чисел и сумма оставшихся
    public static int getSum(List<Integer> integers) {
        return integers.stream()
                .skip(3)
                .mapToInt(i -> i)
                .sum();
    }

    // Задача 9: Выбор минимального и максимального числа из листа
    public static List<Integer> getMinMax(List<Integer> integers) {
        List<Integer> res = new ArrayList<>(2);
        res.add(integers.stream()
                .min(Comparator.naturalOrder()).orElse(null)
        );
        res.add(integers.stream()
                .max(Comparator.naturalOrder()).orElse(null)
        );
        return res;
    }
    // Задача 10: Группировка слов по длине
    public static Map<Integer,List<String>> getGroupLength(List<String> str) {
        return str.stream()
                .collect(Collectors.groupingBy(String::length));
    }
    // Задача 11: Подсчет среднего значения чисел
    public static double getAvg(List<Integer> integers) {
        return integers.stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0.0);
    }
    // Задача 12: Поиск всех слов, содержащих букву "a"
    public static List<String> findA(List<String> list) {
        return list.stream()
                .filter(s-> s.contains("a") || s.contains("A") )
                .toList();
    }


}


// Задача 13: Преобразование чисел в квадрат и сортировка в обратном порядке
// Задача 14: Преобразование чисел в двоичный формат и объединение в строку
// Задача 15: Фильтрация чисел, кратных 3, и преобразование их в строки