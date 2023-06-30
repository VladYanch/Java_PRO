import java.util.List;

public class OneQueue<T> {
    // Пример использования:
// OneQueue<Integer> q = new OneQueue<>();
// q.add(1); соддержит элемент 1
// q.add(2) удаляет 1 и содержит 2
// q.get() возвращает 2
// q.add(1).add(2) и после этого q.get() в итоге содержит 2
    private T tElem;

    public OneQueue<T> add(T el) {
       this.tElem = el;
       return this;
    }

    public T get() {
        return tElem;
    }
}
