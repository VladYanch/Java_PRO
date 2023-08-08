package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Reports {

    public static List<Developer> findAllManSportCar(List<Developer> list) {
        return list.stream()
                .filter(m -> m.gender.equals('m') && m.car.isSport())
                .toList();
    }

    public static Map<Character, List<Developer>>
    groupingByGender(List<Developer> list) {
        Map<Character, List<Developer>> map = list.stream()
                .collect(Collectors.groupingBy(Developer::getGender));
        return map;
    }

    public static Map<Developer, Integer> mapDeveloperBySpeed(List<Developer> list) {
        Map<Developer, Integer> map = list.stream()
                .collect(Collectors.toMap(developer-> developer, developer -> developer.car.maxSpeed));
        return map;
    }

    public static void writeToFile(List<Developer> list){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("report.txt"))) {
            for (Developer elem : list) {
                writer.write(elem.getName() +
                        "-[auto: " + elem.getCar().getMark() +
                        ", salary: " + elem.getSalary() + "]" + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Написать класс Обработчик, который будет:
// —проходится по листу девелоперов и выводить всех мужчин у которых спортивная машина
// —группировать по полу все машины, т.е. у мужчин такие, у женщин такие
// —Переводить в мапу ключ-девелопер а значение максимальная скоросьть авто
// —записывать в текстовый файл всех девелоперов в формате : Jonn-[auto: BMW ::: salary: 12345] в столбик.
// Т.е в файле нужна только эта инфа
