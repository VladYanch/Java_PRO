package org.example;

public class Main {
    public static volatile boolean flag = true;

    public static void main(String[] args) {

        Task1 task1 = new Task1();
        task1.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        task1.interrupt();
        flag = false;

        try {
            task1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

// Задача 1:
// Требуется создать поток, который будет писать сообщение на экран раз в секунду.
// Поток Main должен стартануть этот поток, подождать 10 секунд, остановить созданный поток и подождать пока
// он завершится.

// * напишите тест, чтобы проверить работу этой задачи.

// Задача 2:
// Требуется создать потокобезопасный класс, который отвечает за счётчик с суммой. Предложите две реализации.
// Методы: increment()/decrement()/getOperationsCount()/getValue()

// Задача 3:
// Рассмотрим такой код:
// Thread t = new Thread(() -> {
//     System.out.println("Another thread");
// });

// t.start(); до start тоже ничего нельзя писать
// System.out.println("Main thread");
// t.join();

// Как можно его изменить таким образом, чтобы гарантированно выводить сообщение на печать из потока до того,
// как будет напечатано сообщение из Main треда? Операцию "t.join()" нельзя переносить куда-либо.