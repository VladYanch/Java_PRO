package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OrderProcessor {
    private List<Order> orders;

    public void addOrder(Order order){
        if (order == null) {
            throw new IllegalArgumentException();
        }
        orders.add(order);
    }

    public double calculateTotalRevenue() {
        return orders.stream()
                .mapToDouble(Order::calculateTotalPrice)
                .sum();
    }

    public List<Order> getExpiredOrders() {
        return orders.stream()
                .filter(Order::isOrderExpired)
                .toList();
    }

}

//OrderProcessor:
//        Поля:
//        List<Order> orders
//        Методы:
//
//        Конструктор без параметров.
//        void addOrder(Order order) - добавляет заказ в список заказов.
//        double calculateTotalRevenue() - вычисляет общую выручку от всех заказов.
//        List<Order> getExpiredOrders() - возвращает список заказов, у которых истекла дата.
