package org.example;

public class Task3 extends Thread{
        public static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Another thread");
        });
        t.start(); //до start тоже ничего нельзя писать
//        Thread.sleep(0,1);
            flag = false;
            
        System.out.println("Main thread");
        t.join();
    }

// Задача 3:
// Рассмотрим такой код:


// Как можно его изменить таким образом, чтобы гарантированно выводить сообщение на печать из потока до того,
// как будет напечатано сообщение из Main треда? Операцию "t.join()" нельзя переносить куда-либо.
}
