package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Order implements Comparable<Order> {
    private int orderId;
    private Person customer;
    private List<Product> products;
    private LocalDate orderDate;

    public Order() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return orderId;
    }

    public double calculateTotalPrice() {
        return products.stream()
                .mapToDouble(p -> p.getPrice() * p.getQuantity())
                .sum();
    }
    public int getNumberOfProducts() {
        return products.size();
    }

    public boolean isOrderExpired() {
        LocalDate localDate = orderDate.plusDays(10);
        return localDate.equals(java.time.LocalDate.now());
    }

    @Override
    public int compareTo(Order o) {
        return this.orderId - o.orderId;
    }

}

//Order:
//        Поля:
//        int orderId
//        Person customer
//        List<Product> products
//        LocalDate orderDate
//        Методы:
//
//        Конструктор с параметрами для инициализации полей.
//        double calculateTotalPrice() - вычисляет общую стоимость заказа на основе продуктов.
//        int getNumberOfProducts() - возвращает количество продуктов в заказе.
//        boolean isOrderExpired() - проверяет, истекла ли дата заказа.
