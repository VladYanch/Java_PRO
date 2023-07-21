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
}

// Написать класс Девелопер у которого будет имя, фамилия , возраст, зарплата, чар- пол и машина