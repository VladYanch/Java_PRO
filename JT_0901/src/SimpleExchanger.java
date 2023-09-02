public class SimpleExchanger<T> {
    private T message;
    private boolean isFirstCame;
    private boolean isSecondCame;

    public T exchange(T msg) {
        synchronized (this) {
            if (!isFirstCame) {
                message = msg;
                isFirstCame = true;
                try {
                    while (!isSecondCame) {
                        wait();
                    }
                    return message;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                T tmp = message;
                message = msg;
                isSecondCame = true;
                notifyAll();
                return tmp;
            }
        }
    }
}