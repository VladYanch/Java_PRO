public class CodingProblems {

// 0. Спроектировать очередь с одним произвольным элементом.
// метод add(elem) добавляет элемент
// метод get() возвращает элемент

// Пример использования:
// OneQueue<Integer> q = new OneQueue<>();
// q.add(1); соддержит элемент 1
// q.add(2) удаляет 1 и содержит 2
// q.get() возвращает 2
// q.add(1).add(2) и после этого q.get() в итоге содержит 2
public static void main(String[] args) {
    OneQueue<String> queueS = new OneQueue<>();
//    System.out.println(queueS.get());
//    queueS.add("Hi");
//    queueS.add("Bye");
//    System.out.println(queueS.get());
//
//    System.out.println(queueS.add("Hello").add("Java").get());
//
//    OneQueue<Integer> queueInt = new OneQueue<>();
//    System.out.println(queueInt.add(1).add(2).get());
//    System.out.println(queueInt.add(1).add(2).add(1).add(5).get());

    LimitedQueue<String> queueL = new LimitedQueue<>(3);
    queueL.add("Good");
    queueL.add("Day");
    queueL.add("World");
    System.out.println(queueL.peek());
    queueL.add("Hello");
    queueL.add("Java");
    System.out.println(queueL.peek());

    }
}
