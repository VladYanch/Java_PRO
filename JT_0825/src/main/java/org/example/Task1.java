package org.example;

import static org.example.Main.flag;

public class Task1 extends Thread {
//    private static volatile boolean flag = true;

//    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        task1.start();
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
////        task1.interrupt();
//        flag = false;
//
//        try {
//            task1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    /*
    // Задача 1:
    // Требуется создать поток, который будет писать сообщение на экран раз в секунду.
    // Поток Main должен стартануть этот поток, подождать 10 секунд, остановить созданный поток и подождать пока
    // он завершится.
     */

    @Override
    public void run() {
        int counter = 1;
        while (flag) {
            System.out.println("Thread work " + counter++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}