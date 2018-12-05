package com.kolesnikov.jde.task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DominElemTest {

    @Test
    public void learnElem() throws Exception {
        int[] testArray1 = {10, 9, 9, 9, 10};
        int[] testArray2 = {3, 2, 3};
        int[] testArray3 = {2, 2, 1, 1, 1, 2, 2};
        assertEquals(9, new DominElem().learnElem(testArray1));
        assertEquals(3, new DominElem().learnElem(testArray2));
        assertEquals(2, new DominElem().learnElem(testArray3));
    }
}