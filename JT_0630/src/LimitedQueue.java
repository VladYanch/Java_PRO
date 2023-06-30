import java.util.ArrayDeque;
import java.util.Queue;

public class LimitedQueue <T> {
    private final int capasity;
    private Queue<T> queue;

    public LimitedQueue(int capasity) {
        this.capasity = capasity;
        this.queue = new ArrayDeque<>(capasity);
    }

    public LimitedQueue<T> add(T el) {
        if (capasity == queue.size()) {
            queue.poll();
            queue.add(el);
            return this;

        } else {
            queue.add(el);
            return this;
        }
    }

    public T peek() {
        return queue.peek();
    }
}

