package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ReportsTest {
    private static Reports reports = new Reports();

    @BeforeEach
    void setUp() {
        List<Developer> developersActualList = new ArrayList<>();
        developersActualList.add(new Developer("Name 1", "Lastname 1",
                25, 15000, 'M', new Car(Mark.BMW, "red",  270 ,false)));
        developersActualList.add(new Developer("Name 2", "Lastname 2",
                35, 13000, 'F', new Car(Mark.BMW, "black",  270 ,true)));
    }
    @Test
    void groupingByGenderTest() {
    Map<Character, List<Developer>> expectedMap = new HashMap<>();
    List<Developer> listM = new ArrayList<>();
    List<Developer> listF = new ArrayList<>();
    listM.add((new Developer("Name 1", "Lastname 1",
            25, 15000, 'M', new Car(Mark.BMW, "red",  270 ,false))));
    listF.add((new Developer("Name 1", "Lastname 1",
            25, 15000, 'F', new Car(Mark.BMW, "red",  270 ,false))));

    expectedMap.put('M',listM);
    expectedMap.put('F',listF);
//    Assertions.assertEquals();
    }
}