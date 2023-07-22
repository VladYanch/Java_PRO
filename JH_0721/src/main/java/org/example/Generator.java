package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;

public class Generator {

    static Faker faker = new Faker();
    static Random random = new Random();

    private static int generateMaxSpeed(){
        return random.nextInt(220, 380);
    }


    public static String generateColor(){
        return faker.color().name();
    }

    public static Mark generateMark(){
        Mark[] mark = Mark.values();
        return mark[random.nextInt(mark.length)];
    }

    public static Car generateCar() {
        int speed = generateMaxSpeed();
        boolean sport = speed > 280;
        return new Car(
                generateMark(),
                generateColor(),
                speed,
                sport
                );
    }
    public static char generateGender(){
            char[] gender = {'m', 'f'};
            return gender[random.nextInt(gender.length)];
        }
    public static List<Developer> generateDeveloper(int num) {
        List<Developer> developerList = new ArrayList<>(num);
        for (int i = 0; i < num ; i++) {
            developerList.add(new Developer(
                    faker.name().firstName(),
                    faker.name().lastName(),
                    random.nextInt(18,67),
                    random.nextInt(3000, 8000),
                    generateGender(),
                    generateCar()
            ));
        }
        return developerList;
    }
}

// Написать класс Генератор, который генерирует Девелоперов и Машины
// у генератора будут два метода, которые будут генерировать машины и Девелоперов
// в зависимости от количества которые вы передадите в параметры
// Вам в помощь библиотека faker для генерации любых имен, фамилий итд