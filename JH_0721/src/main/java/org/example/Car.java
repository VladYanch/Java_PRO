package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    Mark mark;
    String color;
    int maxSpeed;
    boolean sport;

    public Car(Mark mark, String color, int maxSpeed, boolean sport) {
        this.color = color;
        this.mark = mark;
        this.maxSpeed = maxSpeed;
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", mark=" + mark +
                ", maxSpeed=" + maxSpeed +
                ", sport=" + sport +
                '}';
    }
}

// Написать класс машина у которой будут поля цвет, булеан-спортивная или нет, энам марка и инт максимальная скорость
