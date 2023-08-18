package _18_08_Summary;

import java.util.ArrayList;
import java.util.List;

// Разделить четные и нечетные числа на два списка

public class StreamTasks {
    private static List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    static OddEven oddEven = new OddEven(numbers);

    public static void main(String[] args) {
        System.out.println("Odd List = " + oddEven.getOddNums());
        System.out.println("Even List = " + oddEven.getEvenNums());
    }
}