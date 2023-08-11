package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Calc {
    private Double a;
    private Double b;

    private String operation;
    private Double result;

    public void calcGet() {
        Scanner scanner = new Scanner(System.in);
        String[] operationArr = {"+","-","*","/"};
        String operations = "+-*/";
        System.out.println("Input 1 number: ");
        a = scanner.nextDouble();
        System.out.println("Input operation: ");
        operation = scanner.next();
        while (!operations.contains(operation)) {
            System.out.println("Input correct operation from: +,-,*,/");
            operation = scanner.next();
        }
        System.out.println("Input 2 number: ");
        b = scanner.nextDouble();

        if (operation=="/" && b == 0) throw new IllegalArgumentException();

        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                result = (double) 0;
                break;
        }
        System.out.println("Result is: " + a + " " + operation + " " + b + " = " + result);
        System.out.println("-".repeat(50));
    }
}

// Написать калькулятор, который принимает два числа и операцию из входного потока и
// выводит результат на экран. Протестировать.