package com.kolesnikov.jde.task2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AnagramsQTest {

    @Test
    public void sortList() throws Exception {
        ArrayList<ArrayList<String>> testArrayRes = new ArrayList<ArrayList<String>>();
        testArrayRes.add(new ArrayList<String>());
        testArrayRes.get(0).add("eat");
        testArrayRes.get(0).add("tea");
        testArrayRes.get(0).add("ate");
        testArrayRes.add(new ArrayList<String>());
        testArrayRes.get(1).add("tan");
        testArrayRes.get(1).add("nat");
        testArrayRes.add(new ArrayList<String>());
        testArrayRes.get(2).add("bat");
        ArrayList<String> testArrayGiven = new ArrayList<String>();
        testArrayGiven.add("eat");
        testArrayGiven.add("tea");
        testArrayGiven.add("tan");
        testArrayGiven.add("ate");
        testArrayGiven.add("nat");
        testArrayGiven.add("bat");
        assertEquals(testArrayRes, new AnagramsQ().sortList(testArrayGiven));
    }
}