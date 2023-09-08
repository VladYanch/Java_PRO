import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException, ExecutionException {
        TypeProcessor typeProcessor = new TypeProcessor(2);

        typeProcessor.configureProcess(Car.class, car -> {
            System.out.println("car = " + Thread.currentThread().getName() + " " + car);
        });

        typeProcessor.configureProcess(Dog.class, dog -> {
            System.out.println("dog = " + Thread.currentThread().getName() + " " + dog);
            //throw new RuntimeException();
        });

        Dog dog = new Dog();
        Car car = new Car();

        Future<Void> taskResult = typeProcessor.runProcessAsync(dog); // запускает задачу асинхронно

        taskResult.get();

        typeProcessor.runSync(car); // запускает задачу в текущем потоке*/

        typeProcessor.serviceShutdown();
        Thread.sleep(2000);
    }
}


//        Вам требуется спроектировать класс, который занимается запуском задач для определенных типов данных.
//        TypeProcessor typeProcessor = new TypeProcessor();
//        typeProcessor.configureProcess(Car.class, car -> {
//        System.out.println(car);
//        });
//        typeProcessor.configureProcess(Dog.class, dog -> {
//        System.out.println(dog);
//        });
//        Dog dog = new Dog();
//        Future<Void> taskResult = typeProccssor.runProcessAsync(dog); // запускает задачу асинхронно
//        Future<Void> taskResult = typeProccssor.runProcessAsync(dog2); // запускает задачу асинхронно
//        taskResult.get();
//        Car car = new Car();
//        typeProcessor.rynProcessSync(car); // запускает задачу в текущем потоке