package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordCounterTest {
    private final String sentence = "I love Java... although Java is quite hard to learn!";

    @Test
    void countJavaWordTest() {
        Assertions.assertEquals(2, Main.countWords(sentence).get("Java"));
    }

    @Test
    void countWordsTest1() {
        Assertions.assertEquals(1, Main.countWords(sentence).get("learn"));
    }

    @Test
    void emptyStringTest() {
        Assertions.assertNull(Main.countWords("").get("abc"));
    }

    @Test
    void nullStringTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Main.countWords(null));
    }

    @Test
    void multipleSpacesTest() {
        Assertions.assertNull(Main.countWords("a  b").get(""));
    }

    @Test
    void punctuationAbsenceTest() {
        Assertions.assertEquals(1, Main.countWords(sentence).get("learn"));
    }
}