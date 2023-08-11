package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        String sentence = "I love Java, although Java is quite hard to learn.";
//        System.out.println(countWords(sentence));

        Calc calc = new Calc();
        for (int i = 0; i < 2; i++) {
            calc.calcGet();
        }

    }


    public static Map<String, Integer> countWords(String sentence) {
        if(sentence==null){
            throw new IllegalArgumentException();
        }
        return Arrays.stream(sentence.split("[\\s\\p{Punct}]+"))
                .collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
    }
}