import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Annagram {
    public static void main(String[] args) {
        // Дан список слов. Необходимо проверить, содержат ли они одинаковые символы (являются ли анаграммами)
        // и вывести результат.

        List<String> listStr = List.of("Mara", "Kazak", "Abba", "Otto", "Rama");
        System.out.println(isAnagram(listStr));
        List<String> listStr1 = List.of("Mara", "Rama", "Maar");
        System.out.println(isAnagram(listStr1));
    }

    public static boolean isAnagram(List<String> list){
        if (list.isEmpty()){
            return false;
        }
        Map<Character, Integer> firstMap = stringToMap(list.get(0));
        return list.stream()
                .map(el -> stringToMap(el))
                .allMatch(el -> el.equals(firstMap));
    }

    public static Map<Character,Integer> stringToMap(String str){
        return str.chars()
                .mapToObj(i->(char)i)
                .map(Character::toLowerCase)
                .collect(Collectors.toMap(elem -> elem,elem -> 1,Integer::sum));
    }
}