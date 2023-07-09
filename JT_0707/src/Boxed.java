import java.util.stream.IntStream;

public class Boxed {
    public static void main(String[] args) {
        IntStream.concat(
                        IntStream.range(2, 5),
                        IntStream.range(0, 4))
                .distinct()
                .forEach(System.out::println);

        int sum = IntStream.of(2, 4, 6, 8)
                .reduce(5, (acc, x) -> acc + x);
        System.out.println(sum);
// sum: 25

        int product = IntStream.range(0, 10)
                .filter(x -> x++ % 4 == 0)
                .reduce((acc, x) -> acc * x)
                .getAsInt();
        System.out.println(product);

        int num = 100;
        System.out.println(num);
        System.out.println(process(num));
        System.out.println(num);
        num = process(num);
        System.out.println(num);
    }

    public static int process(Integer num) {
        System.out.println("Inside = " + num);
        num = 2;
        System.out.println("Inside = " + num);
        return num;
    }
}
