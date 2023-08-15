package org.example;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Product implements Comparable<Product>{
    private String name;
    private double price;
    private int quantity;
    private String category;

        public double getTotalPrice() {
            return price*quantity;
        }
        public boolean isAvailable() {
            return quantity>0;
        }

        String getCategory() {
            return category;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }
}

//Product:
//        Поля:
//        String name
//        double price
//        int quantity
//        String category
//        Методы:
//
//        Конструктор с параметрами для инициализации полей.
//        double getTotalPrice() - возвращает общую стоимость продукта (цена * количество).
//        boolean isAvailable() - проверяет, доступен ли продукт для заказа (количество > 0).
//        String getCategory() - возвращает категорию продукта.