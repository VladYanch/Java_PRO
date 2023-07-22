package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Developer {
    String name;
    String surname;
    int age;
    int salary;
    Character gender;
    Car car;

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", car=" + car.toString() +
                '}';
    }
}

// Написать класс Девелопер у которого будет имя, фамилия , возраст, зарплата, чар- пол и машина