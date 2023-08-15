package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Product product1 = new Product("Banana", 1.0, 3, "obst");
    Product product2 = new Product("Beer", 2.0,8, "getrenk");

    List<Product> list = new ArrayList<>();

    Order order = new Order();

    @BeforeEach
    void setUp(){
        list.clear();
        list.add(product1);
        list.add(product2);
        order = new Order(1,new Person("Ben",22,"rew","ben@sda.net"),list, LocalDate.now());
    }

    @Test
    void calculateTotalPriceTest() {
        double expected = 19.0;
        assertEquals(expected, order.calculateTotalPrice());
    }

    @Test
    void getNumberOfProductsTest() {
        int expected = 2;
        assertEquals(expected, order.getNumberOfProducts());
    }

    @Test
    void isOrderExpiredMinusDaysTest() {
        LocalDate minusDays = order.getOrderDate().minusDays(11);
        Order order1 = new Order(2,new Person("Tom",28,"reeee","tom@sda.net"),list, minusDays);
        assertFalse(order1.isOrderExpired());
    }

    @Test
    void isOrderExpiredPlusDaysTest() {
        LocalDate minusDays = order.getOrderDate().plusDays(15);
        Order order1 = new Order(2,new Person("Tom",28,"reeee","tom@sda.net"),list, minusDays);
        assertFalse(order1.isOrderExpired());
    }
    @Test
    void isOrderExpiredTest() {
        LocalDate minusDays = order.getOrderDate().minusDays(15);
        Order order1 = new Order(2,new Person("Tom",28,"reeee","tom@sda.net"),list, minusDays);
        assertFalse(order1.isOrderExpired());
    }


}