package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TE1Test {

    public static final TE1 te = new TE1();
    public static final int A = 10;
    public static final int B = 5;
    @Test
    void getSumTest() {
        Assertions.assertEquals(15,te.getSum(A,B));
    }

    @Test
    void getDividePositiveTest() {
        Assertions.assertEquals(2,te.getDivide(A,B));
    }

    @Test
    void getDivideByZeroTest() {
        int c = 0;
        Assertions.assertThrows(ArithmeticException.class,() -> te.getDivide(A,c));
    }
}