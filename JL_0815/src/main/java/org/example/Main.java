package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders;
        Product product1 = new Product("Banana", 1.0, 3, "obst");
        Product product2 = new Product("Beer", 2.0,8, "getrenk");
        List<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        Order order = new Order(1,new Person("Ben",22,"rew","ben@sda.net"),list, LocalDate.now());
        System.out.println(order.calculateTotalPrice());
    }
}