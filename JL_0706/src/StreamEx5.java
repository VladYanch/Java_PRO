import java.util.Arrays;
import java.util.List;

public class StreamEx5{
    public static void main(String[] args) {
        //todo Владу доделать пример. все комбинации без повторений
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        List<String> stringList = list1.stream()
                .flatMap(i -> list2.stream()
                        .flatMap(j -> list2.stream()
                                .map(k -> "(" + i + ", " + j + ", " + k + ")")))
                .toList();
        System.out.println(stringList);
    }
}