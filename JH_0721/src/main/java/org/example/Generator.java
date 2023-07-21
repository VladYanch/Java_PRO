package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    public List<Developer> genDev(int num){
        List<Developer> developerList = new ArrayList<>(num);

        return developerList;
    }

    public Car genCar(Car car){
        Mark mark;
        Random random = new Random();
        int i = random.nextInt();
        return car;
    }
}

// Написать класс Генератор которые генерирует Девелоперов и Машины
// у генератора будут два метода которые будут генерировать машины и девелоперов
// в зависимости от количества которые вы передадите в параметры
// Вам в помощ библиотека faker для генерации любых имен, фамилий итд