public class SimpleExchangerExample {
    public static void main(String[] args) {
        SimpleExchanger<String> simpleExchanger = new SimpleExchanger<>();

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1: " + simpleExchanger.exchange(null));
//            System.out.println("Thread1: " + simpleExchanger.exchange("Msg 1"));
        });

        thread1.setName("First");
        thread1.start();

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread2: " + simpleExchanger.exchange("Msg 2"));
        });

        thread1.setName("Second");
        thread2.start();
    }
}