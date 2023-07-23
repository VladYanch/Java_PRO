package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Developer> developers = Generator.generateDeveloper(20);
        System.out.println("-".repeat(100));
        
        System.out.println("SportCar = speed>280");
        System.out.println(Reports.findAllManSportCar(developers));
        System.out.println("-".repeat(100));

        System.out.println(Reports.groupingByGender(developers));
        System.out.println("-".repeat(100));

        System.out.println(Reports.mapDeveloperBySpeed(developers));
        System.out.println("-".repeat(100));

        Reports.writeToFile(developers);
    }

}
