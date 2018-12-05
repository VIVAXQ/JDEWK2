package com.kolesnikov.jde.task4;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraySortTest {

    @Test
    public void sortOdd() throws Exception {
        int[] arrayTest1 = {5, 3, 2, 8, 1, 4};
        int[] arrayTest2 = {1, 3, 2, 8, 5, 4};
        assertArrayEquals(arrayTest2, new ArraySort().sortOdd(arrayTest1));
    }
}